package Login;

import java.awt.*;
import javax.swing.*;
import Model.user;
import Choose_role.Role;
import Stud_Dashboard.Stud_Dashboard;
import admin_dash.Admin_dashboard;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        //Making Constructor for Logo
        Image icon = new ImageIcon(getClass().getResource("/resources/icon.png")).getImage();
        setIconImage(icon);
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        password = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jUser = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        title = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(35, 59, 118));
        setFocusCycleRoot(false);
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 59, 118));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 850));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(196, 39, 58));
        btn_back.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 650, 320, -1));

        password.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        username.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("User ID");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 550, -1));

        jUser.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jUser.setDoubleBuffered(true);
        jUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserActionPerformed(evt);
            }
        });
        jPanel1.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 520, -1));

        jPass.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });
        jPanel1.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 520, -1));

        title.setFont(new java.awt.Font("Bookman Old Style", 1, 80)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("OTOG Voting App");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        btn_login.setBackground(new java.awt.Color(17, 128, 14));
        btn_login.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 320, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1130, 940));

        setSize(new java.awt.Dimension(1028, 857));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void jUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUserActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        //opening the dashboard frame
        this.setVisible(false);
        new Role().setVisible(true);
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        user u = new user();
        int response = u.Login(jUser.getText(), jPass.getText());
        
        String msg = jUser.getText();
        
        if (response == 1){ //Admin
            this.setVisible(false);
            new Admin_dashboard(msg).setVisible(true);
        }else if (response == 2){
            this.setVisible(false);
            new Stud_Dashboard(msg).setVisible(true);
        }else if (response == 3){
            //Inactive Account
            JOptionPane.showMessageDialog(this, "Account Inactive! Please contact yourself", "Message", JOptionPane.WARNING_MESSAGE);
        }else if (response == 4){
            //Invalid username or password
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Message", JOptionPane.ERROR_MESSAGE);
        }else {
            //System error, etc.
            JOptionPane.showMessageDialog(this,  "Something Went Wrong!", "Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jUser;
    private javax.swing.JLabel password;
    private javax.swing.JLabel title;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
