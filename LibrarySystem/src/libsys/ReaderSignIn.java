package libsys;

import libsys.AdminBase;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import libsys.MainWindow;
import libsys.ReaderSignUp;
import libsys.main;

public class ReaderSignIn extends main {

    public ReaderSignIn() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBack = new Button_Gradient.ButtonGradient();
        panelRound1 = new Panel_Gradient.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLogName = new textfield.TextField();
        txtLogPass = new textfield.PasswordField();
        btnCreate = new Button_Gradient.ButtonGradient();
        btnCreateAcc = new Button_Gradient.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 51, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 51));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_processing20200810-29265-bud3le.gif"))); // NOI18N
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 750, 630));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_20px.png"))); // NOI18N
        btnBack.setColor1(new java.awt.Color(211, 204, 227));
        btnBack.setColor2(new java.awt.Color(233, 228, 240));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome Back");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Log In to continue");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Don't have account?");

        txtLogName.setLabelText("User Name");
        txtLogName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogNameActionPerformed(evt);
            }
        });

        txtLogPass.setLabelText("Confirm Password");
        txtLogPass.setShowAndHide(true);
        txtLogPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogPassActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setText("LOGIN");
        btnCreate.setColor1(new java.awt.Color(255, 51, 51));
        btnCreate.setColor2(new java.awt.Color(153, 0, 51));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnCreateAcc.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateAcc.setText("CREATE ACCOUNT");
        btnCreateAcc.setColor1(new java.awt.Color(255, 51, 51));
        btnCreateAcc.setColor2(new java.awt.Color(153, 0, 51));
        btnCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addComponent(btnCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLogPass, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogName, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLogPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        kGradientPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 440, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        setSize(new java.awt.Dimension(1296, 748));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        databaseConnect("accounts");
        
        usiFullName = txtLogName.getText();
        usiPass = String.valueOf(txtLogPass.getPassword());
        
        try {
            signIn(usiFullName, usiPass, "READER", txtLogName, txtLogPass);
        } catch (Exception ex) {
            Logger.getLogger(ReaderSignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccActionPerformed
        this.dispose();
        main.sendDisplaySignal(new ReaderSignUp()); // <--- It goes to
    }//GEN-LAST:event_btnCreateAccActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        main.sendDisplaySignal(new MainWindow()); // <--- It goes back to
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtLogNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogNameActionPerformed

    private void txtLogPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogPassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnBack;
    private Button_Gradient.ButtonGradient btnCreate;
    private Button_Gradient.ButtonGradient btnCreateAcc;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private Panel_Gradient.PanelRound panelRound1;
    private textfield.TextField txtLogName;
    private textfield.PasswordField txtLogPass;
    // End of variables declaration//GEN-END:variables
}
