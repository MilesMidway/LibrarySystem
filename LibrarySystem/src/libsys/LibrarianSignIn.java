package libsys;

import libsys.AdminBase;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LibrarianSignIn extends main {

    public LibrarianSignIn() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelGradient1 = new Panel_Gradient.PanelGradient();
        jLabel3 = new javax.swing.JLabel();
        panelRound1 = new Panel_Gradient.PanelRound();
        btnConfirm = new Button_Gradient.ButtonGradient();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLogName = new textfield.TextField();
        txtLogPass = new textfield.PasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new Button_Gradient.ButtonGradient();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        panelGradient1.setBackground(new java.awt.Color(168, 255, 120));
        panelGradient1.setColorGradient(new java.awt.Color(120, 255, 214));
        panelGradient1.setPreferredSize(new java.awt.Dimension(1280, 720));
        panelGradient1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_processing20190919-15480-14l7sg7.gif"))); // NOI18N
        panelGradient1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 800, 570));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        btnConfirm.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("LOGIN");
        btnConfirm.setColor1(new java.awt.Color(168, 255, 120));
        btnConfirm.setColor2(new java.awt.Color(120, 255, 214));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/regerger30px.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/passwordpx.png"))); // NOI18N

        txtLogName.setLabelText("User Name");

        txtLogPass.setLabelText("Confirm Password");
        txtLogPass.setShowAndHide(true);

        jLabel4.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LIBRARIAN LOGIN");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reading_60px.png"))); // NOI18N

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLogPass, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(70, 70, 70)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLogName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLogPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        panelGradient1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 370, 540));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1111111.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setColor1(new java.awt.Color(51, 255, 204));
        btnBack.setColor2(new java.awt.Color(102, 255, 153));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelGradient1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        getContentPane().add(panelGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 720));

        setSize(new java.awt.Dimension(1290, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        databaseConnect("accounts");
        
        usiFullName = txtLogName.getText();
        usiPass = String.valueOf(txtLogPass.getPassword());
     
        try {
            signIn(usiFullName, usiPass, "LIBRARIAN", txtLogName, txtLogPass);
        } catch (Exception ex) {
            Logger.getLogger(LibrarianSignIn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        main.sendDisplaySignal(new MainWindow()); // <--- It goes back to
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnBack;
    private Button_Gradient.ButtonGradient btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private Panel_Gradient.PanelGradient panelGradient1;
    private Panel_Gradient.PanelRound panelRound1;
    private textfield.TextField txtLogName;
    private textfield.PasswordField txtLogPass;
    // End of variables declaration//GEN-END:variables
}
