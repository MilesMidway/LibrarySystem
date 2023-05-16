package libsys;

import javax.swing.*;
import javax.imageio.*;
import java.awt.Image;
import java.sql.*;
import java.awt.image.*;
import java.io.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookViewer extends main {
    public BookViewer() {
        initComponents();
        lblOneBook.setVisible(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    String title, author, genre, date, synopsis, imagesrc, availability;
    int borrower;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Panel_Gradient.PanelRound();
        Availability_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Synopsis_label = new javax.swing.JTextArea();
        Title_label = new javax.swing.JLabel();
        Author_label = new javax.swing.JLabel();
        Genre_label = new javax.swing.JLabel();
        Date_label = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        btnEdit = new Button_Gradient.ButtonGradient();
        btnBorrow = new Button_Gradient.ButtonGradient();
        lblOneBook = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Availability_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Availability_label.setText("AVAILABLE");
        panelRound1.add(Availability_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 419, 90, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AUTHOR:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GENRE:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TITLE: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATE:");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Synopsis_label.setEditable(false);
        Synopsis_label.setColumns(20);
        Synopsis_label.setLineWrap(true);
        Synopsis_label.setRows(5);
        jScrollPane1.setViewportView(Synopsis_label);

        Title_label.setText("jLabel3");

        Author_label.setText("jLabel3");

        Genre_label.setText("jLabel3");

        Date_label.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Title_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Author_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Genre_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Author_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Genre_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        panelRound1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 23, -1, 490));

        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setText("Book Cover");
        ImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 254, 335));

        btnEdit.setBackground(new java.awt.Color(255, 204, 0));
        btnEdit.setForeground(new java.awt.Color(0, 0, 0));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_30px.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setColor1(new java.awt.Color(120, 255, 214));
        btnEdit.setColor2(new java.awt.Color(168, 255, 120));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelRound1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 130, 37));

        btnBorrow.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Borrow Book_30px.png"))); // NOI18N
        btnBorrow.setText("Borrow");
        btnBorrow.setColor1(new java.awt.Color(120, 255, 214));
        btnBorrow.setColor2(new java.awt.Color(168, 255, 120));
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });
        panelRound1.add(btnBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 23, 130, 37));

        lblOneBook.setText("You can only borrow one book at a time.");
        panelRound1.add(lblOneBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 250, 30));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 860, 530));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/199139574.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.dispose();
        sendDisplaySignal(new BookEditor());
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        databaseConnect("books");
        try 
        {
            rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
            while (rs.next()) 
            {
                availability = rs.getString("AVAILABILITY");
                borrower = rs.getInt("BORROWER");
            }
        }
        catch (SQLException err) 
        {
            System.out.println(err.getMessage());
        }

        if (availability.equals("AVAILABLE")) 
        {
           try{                    
                rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
                if (rs.next())
                {                    
                    rs.updateString("AVAILABILITY", "BORROWING");
                    rs.updateInt("BORROWER", currUserID);   
                    LocalDate currentDate = LocalDate.now();
                    LocalDate dueDate = currentDate.plusDays(3);
                    rs.updateDate("DUEDATE", java.sql.Date.valueOf(dueDate));
                    rs.updateRow();
                }
                JOptionPane.showMessageDialog(null, "You successfully borrowed the book.");
                refreshRsStmt("books");
                updateView();
                }
                catch(SQLException err)
                {
                    System.out.println(err);
                }                 
        }
        
        else if ((availability.equals("BORROWED") || availability.equals("BORROWING") || availability.equals("RETURNING")) && borrower != currUserID) 
        {
            JOptionPane.showMessageDialog(null, "Someone is in the process of borrowing this book, please try again later.");
        }
        
        else if (availability.equals("UNAVAILABLE"))
        {
            JOptionPane.showMessageDialog(null, "Sorry, this book is unavailable at this time");
        }

        else if ((availability.equals("BORROWING") || (availability.equals("BORROWED")) && borrower == currUserID)) 
        {
            int option = JOptionPane.showOptionDialog(null, "Do you want to return it?", "Return book", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (option == JOptionPane.YES_OPTION) 
            {
                try 
                {
                    rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
                    if (rs.next())
                    {
                        rs.updateString("AVAILABILITY", "RETURNING");
                        rs.updateRow();            
                    }
                    refreshRsStmt("books");
                    updateView();
                } 
                catch (SQLException err) 
                {
                    System.out.println(err);
                }
            }
        } 
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        updateView(); 
        databaseConnect("books"); 
        try {
            
            if(alreadyBorrowed()){
                if(!sameID()){
                lblOneBook.setVisible(true);
                btnBorrow.setEnabled(false);
                }
            }
            rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
            while (rs.next()) {
                title = rs.getString("TITLE");
                author = rs.getString("AUTHOR");
                genre = rs.getString("GENRE");
                date = rs.getString("DATE");
                synopsis = rs.getString("SYNOPSIS");
                imagesrc = rs.getString("IMAGE");
                availability = rs.getString("AVAILABILITY");
                Title_label.setText(title);
                Author_label.setText(author);
                Genre_label.setText(genre);
                Date_label.setText(date);
                Synopsis_label.setText(synopsis);
                Availability_label.setText(availability);

                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(imagesrc));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                Image dimg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(),
                        Image.SCALE_SMOOTH);

                ImageIcon icon = new ImageIcon(dimg);
                ImageLabel.setText(null);
                ImageLabel.setIcon(icon);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

     public static JButton hideBorrow()
    {
        return btnBorrow;
    }
    
    public static JButton hideEdit()
    {
        return btnEdit;
    }
    
    public void updateView()
    {
        databaseConnect("books");
        try 
        {
            rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
            while (rs.next()) 
            {
                Availability_label.setText(rs.getString("AVAILABILITY"));
                borrower = rs.getInt("BORROWER");
                availability = rs.getString("AVAILABILITY");

                if (availability.equals("AVAILABLE"))
                {
                    btnBorrow.setText("Borrow");
                }
                else if (availability.equals("UNAVAILABLE") || availability.equals("RETURNING"))
                {
                    btnBorrow.setVisible(false);
                }
                else if ((availability.equals("BORROWING") || (availability.equals("BORROWED")) && borrower == currUserID))
                {
                    btnBorrow.setText("Return");
                } 
            }
            refreshRsStmt("books");
        } 
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }
    
    public boolean alreadyBorrowed() throws SQLException
    {
       rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BORROWER = " + currUserID);
        return rs.next();
    }
    public boolean sameID() throws SQLException
    {
        int bookid = rs.getInt("BOOKID");
        refreshRsStmt("books");
        return bookid == currBookID;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author_label;
    private javax.swing.JLabel Availability_label;
    private javax.swing.JLabel Date_label;
    private javax.swing.JLabel Genre_label;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextArea Synopsis_label;
    private javax.swing.JLabel Title_label;
    private static Button_Gradient.ButtonGradient btnBorrow;
    private static Button_Gradient.ButtonGradient btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOneBook;
    private Panel_Gradient.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
