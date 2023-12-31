package com.gym.form;

import com.gym.util.Auth;
import com.gym.util.MsgBox;
import com.gym.dao.NhanVienDAO;
import com.gym.entity.NhanVien;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author ADMIN
 */
public class DangNhap1 extends javax.swing.JFrame {

    File file = new File("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\save.txt");

    /**
     * Creates new form DangNhap1
     */
    public DangNhap1() {
        initComponents();
        txtMaNV.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtMatKhau.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtMatKhau.setEchoChar((char) 8226);
        lblHidepass.setVisible(false);

        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        UPDATE();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCover = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblHidepass = new javax.swing.JLabel();
        lblShowpass = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        btnQuenMatKhau = new javax.swing.JButton();
        chkLuuMK = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gym/icon/logo.jpg"))); // NOI18N
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đăng nhập");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 530, 44));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tài khoản");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 490, 25));

        jLabel6.setText("_________________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 351, 32));

        lblHidepass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gym/icon/eye.png"))); // NOI18N
        lblHidepass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHidepassMouseClicked(evt);
            }
        });
        jPanel2.add(lblHidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 50, 40));

        lblShowpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gym/icon/hide.png"))); // NOI18N
        lblShowpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowpassMouseClicked(evt);
            }
        });
        jPanel2.add(lblShowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 50, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mật khẩu");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 490, 25));

        jLabel8.setFont(jLabel8.getFont());
        jLabel8.setText("_________________________________________________");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 351, 32));

        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gym/icon/User.png"))); // NOI18N
        jPanel2.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 50, 40));

        txtMaNV.setText("NV0");
        txtMaNV.setBorder(null);
        jPanel2.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, -1));

        btnDangNhap.setBackground(new java.awt.Color(153, 204, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel2.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 430, 40));

        txtMatKhau.setFont(txtMatKhau.getFont());
        txtMatKhau.setBorder(null);
        txtMatKhau.setEchoChar('8');
        jPanel2.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 340, -1));

        btnQuenMatKhau.setText("Quên mật khẩu?");
        btnQuenMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenMatKhauActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuenMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        chkLuuMK.setText("Lưu mật khẩu?");
        chkLuuMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLuuMKActionPerformed(evt);
            }
        });
        jPanel2.add(chkLuuMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        javax.swing.GroupLayout pnlCoverLayout = new javax.swing.GroupLayout(pnlCover);
        pnlCover.setLayout(pnlCoverLayout);
        pnlCoverLayout.setHorizontalGroup(
            pnlCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
            .addGroup(pnlCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCoverLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlCoverLayout.setVerticalGroup(
            pnlCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(pnlCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCoverLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnlCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidepassMouseClicked
        lblShowpass.setVisible(true);
        lblHidepass.setVisible(false);
        txtMatKhau.setEchoChar((char) 8226);
    }//GEN-LAST:event_lblHidepassMouseClicked

    private void lblShowpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowpassMouseClicked
        lblShowpass.setVisible(false);
        lblHidepass.setVisible(true);
        txtMatKhau.setEchoChar((char) 0);
    }//GEN-LAST:event_lblShowpassMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        try {
            checkcheckValidateForm();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DangNhap1.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (chkLuuMK.isSelected()) {
            SAVE();
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnQuenMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenMatKhauActionPerformed
        QuenMatKhau quenmk = new QuenMatKhau();
        quenmk.setModal(true);
        this.dispose();
        quenmk.setVisible(true);
    }//GEN-LAST:event_btnQuenMatKhauActionPerformed

    private void chkLuuMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLuuMKActionPerformed


    }//GEN-LAST:event_chkLuuMKActionPerformed

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        DatabaseForm database = new DatabaseForm();
        database.setModal(true);
        database.setVisible(true);
    }//GEN-LAST:event_lblLogoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnQuenMatKhau;
    private javax.swing.JCheckBox chkLuuMK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHidepass;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblShowpass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlCover;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables
    NhanVienDAO dao = new NhanVienDAO();
    boolean login = false;
    private int soLanNhapSai = 0;
    private final int MAX_SO_LAN_NHAP_SAI = 5;

    public void checkcheckValidateForm() throws NoSuchAlgorithmException {
        String strMaNV = txtMaNV.getText();
        String strPassword = new String(txtMatKhau.getPassword());
        NhanVien nv = dao.selectById(strMaNV);

        if (nv == null) {
            MsgBox.alert(this, "Tên đăng nhập hoặc mật khẩu không chính xác");
            return;
        }

        if (nv.getMatKhau() == null) {
            MsgBox.alert(this, "Mật khẩu không được trống!");
            return;
        }

        boolean passwordMatch = verify(strPassword, nv.getMatKhau());

        if (!passwordMatch) {
            khoaTaiKhoan(strMaNV); // Gọi phương thức để kiểm tra và khóa tài khoản nếu cần
            return;
        } else if (!nv.isTrangThai()) {
            MsgBox.alert(this, "Tài khoản của bạn đã bị khóa!\nVui lòng liên hệ quản lý để mở khóa tài khoản!");
            return;
        } else {
            Auth.user = nv;
            login = true;

            // Reset số lần nhập sai của nhân viên khi đăng nhập thành công
            resetSoLanNhapSai(strMaNV);

            // Hiển thị form QuanLyDiem
            Thread loadingThread = new Thread(new Runnable() {
                public void run() {
                    LoadHome p = new LoadHome();
                    p.setVisible(true);

                    // Đóng form hiện tại
                    dispose();
                }
            });

            loadingThread.start();
        }
    }
    //    else {
    //            if (!nv.getMatKhau().equals(strPassword)) {
    //                soLanNhapSai++;
    //                if (soLanNhapSai >= MAX_SO_LAN_NHAP_SAI) {
    //                    khoaTaiKhoan(); // Gọi phương thức để khóa tài khoản khi vượt quá số lần nhập sai
    //                    return;
    //                } else {
    //                    MsgBox.alert(this, "Bạn đã nhập sai mật khẩu " + soLanNhapSai + " lần!\n "
    //                            + "Bạn còn " + (MAX_SO_LAN_NHAP_SAI - soLanNhapSai) + " lần thử trước khi bị khóa tài khoản!");
    //                    return;
    //                }
    //            } 

    public boolean checklogin() {
        return login;
    }

    // Khai báo Map để lưu trữ số lần nhập sai của từng nhân viên
    private Map<String, Integer> soLanNhapSaiMap = new HashMap<>();

// Phương thức để kiểm tra và khóa tài khoản của nhân viên
    void khoaTaiKhoan(String maNhanVien) {
        int soLanNhapSai = soLanNhapSaiMap.getOrDefault(maNhanVien, 0);
        soLanNhapSai++; // Tăng số lần nhập sai

        // Cập nhật số lần nhập sai cho nhân viên
        soLanNhapSaiMap.put(maNhanVien, soLanNhapSai);

        // Kiểm tra số lần nhập sai
        if (soLanNhapSai >= MAX_SO_LAN_NHAP_SAI) {
            // Làm các thao tác để khóa tài khoản nhân viên ở đây
            NhanVien nv = dao.selectById(maNhanVien);
            if (nv != null) {
                nv.setTrangThai(false); // Đặt trạng thái tài khoản là false (đã bị khóa)
                dao.update(nv); // Cập nhật trạng thái tài khoản trong cơ sở dữ liệu

                MsgBox.alert(this, "Tài khoản của bạn đã bị khóa!\nVui lòng liên hệ quản lý để được mở khóa tài khoản.");
            }
        } else {
            // Hiển thị thông báo số lần nhập sai còn lại
            MsgBox.alert(this, "Bạn đã nhập sai mật khẩu " + soLanNhapSai + " lần!\n"
                    + "Bạn còn " + (MAX_SO_LAN_NHAP_SAI - soLanNhapSai) + " lần thử trước khi bị khóa tài khoản!");
        }
    }

// Phương thức để reset số lần nhập sai của một nhân viên khi đăng nhập thành công
    void resetSoLanNhapSai(String maNhanVien) {
        soLanNhapSaiMap.put(maNhanVien, 0);
    }

    public void UPDATE() { //UPDATE ON OPENING THE APPLICATION

        try {
            if (file.exists()) {    //if this file exists
                Scanner scan = new Scanner(file);   //Use Scanner to read the File
                txtMaNV.setText(scan.nextLine());  //append the text to name field
                txtMatKhau.setText(scan.nextLine()); //append the text to password field
                scan.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }//End OF UPDATE

    public static boolean verify(String inputPassword, String hashPassWord)
            throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(inputPassword.getBytes());
        byte[] digest = md.digest();
        String myChecksum = DatatypeConverter
                .printHexBinary(digest).toUpperCase();

        return hashPassWord.equals(myChecksum);
    }

    public void SAVE() {      //Save the UserName and Password (for one user)

        try {
            if (!file.exists()) {
                file.createNewFile();  //if the file !exist create a new one
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
            bw.write(txtMaNV.getText()); //write the name
            bw.newLine(); //leave a new Line
            bw.write(txtMatKhau.getPassword()); //write the password
            bw.close(); //close the BufferdWriter
            System.out.println(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//End Of Save

}
