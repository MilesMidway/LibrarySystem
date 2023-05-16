package libsys;
import libsys.AdminBase;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelRound1 = new Panel_Gradient.PanelRound();
        btnLibrarian1 = new javax.swing.JButton();
        btnReader1 = new javax.swing.JButton();
        btnAdmin1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLibrarian1.setBackground(new java.awt.Color(255, 255, 255));
        btnLibrarian1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/librarian_32px.png"))); // NOI18N
        btnLibrarian1.setText("LIBRARIAN");
        btnLibrarian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrarian1ActionPerformed(evt);
            }
        });
        panelRound1.add(btnLibrarian1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 170, 60));

        btnReader1.setBackground(new java.awt.Color(255, 255, 255));
        btnReader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reading_32px.png"))); // NOI18N
        btnReader1.setText("Reader");
        btnReader1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReader1ActionPerformed(evt);
            }
        });
        panelRound1.add(btnReader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 170, 70));

        btnAdmin1.setBackground(new java.awt.Color(255, 255, 255));
        btnAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin_settings_male_32px.png"))); // NOI18N
        btnAdmin1.setText("ADMIN");
        btnAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmin1ActionPerformed(evt);
            }
        });
        panelRound1.add(btnAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 170, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/18sp-ourfuture-libraries-superJumbo.gif"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -30, 1160, 800));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -20, 1160, 750));

        setSize(new java.awt.Dimension(1061, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibrarian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrarian1ActionPerformed
        this.dispose();
        main.sendDisplaySignal(new LibrarianSignIn()); // <--- It goes to
    }//GEN-LAST:event_btnLibrarian1ActionPerformed

    private void btnReader1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReader1ActionPerformed
        this.dispose();
        main.sendDisplaySignal(new ReaderSignIn()); // <--- It goes to
    }//GEN-LAST:event_btnReader1ActionPerformed

    private void btnAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin1ActionPerformed
        this.dispose();
        main.sendDisplaySignal(new AdminSignIn()); // <--- It goes to
    }//GEN-LAST:event_btnAdmin1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin1;
    private javax.swing.JButton btnLibrarian1;
    private javax.swing.JButton btnReader1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private Panel_Gradient.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
