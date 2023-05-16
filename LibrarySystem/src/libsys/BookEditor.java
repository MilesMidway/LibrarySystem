package libsys;
import javax.swing.*;
import javax.imageio.*;
import java.awt.Image;
import java.sql.*;
import java.awt.dnd.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.*;
import libsys.AdminBase;


public class BookEditor extends main {
    ImageInsert imageInsert= new ImageInsert();
    String imagesrc, validfilename,destinationpath;
    
    public BookEditor() {
        initComponents();
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn_Delete = new Button_Gradient.ButtonGradient();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Title_tf = new javax.swing.JTextField();
        Author_tf = new javax.swing.JTextField();
        Year_tf = new javax.swing.JTextField();
        ImageLabel = new javax.swing.JLabel();
        Genre_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Synopsis_ta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Btn_save = new Button_Gradient.ButtonGradient();
        Btn_Back = new Button_Gradient.ButtonGradient();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Delete.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove_30px.png"))); // NOI18N
        Btn_Delete.setText("Delete");
        Btn_Delete.setColor1(new java.awt.Color(120, 255, 214));
        Btn_Delete.setColor2(new java.awt.Color(168, 255, 120));
        Btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 130, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Author:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 128, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Year of Publication:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 128, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Genre:");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 128, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Synopsis/Description:");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 37));
        jPanel1.add(Title_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 350, 30));
        jPanel1.add(Author_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 350, 30));
        jPanel1.add(Year_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 350, 30));

        ImageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setText("Enter a Title First");
        ImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ImageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageLabelMouseExited(evt);
            }
        });
        jPanel1.add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 220));
        jPanel1.add(Genre_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 350, 30));

        Synopsis_ta.setColumns(20);
        Synopsis_ta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Synopsis_ta.setLineWrap(true);
        Synopsis_ta.setRows(5);
        jScrollPane1.setViewportView(Synopsis_ta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 730, 170));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cover");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Title:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 128, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book_and_pencil_40px_1.png"))); // NOI18N
        jLabel1.setText("Book Editor");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 320, 50));

        Btn_save.setText("SAVE");
        Btn_save.setColor1(new java.awt.Color(0, 51, 255));
        Btn_save.setColor2(new java.awt.Color(0, 255, 255));
        Btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 110, 40));

        Btn_Back.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_to_25px_1.png"))); // NOI18N
        Btn_Back.setText("Back");
        Btn_Back.setColor1(new java.awt.Color(0, 255, 255));
        Btn_Back.setColor2(new java.awt.Color(255, 255, 255));
        Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BackActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parralax-about.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 860, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ImageLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageLabelMouseExited
        if(imageInsert.ImagePath!=null){
            String[] InvalidChars={"\\?","\\:","\\<","\\>","\\/","\\*","\"","\\|"};
            validfilename=Title_tf.getText();
            for(String x:InvalidChars){
                validfilename=validfilename.replaceAll(x, "");
            }
            destinationpath="src/libsys_images/"+validfilename+".jpg";
            
            try{
                Files.delete(Paths.get(imagesrc));
            }catch(IOException err){
                System.out.println(err);
            }  
            
            //Show the image in the current panel
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(imageInsert.ImagePath));
            } catch (IOException ex) {
                Logger.getLogger(BookEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image dimg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(),
            Image.SCALE_SMOOTH);
        
            ImageIcon icon=new ImageIcon(dimg);
            ImageLabel.setText(null);
            ImageLabel.setIcon(icon);
            
            try {
                CopyImage(destinationpath);
            }catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ImageLabelMouseExited

    private void Btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_saveActionPerformed
        databaseConnect("books");
        try{
            rs=stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = "+currBookID);
            rs.next();
            rs.updateString("TITLE", Title_tf.getText());
            rs.updateString("AUTHOR", Author_tf.getText());
            rs.updateString("DATE", Year_tf.getText());
            rs.updateString("GENRE", Genre_tf.getText());
            rs.updateString("SYNOPSIS",Synopsis_ta.getText());
            rs.updateString("IMAGE",destinationpath);
            rs.updateRow();
            refreshRsStmt("books");
        } catch(SQLException err){
            System.out.println(err);
        }
        Btn_save.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Editing is successful!");
        this.dispose();
    }//GEN-LAST:event_Btn_saveActionPerformed

    private void Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BackActionPerformed
        this.dispose();
        sendDisplaySignal(new BookEditor());
        BookViewer.hideBorrow().setVisible(false);
    }//GEN-LAST:event_Btn_BackActionPerformed

    private void Btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteActionPerformed
        int response;
        response=JOptionPane.showConfirmDialog(null, "This will completely wipe the book from the System, Are you sure?", "Confirmation?", 0);
        System.out.println(response);
        //0=yes 1=no
        switch(response){
            case 0:
                DeleteAction();
                break;
            case 1:
                break;
        }
    }//GEN-LAST:event_Btn_DeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       databaseConnect("books");
       new DropTarget(ImageLabel, imageInsert);
        try{
            rs=stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = "+currBookID);
            while(rs.next()){
                Title_tf.setText(rs.getString("TITLE"));
                Author_tf.setText(rs.getString("AUTHOR"));
                Genre_tf.setText(rs.getString("GENRE"));
                Year_tf.setText(rs.getString("DATE"));
                imagesrc=rs.getString("IMAGE");
                destinationpath=imagesrc;
                Synopsis_ta.setText(rs.getString("SYNOPSIS"));
                
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(imagesrc));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                Image dimg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(),
                Image.SCALE_SMOOTH);
        
                ImageIcon icon=new ImageIcon(dimg);
                ImageLabel.setText(null);
                ImageLabel.setIcon(icon);
            }
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened
  
    private void DeleteAction(){
        databaseConnect("books");
        try {
            rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
            rs.next();
            rs.deleteRow();
            refreshRsStmt("books");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        try{
                Files.delete(Paths.get(imagesrc));
        }catch(IOException err){
                System.out.println(err);
        }
        this.dispose();
        sendDisplaySignal(new LibrarianBase());
    }
    
    private void CopyImage(String destinationpath) throws IOException{
        Path source=Paths.get(imageInsert.ImagePath);
        Path destination=Paths.get(destinationpath);
        Files.copy(source, destination, StandardCopyOption.COPY_ATTRIBUTES);
    }
    
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
            java.util.logging.Logger.getLogger(LibrarianBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookEditor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author_tf;
    private Button_Gradient.ButtonGradient Btn_Back;
    private Button_Gradient.ButtonGradient Btn_Delete;
    private Button_Gradient.ButtonGradient Btn_save;
    private javax.swing.JTextField Genre_tf;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextArea Synopsis_ta;
    private javax.swing.JTextField Title_tf;
    private javax.swing.JTextField Year_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
