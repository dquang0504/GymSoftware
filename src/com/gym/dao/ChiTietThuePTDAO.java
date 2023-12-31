/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.dao;

import com.gym.db.DBHelper;
import com.gym.entity.ChiTietThuePT;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ChiTietThuePTDAO extends GymSoftwareDAO<ChiTietThuePT, String> {

    final String INSERT_SQL = "INSERT INTO ChiTietThuePT(MaKH,MaNV,MaDH,SoBuoi,NgayThue,NgayKT,Gia) values (?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE ChiTietThuePT SET MaKH = ?,MaNV = ?,MaDH = ?, SoBuoi = ?, NgayThue = ?,NgayKT = ?,Gia = ? where MaThue=?";
    final String update_dung = "UPDATE ChiTietThuePT SET SoBuoi = SoBuoi + ?, Gia = Gia + ?, NgayKT = DATEADD(DAY, ?, NgayKT) where MaNV = ?";
    final String update_NgayKT = "UPDATE ChiTietThuePT SET NgayKT = (SELECT MAX(NgayKT) FROM ChiTietThuePT) where MaNV = ?";
    final String update_NgayKT_LonHon = "UPDATE ChiTietThuePT SET NgayKT = DATEADD(DAY, ?, NgayKT) where MaNV = ?";
    final String updateTPT_theoSL = "UPDATE ChiTietThuePT SET SoBuoi = SoBuoi - ?, Gia = Gia - ?, NgayKT = DATEADD(DAY, ?, NgayKT) where MaNV = ?";
    final String DELETE_SQL = "DELETE FROM ChiTietThuePT WHERE MaThue=?";
    final String DELETE_MANV_SQL = "DELETE FROM ChiTietThuePT WHERE MaNV=?";
    final String DELETE_MADH_TPT_SQL = "DELETE FROM ChiTietThuePT WHERE MaDH = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM ChiTietThuePT";
    final String SELECT_BY_ID_SQL = "SELECT * FROM ChiTietThuePT where MaThue=?";
    final String SELECT_BY_MaDH_SQL = "SELECT * FROM ChiTietThuePT where MaThue=?";
    final String SELECT_GET_GIA = "select sum(Gia) as Gia from ChiTietThuePT";

    @Override
    public void insert(ChiTietThuePT entity) {
        DBHelper.update(INSERT_SQL,
                entity.getMakh(),
                entity.getManv(),
                entity.getMadh(),
                entity.getSobuoi(),
                entity.getNgaythue(),
                entity.getNgaykt(),
                entity.getGia());
    }

    @Override
    public void update(ChiTietThuePT entity) {
        DBHelper.update(UPDATE_SQL,
                entity.getMakh(),
                entity.getManv(),
                entity.getMadh(),
                entity.getSobuoi(),
                entity.getNgaythue(),
                entity.getNgaykt(),
                entity.getGia(),
                entity.getMathue());
    }

    public void updateDung(int input, String manv, double giaTang) {
        DBHelper.update(update_dung,
                input,
                giaTang,
                input,
                manv
        );
    }

    public void updateNgayKT(String manv) {
        DBHelper.update(update_NgayKT,
                manv
        );
    }

    public void updateNgayKT_LonHon(String magt, int input) {
        DBHelper.update(update_NgayKT_LonHon,
                input,
                magt
        );
    }

    public void updateSoLuongGia(int input, int thoiHan, String magt, double giaGiam) {
        DBHelper.update(updateTPT_theoSL,
                input,
                giaGiam,
                thoiHan,
                magt
        );
    }

    @Override
    public void delete(String id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public void deleteMaNV(String id) {
        DBHelper.update(DELETE_MANV_SQL, id);
    }

    public void deleteMaDH_CTTPT(int id) {
        DBHelper.update(DELETE_MADH_TPT_SQL, id);
    }

    @Override
    public ChiTietThuePT selectById(String id) {
        List<ChiTietThuePT> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChiTietThuePT> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ChiTietThuePT> selectBySql(String sql, Object... args) {
        List<ChiTietThuePT> list = new ArrayList<ChiTietThuePT>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                ChiTietThuePT entity = new ChiTietThuePT();
//                entity.setMathue(rs.getInt("MaThue"));
                entity.setMakh(rs.getString("MaKH"));
                entity.setManv(rs.getString("MaNV"));
                entity.setMadh(rs.getInt("MaDH"));
                entity.setSobuoi(rs.getInt("SoBuoi"));
                entity.setNgaythue(rs.getDate("NgayThue"));
                entity.setNgaykt(rs.getDate("NgayKT"));
                entity.setGia(rs.getDouble("Gia"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);

        }
    }

    public List<ChiTietThuePT> selectByMaDH_CTTPT(int keyword) {
        String sql = "SELECT * FROM ChiTietThuePT WHERE MaDH like ? order by NgayKT asc";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    private List<ChiTietThuePT> selectBySql_getGia(String sql, Object... args) {
        List<ChiTietThuePT> list = new ArrayList<ChiTietThuePT>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                ChiTietThuePT entity = new ChiTietThuePT();
                entity.setGia(rs.getDouble("Gia"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<ChiTietThuePT> selectGetGia() {
        return this.selectBySql_getGia(SELECT_GET_GIA);
    }

}
