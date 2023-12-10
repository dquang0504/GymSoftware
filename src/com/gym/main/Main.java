/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.main;

import com.gym.util.Auth;
import com.gym.util.MsgBox;
import com.gym.event.EventMenuSelected;
import com.gym.form.DangNhap;
import com.gym.form.DangNhap1;
import com.gym.form.DoiMatKhau1;
import com.gym.form.QuanLyNhanVien;
import com.gym.form.QuanLyDonHang;
import com.gym.form.Form_Home;
import com.gym.form.QuanLyDungCu;
import com.gym.form.QuanLyGoiTap;
import com.gym.form.QuanLyKhachHang;
import com.gym.form.QuenMatKhau;
import com.gym.form.ThongKeDoanhThu;
import java.awt.Color;
import javax.accessibility.AccessibleAction;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author RAVEN
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private Form_Home home;
    private QuanLyNhanVien form1;
    private QuanLyGoiTap form2;
    private QuanLyKhachHang form3;
    private QuanLyDungCu form4;
    private QuanLyDonHang form5;
    private ThongKeDoanhThu form6;
    private DoiMatKhau1 form9;
    private DangNhap1 form10;

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setExtendedState(JFrame.MAXIMIZED_BOTH); // dòng này để hiển thị full màn hình
        home = new Form_Home();
        form1 = new QuanLyNhanVien();
        form2 = new QuanLyGoiTap();
        form3 = new QuanLyKhachHang();
        form4 = new QuanLyDungCu();
        form5 = new QuanLyDonHang();
        form6 = new ThongKeDoanhThu();
        form9 = new DoiMatKhau1();
        form10 = new DangNhap1();
        menu.initMoving(Main.this);
        
        //  set when system open start with home form
        setForm(new Form_Home());
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.gym.swing.PanelBorder();
        menu = new com.gym.component.Menu();
        header2 = new com.gym.component.Header();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        header2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    setForm(home);
                } else if (index == 1) {
                    setForm(form1);
                } else if (index == 2) {
                    setForm(form2);
                } else if (index == 3) {
                    setForm(form3);
                }
                else if(index == 4){
                    setForm(form4);
                }
                else if(index == 5){
                    setForm(form5);
                }
                else if(index == 6 && Auth.user.isVaiTro()){
                    setForm(form6);
                }
                else if(index == 6 && !Auth.user.isVaiTro()){
                    MsgBox.alert(Main.this, "Bạn không có quyền truy cập doanh thu!");
                }
                else if(index ==9){
                    DoiMatKhau1 doimk = new DoiMatKhau1();
                    doimk.setModal(true);
                    doimk.setVisible(true);
                    if(doimk.clicked()){
                        dispose();
                    }
                }
                else if(index == 10){
                    dispose();
                    DangNhap1 login = new DangNhap1();
                    
                    login.setVisible(true);
                    if(!login.checklogin()){
                        
                    }
                }
                else if(index == 11){
                    System.exit(0);
                }
            }
        });
        
//        if (!Auth.isLogin()) {
//            MsgBox.alert(this, "Vui lòng đăng nhập!");
//            this.dispose();
//            new DangNhap().setVisible(true);
//        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.gym.component.Header header2;
    private javax.swing.JPanel mainPanel;
    private com.gym.component.Menu menu;
    private com.gym.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}