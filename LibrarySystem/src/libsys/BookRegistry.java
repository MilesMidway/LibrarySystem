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



public class BookRegistry extends main {
    ImageInsert imageInsert= new ImageInsert();
    public BookRegistry() {
        initComponents();
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel8 = new javax.swing.JLabel();
        panelRound1 = new Panel_Gradient.PanelRound();
        Author_tf = new javax.swing.JTextField();
        Year_tf = new javax.swing.JTextField();
        Genre_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Synopsis_ta = new javax.swing.JTextArea();
        ImageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Title_tf = new javax.swing.JTextField();
        btn_Back = new Button_Gradient.ButtonGradient();
        Btn_Register = new Button_Gradient.ButtonGradient();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRound1.add(Author_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 250, 30));
        panelRound1.add(Year_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 250, 30));
        panelRound1.add(Genre_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 250, 30));

        Synopsis_ta.setColumns(20);
        Synopsis_ta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Synopsis_ta.setLineWrap(true);
        Synopsis_ta.setRows(5);
        jScrollPane1.setViewportView(Synopsis_ta);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 710, 170));

        ImageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setText("Enter a Title First");
        ImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ImageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageLabelMouseExited(evt);
            }
        });
        panelRound1.add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 220));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Check Book_40px.png"))); // NOI18N
        jLabel1.setText("Book Registry");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 320, 60));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cover");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Title:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 130, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Author:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 130, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Year of Publication:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 128, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Genre:");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 128, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Synopsis/Description:");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 150, 37));

        Title_tf.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N
        Title_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Title_tfKeyPressed(evt);
            }
        });
        panelRound1.add(Title_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 250, 30));

        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_to_25px_1.png"))); // NOI18N
        btn_Back.setText("Back");
        btn_Back.setColor1(new java.awt.Color(51, 51, 255));
        btn_Back.setColor2(new java.awt.Color(0, 255, 255));
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        panelRound1.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 30));

        Btn_Register.setText("REGISTER");
        Btn_Register.setColor1(new java.awt.Color(51, 51, 255));
        Btn_Register.setColor2(new java.awt.Color(0, 255, 255));
        Btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegisterActionPerformed(evt);
            }
        });
        panelRound1.add(Btn_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 110, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/23_0330_webpages_safecom-resources_cta-700x394_fogs.png"))); // NOI18N
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 410));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/particlesjs-examples (1).gif"))); // NOI18N
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 780, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImageLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageLabelMouseExited
        if(imageInsert.ImagePath!=null){
            //Show the image in the current panel
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(imageInsert.ImagePath));
            } catch (IOException ex) {
                Logger.getLogger(BookRegistry.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image dimg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(),
            Image.SCALE_SMOOTH);

            ImageIcon icon=new ImageIcon(dimg);
            ImageLabel.setText(null);
            ImageLabel.setIcon(icon);
            Btn_Register.setEnabled(true);
        }
    }//GEN-LAST:event_ImageLabelMouseExited

    private void Title_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Title_tfKeyPressed
        ImageLabel.setText("Drag image file here");
        new DropTarget(ImageLabel, imageInsert);
    }//GEN-LAST:event_Title_tfKeyPressed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_BackActionPerformed

    private void Btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegisterActionPerformed
        databaseConnect("books");
        String[] InvalidChars={"\\?","\\:","\\<","\\>","\\/","\\*","\"","\\|"};
        String destinationpath="";
        String validfilename=Title_tf.getText();

        for(String x:InvalidChars){
            validfilename=validfilename.replaceAll(x, "");
        }

        destinationpath="src/libsys_images/"+validfilename+".jpeg";
        
        try{
            int newBookID=randNumGen("books","bookid");
            //The columns that are easiest to enter
            rs.moveToInsertRow();
            rs.updateString("TITLE", Title_tf.getText());
            rs.updateString("AUTHOR", Author_tf.getText());
            rs.updateString("DATE",(Year_tf.getText()));
            rs.updateString("GENRE", Genre_tf.getText());
            rs.updateString("SYNOPSIS",Synopsis_ta.getText());
            rs.updateString("IMAGE",destinationpath);
            rs.updateInt("BOOKID", newBookID);
            rs.insertRow();
            refreshRsStmt("books");
                    databaseConnect("books");

            //The CopyImage method needs to throw an exception to work properly
            try {
                CopyImage(destinationpath);
            } catch (IOException ex) {
                Logger.getLogger(BookRegistry.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Registry is successful!");
            this.dispose();
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(null, err);
            System.out.println(err);
        }
    }//GEN-LAST:event_Btn_RegisterActionPerformed
  
    private void CopyImage(String destinationpath) throws IOException{
        Path source=Paths.get(imageInsert.ImagePath);
        //The temp.jpg file name will get renamed according to the title of the book
        Path destination=Paths.get(destinationpath);
        Files.copy(source, destination, StandardCopyOption.COPY_ATTRIBUTES);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author_tf;
    private Button_Gradient.ButtonGradient Btn_Register;
    private javax.swing.JTextField Genre_tf;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextArea Synopsis_ta;
    private javax.swing.JTextField Title_tf;
    private javax.swing.JTextField Year_tf;
    private Button_Gradient.ButtonGradient btn_Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private Panel_Gradient.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
