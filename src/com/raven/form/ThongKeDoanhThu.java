/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.gym.dao.ChiTietDungCuDAO;
import com.gym.dao.ChiTietGoiTapDAO;
import com.gym.dao.DonHangDAO;
import com.gym.dao.DungCuDAO;
import com.gym.dao.GoiTapDAO;
import com.gym.dao.KhachHangDAO;
import com.gym.util.MsgBox;
import com.gym.dao.NhanVienDAO;
import com.gym.entity.ChiTietDungCu;
import com.gym.entity.ChiTietGoiTap;
import com.gym.entity.DonHang;
import com.gym.entity.DungCu;
import com.gym.entity.GoiTap;
import com.gym.entity.KhachHang;
import com.gym.entity.NhanVien;
import com.gym.util.Auth;
import com.gym.util.XDate;
import com.gym.util.XImage;
import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAVEN
 */
public class ThongKeDoanhThu extends javax.swing.JPanel {

    /**
     * Creates new form Form_1
     */
    public ThongKeDoanhThu() {
        initComponents();
        rdoAll.setSelected(true);
        status();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdoNgay = new javax.swing.JRadioButton();
        rdoThang = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoAll = new javax.swing.JRadioButton();
        lblTu = new javax.swing.JLabel();
        lblDen = new javax.swing.JLabel();
        txtNgayFrom = new javax.swing.JTextField();
        txtNgayTo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        cboMonthFrom = new javax.swing.JComboBox<>();
        cboMonthTo = new javax.swing.JComboBox<>();
        cboYearFrom = new javax.swing.JComboBox<>();
        cboYearTo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboSanPham = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("THỐNG KÊ DOANH THU");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 330, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DOANH THU");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("12.000.00 VNĐ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 82, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SỐ HÓA ĐƠN");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("25");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 82, -1, 210));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SỐ SẢN PHẨM BÁN");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("150");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 82, -1, 210));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("LỌC THEO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 394, -1, -1));

        buttonGroup1.add(rdoNgay);
        rdoNgay.setText("NGÀY");
        rdoNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNgayActionPerformed(evt);
            }
        });
        jPanel1.add(rdoNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 395, -1, -1));

        buttonGroup1.add(rdoThang);
        rdoThang.setText("THÁNG");
        rdoThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoThangActionPerformed(evt);
            }
        });
        jPanel1.add(rdoThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 395, -1, -1));

        buttonGroup1.add(rdoNam);
        rdoNam.setText("NĂM");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });
        jPanel1.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 395, -1, -1));

        buttonGroup1.add(rdoAll);
        rdoAll.setText("TẤT CẢ");
        rdoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAllActionPerformed(evt);
            }
        });
        jPanel1.add(rdoAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 395, -1, -1));

        lblTu.setText("TỪ:");
        jPanel1.add(lblTu, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 431, -1, -1));

        lblDen.setText("ĐẾN");
        jPanel1.add(lblDen, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 431, -1, -1));
        jPanel1.add(txtNgayFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 428, 203, -1));
        jPanel1.add(txtNgayTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 428, 203, -1));

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblThongKe);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 462, 1036, 326));

        cboMonthFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12", " " }));
        jPanel1.add(cboMonthFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 200, -1));

        cboMonthTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12", " " }));
        jPanel1.add(cboMonthTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 200, -1));

        cboYearFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", " " }));
        jPanel1.add(cboYearFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 200, -1));

        cboYearTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024" }));
        jPanel1.add(cboYearTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 200, -1));

        jLabel8.setText("LOẠI SẢN PHẨM:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, -1, 20));

        cboSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gói tập", "Thuê PT", "Dụng cụ", "Tất cả", " " }));
        jPanel1.add(cboSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNgayActionPerformed
        status();
    }//GEN-LAST:event_rdoNgayActionPerformed

    private void rdoThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoThangActionPerformed
        status();
    }//GEN-LAST:event_rdoThangActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        status();
    }//GEN-LAST:event_rdoNamActionPerformed

    private void rdoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAllActionPerformed
        status();
    }//GEN-LAST:event_rdoAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cboMonthFrom;
    private javax.swing.JComboBox<String> cboMonthTo;
    private javax.swing.JComboBox<String> cboSanPham;
    private javax.swing.JComboBox<String> cboYearFrom;
    private javax.swing.JComboBox<String> cboYearTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDen;
    private javax.swing.JLabel lblTu;
    private javax.swing.JRadioButton rdoAll;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNgay;
    private javax.swing.JRadioButton rdoThang;
    private javax.swing.JTable tblThongKe;
    private javax.swing.JTextField txtNgayFrom;
    private javax.swing.JTextField txtNgayTo;
    // End of variables declaration//GEN-END:variables

    void status() {
        if (rdoNgay.isSelected()) {
            lblTu.setVisible(true);
            lblDen.setVisible(true);
            txtNgayFrom.setVisible(true);
            txtNgayTo.setVisible(true);
            cboMonthFrom.setVisible(false);
            cboMonthTo.setVisible(false);
            cboYearFrom.setVisible(false);
            cboYearTo.setVisible(false);
        } else if (rdoThang.isSelected()) {
            lblTu.setVisible(true);
            lblDen.setVisible(true);
            cboMonthFrom.setVisible(true);
            cboMonthTo.setVisible(true);
            txtNgayFrom.setVisible(false);
            txtNgayTo.setVisible(false);
            cboYearFrom.setVisible(false);
            cboYearTo.setVisible(false);
        } else if (rdoNam.isSelected()) {
            lblTu.setVisible(true);
            lblDen.setVisible(true);
            cboYearFrom.setVisible(true);
            cboYearTo.setVisible(true);
            cboMonthFrom.setVisible(false);
            cboMonthTo.setVisible(false);
            txtNgayFrom.setVisible(false);
            txtNgayTo.setVisible(false);
        } else {
            lblTu.setVisible(false);
            lblDen.setVisible(false);
            txtNgayFrom.setVisible(false);
            txtNgayTo.setVisible(false);
            cboYearFrom.setVisible(false);
            cboYearTo.setVisible(false);
            cboMonthFrom.setVisible(false);
            cboMonthTo.setVisible(false);
        }
    }

}
