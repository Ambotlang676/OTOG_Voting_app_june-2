package Stud_Dashboard;

import Login.Login;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import party_lists.p_lists;
import profile.profile;
import rules.rules;
import voting.vote_n;
public class Stud_Dashboard extends javax.swing.JFrame {

    public Stud_Dashboard() {
        initComponents();
        //Making Constructor for Logo
        Image icon = new ImageIcon(getClass().getResource("/resources/icon.png")).getImage();
        setIconImage(icon);
    }
    
    public Stud_Dashboard (String msg) {
        initComponents();
        user.setText(msg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        show_menu = new javax.swing.JPanel();
        s_menu = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        Icon_dash = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        Profile = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        party_list = new javax.swing.JPanel();
        p_lists = new javax.swing.JLabel();
        Voting_rules = new javax.swing.JPanel();
        voting = new javax.swing.JLabel();
        and = new javax.swing.JLabel();
        regulations = new javax.swing.JLabel();
        Voting = new javax.swing.JPanel();
        vote = new javax.swing.JLabel();
        hide_menu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        for_blue_circle = new javax.swing.JPanel();
        for_blue_circle1 = new javax.swing.JPanel();
        for_blue_circle2 = new javax.swing.JPanel();
        for_blue_circle3 = new javax.swing.JPanel();
        for_blue_circle4 = new javax.swing.JPanel();
        for_blue_circle5 = new javax.swing.JPanel();
        for_blue_circle6 = new javax.swing.JPanel();
        for_blue_circle7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_menu.setBackground(new java.awt.Color(0, 51, 112));
        show_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        s_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main-menu.png"))); // NOI18N
        s_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s_menuMouseClicked(evt);
            }
        });
        show_menu.add(s_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        welcome.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("Welcome,");
        show_menu.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 240, -1));

        getContentPane().add(show_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 750));

        jPanel12.setBackground(new java.awt.Color(0, 51, 112));
        jPanel12.setMinimumSize(new java.awt.Dimension(1793, 850));
        jPanel12.setName(""); // NOI18N
        jPanel12.setPreferredSize(new java.awt.Dimension(1793, 850));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(36, 68, 145));
        jPanel13.setMinimumSize(new java.awt.Dimension(1793, 850));
        jPanel13.setPreferredSize(new java.awt.Dimension(1793, 850));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dashboard");
        jPanel13.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        btn_logout.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_logout.setText("Log out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel13.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 120, 50));

        Icon_dash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.png"))); // NOI18N
        jPanel13.add(Icon_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 90));

        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setFont(new java.awt.Font("Bookman Old Style", 1, 50)); // NOI18N
        home.setText("Home");
        Home.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jPanel12.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 120));

        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });
        Profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setFont(new java.awt.Font("Bookman Old Style", 1, 50)); // NOI18N
        profile.setText("Profile");
        Profile.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel12.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 300, 120));

        party_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                party_listMouseClicked(evt);
            }
        });
        party_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_lists.setFont(new java.awt.Font("Bookman Old Style", 1, 50)); // NOI18N
        p_lists.setText("Party lists");
        party_list.add(p_lists, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel12.add(party_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 300, 120));

        Voting_rules.setForeground(new java.awt.Color(153, 153, 0));
        Voting_rules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Voting_rulesMouseClicked(evt);
            }
        });
        Voting_rules.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voting.setFont(new java.awt.Font("Bookman Old Style", 1, 40)); // NOI18N
        voting.setText("Voting Rules");
        Voting_rules.add(voting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        and.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        and.setText("and");
        Voting_rules.add(and, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        regulations.setFont(new java.awt.Font("Bookman Old Style", 1, 40)); // NOI18N
        regulations.setText("Regulations");
        Voting_rules.add(regulations, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanel12.add(Voting_rules, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 300, 120));

        Voting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotingMouseClicked(evt);
            }
        });
        Voting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vote.setFont(new java.awt.Font("Bookman Old Style", 1, 50)); // NOI18N
        vote.setText("Vote Now !");
        Voting.add(vote, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel12.add(Voting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 300, 120));

        hide_menu.setBackground(new java.awt.Color(0, 51, 112));
        hide_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(hide_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main-menu.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        for_blue_circle.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout for_blue_circleLayout = new javax.swing.GroupLayout(for_blue_circle);
        for_blue_circle.setLayout(for_blue_circleLayout);
        for_blue_circleLayout.setHorizontalGroup(
            for_blue_circleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        for_blue_circleLayout.setVerticalGroup(
            for_blue_circleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel12.add(for_blue_circle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 130, 470));

        for_blue_circle1.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout for_blue_circle1Layout = new javax.swing.GroupLayout(for_blue_circle1);
        for_blue_circle1.setLayout(for_blue_circle1Layout);
        for_blue_circle1Layout.setHorizontalGroup(
            for_blue_circle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        for_blue_circle1Layout.setVerticalGroup(
            for_blue_circle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel12.add(for_blue_circle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 740, 280, 70));

        for_blue_circle2.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout for_blue_circle2Layout = new javax.swing.GroupLayout(for_blue_circle2);
        for_blue_circle2.setLayout(for_blue_circle2Layout);
        for_blue_circle2Layout.setHorizontalGroup(
            for_blue_circle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        for_blue_circle2Layout.setVerticalGroup(
            for_blue_circle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel12.add(for_blue_circle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, -1, 100));

        for_blue_circle3.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout for_blue_circle3Layout = new javax.swing.GroupLayout(for_blue_circle3);
        for_blue_circle3.setLayout(for_blue_circle3Layout);
        for_blue_circle3Layout.setHorizontalGroup(
            for_blue_circle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        for_blue_circle3Layout.setVerticalGroup(
            for_blue_circle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel12.add(for_blue_circle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 700, 130, 110));

        for_blue_circle4.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout for_blue_circle4Layout = new javax.swing.GroupLayout(for_blue_circle4);
        for_blue_circle4.setLayout(for_blue_circle4Layout);
        for_blue_circle4Layout.setHorizontalGroup(
            for_blue_circle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        for_blue_circle4Layout.setVerticalGroup(
            for_blue_circle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel12.add(for_blue_circle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 260, 140, 480));

        for_blue_circle5.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout for_blue_circle5Layout = new javax.swing.GroupLayout(for_blue_circle5);
        for_blue_circle5.setLayout(for_blue_circle5Layout);
        for_blue_circle5Layout.setHorizontalGroup(
            for_blue_circle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        for_blue_circle5Layout.setVerticalGroup(
            for_blue_circle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel12.add(for_blue_circle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 340, 50));

        for_blue_circle6.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout for_blue_circle6Layout = new javax.swing.GroupLayout(for_blue_circle6);
        for_blue_circle6.setLayout(for_blue_circle6Layout);
        for_blue_circle6Layout.setHorizontalGroup(
            for_blue_circle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        for_blue_circle6Layout.setVerticalGroup(
            for_blue_circle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel12.add(for_blue_circle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 140, -1));

        for_blue_circle7.setBackground(new java.awt.Color(0, 51, 112));

        javax.swing.GroupLayout for_blue_circle7Layout = new javax.swing.GroupLayout(for_blue_circle7);
        for_blue_circle7.setLayout(for_blue_circle7Layout);
        for_blue_circle7Layout.setHorizontalGroup(
            for_blue_circle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        for_blue_circle7Layout.setVerticalGroup(
            for_blue_circle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel12.add(for_blue_circle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BackGround.png"))); // NOI18N
        jPanel12.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        user.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("User id");
        jPanel12.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome,");
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, -1));

        setSize(new java.awt.Dimension(1256, 845));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int x = 300;
    ////animation para makita ang lists
    private void s_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_menuMouseClicked
        if (x == 300 ) {
            show_menu.setSize(300, 790);
            Thread th = new Thread(){
                @Override
                public void run(){
                    try {
                        for ( int i = 300; i >= 0; i--){
                            Thread.sleep(1);
                            show_menu.setSize(i, 790);
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=0;
        }
    }//GEN-LAST:event_s_menuMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (x == 0){
            show_menu.show();
            show_menu.setSize(x,790);
            Thread th = new Thread (){
                @Override
                public void run(){
                    try {
                        for (int i = 0; i <= x; i++){
                            Thread.sleep(1);
                            show_menu.setSize(i,790);
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=300;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void VotingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotingMouseClicked
        this.setVisible(false);
        new vote_n().setVisible(true);
    }//GEN-LAST:event_VotingMouseClicked

    private void Voting_rulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voting_rulesMouseClicked
        this.setVisible(false);
        new rules().setVisible(true);
    }//GEN-LAST:event_Voting_rulesMouseClicked

    private void party_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_party_listMouseClicked
        this.setVisible(false);
        new p_lists().setVisible(true);
    }//GEN-LAST:event_party_listMouseClicked

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
        this.setVisible(false);
        new profile().setVisible(true);
    }//GEN-LAST:event_ProfileMouseClicked

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Stud_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stud_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stud_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stud_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stud_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Icon_dash;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Voting;
    private javax.swing.JPanel Voting_rules;
    private javax.swing.JLabel and;
    private javax.swing.JButton btn_logout;
    private javax.swing.JPanel for_blue_circle;
    private javax.swing.JPanel for_blue_circle1;
    private javax.swing.JPanel for_blue_circle2;
    private javax.swing.JPanel for_blue_circle3;
    private javax.swing.JPanel for_blue_circle4;
    private javax.swing.JPanel for_blue_circle5;
    private javax.swing.JPanel for_blue_circle6;
    private javax.swing.JPanel for_blue_circle7;
    private javax.swing.JPanel hide_menu;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JLabel p_lists;
    private javax.swing.JPanel party_list;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel regulations;
    private javax.swing.JLabel s_menu;
    private javax.swing.JPanel show_menu;
    private javax.swing.JLabel user;
    private javax.swing.JLabel vote;
    private javax.swing.JLabel voting;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
