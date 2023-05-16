package libsys;
import java.awt.event.WindowEvent;

public class LibrarianBase extends main {

    
    public LibrarianBase() {
        initComponents();
    }

    ReaderBase viewer = new ReaderBase();
    BookRegistry register = new BookRegistry();
    BookBorrowMan borrow = new BookBorrowMan();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistry = new Button_Gradient.ButtonGradient();
        btnBorrowMan = new Button_Gradient.ButtonGradient();
        btnViewer = new Button_Gradient.ButtonGradient();
        btnLogOut = new Button_Gradient.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistry.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Check Book_20px_1.png"))); // NOI18N
        btnRegistry.setText("BOOK REGISTRY");
        btnRegistry.setColor1(new java.awt.Color(32, 58, 67));
        btnRegistry.setColor2(new java.awt.Color(32, 58, 67));
        btnRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistryActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, -1));

        btnBorrowMan.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrowMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Borrow Book_30px.png"))); // NOI18N
        btnBorrowMan.setText("BOOK BORROWING MANAGER");
        btnBorrowMan.setColor1(new java.awt.Color(32, 58, 67));
        btnBorrowMan.setColor2(new java.awt.Color(32, 58, 67));
        btnBorrowMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowManActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrowMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 240, 40));

        btnViewer.setBackground(new java.awt.Color(255, 255, 255));
        btnViewer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye_20px.png"))); // NOI18N
        btnViewer.setText("BOOK VIEWER");
        btnViewer.setColor1(new java.awt.Color(32, 58, 67));
        btnViewer.setColor2(new java.awt.Color(32, 58, 67));
        btnViewer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewerActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 240, 40));

        btnLogOut.setBackground(new java.awt.Color(32, 58, 67));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout_14px.png"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.setColor1(new java.awt.Color(32, 58, 67));
        btnLogOut.setColor2(new java.awt.Color(32, 58, 67));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/e58674891220df8a97807e636b99cd6c.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistryActionPerformed
        register.setVisible(true);
    }//GEN-LAST:event_btnRegistryActionPerformed

    private void btnBorrowManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowManActionPerformed
        borrow.setVisible(true);
    }//GEN-LAST:event_btnBorrowManActionPerformed

    private void btnViewerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewerActionPerformed
        viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewer.btnLogOut.setVisible(false);
        viewer.setVisible(true);
    }//GEN-LAST:event_btnViewerActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        logOut();
        sendCloseSignal(new BookRegistry());
        sendCloseSignal(new BookBorrowMan());
        sendCloseSignal(new ReaderBase());
        sendCloseSignal(new BookViewer());
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnBorrowMan;
    private Button_Gradient.ButtonGradient btnLogOut;
    private Button_Gradient.ButtonGradient btnRegistry;
    private Button_Gradient.ButtonGradient btnViewer;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
