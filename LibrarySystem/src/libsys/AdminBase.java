
package libsys;

import java.awt.Color;
import static java.awt.Color.red;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import libsys.AdminBase;

public class AdminBase extends main {
    DefaultTableModel tblDataAccounts = new DefaultTableModel();
    int x = 0;
    public int ids;

    public AdminBase() {
        initComponents();
        
        btnSave.setVisible(false);
        btnEdit.setVisible(false);
        btnDelete.setVisible(false);
        cbUserType.setSelectedIndex(-1);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new textfield.TextField();
        txtFullname = new textfield.TextField();
        txtUserId = new textfield.TextField();
        cbUserType = new combobox.Combobox();
        btnSave = new Button_Gradient.ButtonGradient();
        btnAdd = new Button_Gradient.ButtonGradient();
        btnEdit = new Button_Gradient.ButtonGradient();
        btnDelete = new Button_Gradient.ButtonGradient();
        btnLogOut = new Button_Gradient.ButtonGradient();
        btnSearch = new Button_Gradient.ButtonGradient();
        randomNumber = new Button_Gradient.ButtonGradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fill1 = new javax.swing.JPanel();
        fill2 = new javax.swing.JPanel();
        fill3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(32, 58, 67));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 277, 720, 10));

        kGradientPanel1.setBackground(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkEndColor(new java.awt.Color(100, 179, 244));
        kGradientPanel1.setkStartColor(new java.awt.Color(194, 229, 156));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USERS ACCOUNTS:");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -3, 780, 70));

        txtPassword.setLabelText("Password:");
        kGradientPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 430, -1));

        txtFullname.setLabelText("Fullname:");
        kGradientPanel1.add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 430, -1));

        txtUserId.setLabelText("Used ID:");
        kGradientPanel1.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 430, -1));

        cbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "READER", "LIBRARIAN", "ADMIN" }));
        cbUserType.setLabeText("User Type:");
        kGradientPanel1.add(cbUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 430, -1));

        btnSave.setBackground(new java.awt.Color(32, 58, 67));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_14px.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setColor1(new java.awt.Color(32, 58, 67));
        btnSave.setColor2(new java.awt.Color(32, 58, 67));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        btnAdd.setBackground(new java.awt.Color(32, 58, 67));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_14px_1.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setColor1(new java.awt.Color(32, 58, 67));
        btnAdd.setColor2(new java.awt.Color(32, 58, 67));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, -1, -1));

        btnEdit.setBackground(new java.awt.Color(32, 58, 67));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_14px.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setColor1(new java.awt.Color(32, 58, 67));
        btnEdit.setColor2(new java.awt.Color(32, 58, 67));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        btnDelete.setBackground(new java.awt.Color(32, 58, 67));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove_14px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setColor1(new java.awt.Color(32, 58, 67));
        btnDelete.setColor2(new java.awt.Color(32, 58, 67));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, -1, -1));

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
        kGradientPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, -1, -1));

        btnSearch.setBackground(new java.awt.Color(32, 58, 67));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_14px.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setColor1(new java.awt.Color(32, 58, 67));
        btnSearch.setColor2(new java.awt.Color(32, 58, 67));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, -1, -1));

        randomNumber.setBackground(new java.awt.Color(32, 58, 67));
        randomNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/where_what_quest_14px.png"))); // NOI18N
        randomNumber.setText("Random Number");
        randomNumber.setColor1(new java.awt.Color(66, 39, 90));
        randomNumber.setColor2(new java.awt.Color(66, 39, 90));
        randomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomNumberActionPerformed(evt);
            }
        });
        kGradientPanel1.add(randomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        mainTable.setModel(tblDataAccounts);
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(mainTable);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 620, 188));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aesthetic-website-backgrounds.gif"))); // NOI18N
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 280));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_tag_40px.png"))); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 40, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name_40px.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 40, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password_40px.png"))); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 40, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/orcid_40px.png"))); // NOI18N
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 40, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3756077.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 780, 390));
        kGradientPanel1.add(fill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 430, 40));
        kGradientPanel1.add(fill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 430, 40));
        kGradientPanel1.add(fill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 430, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        databaseConnect("accounts");
        int ids = randNumGen("accounts", "userid");
        txtUserId.setText(String.valueOf(ids));
        String[] columnNames = {"User ID", "Fullname", "Password", "User Type"};
        tblDataAccounts.setColumnIdentifiers(columnNames);
        tblDataAccounts.setRowCount(0);
        
        try {
            while(rs.next()) {
                tblDataAccounts.addRow(new Object[] 
                {
                    rs.getInt("USERID"), 
                    rs.getString("FULLNAME"), 
                    rs.getString("PASSWORD"), 
                    rs.getString("USERTYPE")
                });
                x++;
            }
            refreshRsStmt("accounts");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened
      
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int ids = Integer.parseInt(mainTable.getValueAt(mainTable.getSelectedRow(), 
             0).toString());
        aFullname = txtFullname.getText();
        aPassword = txtPassword.getText();
        aUserType = String.valueOf(cbUserType.getSelectedItem());
        
        try {
            if (aFullname.isEmpty() || aPassword.isEmpty() || txtUserId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill in the blanks.");
                if (aFullname.isEmpty()) {
                    fill1.setBorder(BorderFactory.createLineBorder(Color.red));
                } 
                if (aPassword.isEmpty()) {
                    fill2.setBorder(BorderFactory.createLineBorder(Color.red));
                }
                if (txtUserId.getText().isEmpty()) {
                    fill3.setBorder(BorderFactory.createLineBorder(Color.red));
                }                
            }
            else if(lessthanLength(10, txtFullname) || lessthanLength(8, txtPassword)) {
                if(lessthanLength(10, txtFullname)){
                    fill1.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Name less than 10 characters.");
                }
                if(lessthanLength(8,txtPassword)){
                    fill2.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Password less than 8 characters.");
                }
                if(lessthanLength(10, txtFullname) && lessthanLength(8,txtPassword)){
                    fill3.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Name length less than 10 characters, Password length less than 8 characters.");
                }
            }
            else{
            aUserID = Integer.parseInt(txtUserId.getText());                
            boolean b = stmt.execute("UPDATE ACCOUNTS SET FULLNAME = '" + txtFullname.getText() + "', PASSWORD = '" + txtPassword.getText() + "'"
                    + ", USERTYPE = '" + String.valueOf(cbUserType.getSelectedItem()) + "' WHERE USERID = " + ids);                
                if (!b) {
                    JOptionPane.showMessageDialog(null, "The account has been updated!");

                    txtFullname.setText(null);
                    txtPassword.setText(null);
                    cbUserType.setSelectedIndex(0);

                    btnAdd.setVisible(true);
                    btnSave.setVisible(false);
                    btnEdit.setVisible(false);
                    btnDelete.setVisible(false);

                    refreshRsStmt("accounts");
                    formWindowOpened(null);
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        aFullname = txtFullname.getText();
        aPassword = txtPassword.getText();
        aUserType = String.valueOf(cbUserType.getSelectedItem());
        
        try {
            if (aFullname.isEmpty() || aPassword.isEmpty() || txtUserId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill in the blanks.");
                if (aFullname.isEmpty()) {
                    fill1.setBorder(BorderFactory.createLineBorder(Color.red));
                } 
                if (aPassword.isEmpty()) {
                    fill2.setBorder(BorderFactory.createLineBorder(Color.red));
                }
                if (txtUserId.getText().isEmpty()) {
                    fill3.setBorder(BorderFactory.createLineBorder(Color.red));
                }                
            }
            else if(lessthanLength(10, txtFullname) || lessthanLength(8, txtPassword)) {
                if(lessthanLength(10, txtFullname)){
                    fill1.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Name less than 10 characters.");
                }
                if(lessthanLength(8,txtPassword)){
                    fill2.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Password less than 8 characters.");
                }
                if(lessthanLength(10, txtFullname) && lessthanLength(8,txtPassword)){
                    fill3.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Name length less than 10 characters, Password length less than 8 characters.");
                }                
            }
            else {
                aUserID = Integer.parseInt(txtUserId.getText());                
                rs.moveToInsertRow();
                rs.updateInt("USERID", aUserID);
                rs.updateString("FULLNAME", aFullname);
                rs.updateString("PASSWORD", aPassword);
                rs.updateString("USERTYPE", aUserType);
                rs.insertRow();
                refreshRsStmt("accounts");
                formWindowOpened(null);

                JOptionPane.showMessageDialog(null, "Account has been added!");

                int ids = randNumGen("accounts", "userid");
                
                txtUserId.setText(String.valueOf(ids));
                txtFullname.setText(null);
                txtPassword.setText(null);
                cbUserType.setSelectedIndex(0);
                
                fill1.setVisible(false);
                fill2.setVisible(false);
                fill3.setVisible(false);
            }
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtFullname.setEditable(true);
        txtPassword.setEditable(true);
        txtUserId.setEditable(true);
        
        cbUserType.setEnabled(true);
        btnSave.setEnabled(true);
        
        randomNumber.setEnabled(true);
        refreshRsStmt("accounts");
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int del;

        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM ACCOUNTS WHERE USERID = " + ids);
            if (rs.next()) {
                del = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this account?", 
                        "Confirmation", JOptionPane.YES_NO_OPTION);
                if (del == 0) {
                    boolean hasBorrowedBooks = checkBorrowedBooks(ids);

                    if (hasBorrowedBooks) {
                        int confirm = JOptionPane.showConfirmDialog(null, "This account has borrowed books. Do you want to proceed with deletion?",
                                "Confirmation", JOptionPane.YES_NO_OPTION);
                        if (confirm == 0) {

                            rs.deleteRow();

                            JOptionPane.showMessageDialog(null, "Account has been deleted!");
                          

                            //int ids = randNumGen("accounts", "userid");

                            //txtUserId.setText(String.valueOf(ids));
                            txtFullname.setText(null);
                            txtPassword.setText(null);
                            cbUserType.setSelectedIndex(0);
                            txtFullname.setText(null);
                            txtPassword.setText(null);

                            btnAdd.setVisible(true);
                            btnSave.setVisible(false);
                            btnEdit.setVisible(false);
                            btnDelete.setVisible(false);

                            txtFullname.setEditable(true);
                            txtPassword.setEditable(true);
                            txtUserId.setEditable(true);

                            cbUserType.setEnabled(true);
                            randomNumber.setEnabled(true);
                            formWindowOpened(null);
                        }
                    } else {
                        
                        rs.deleteRow();
            
                        JOptionPane.showMessageDialog(null, "Account has been deleted!");

                        //int ids = randNumGen("accounts", "userid");

                        //txtUserId.setText(String.valueOf(ids));
                        txtFullname.setText(null);
                        txtPassword.setText(null);
                        cbUserType.setSelectedIndex(0);
                        txtFullname.setText(null);
                        txtPassword.setText(null);

                        btnAdd.setVisible(true);
                        btnSave.setVisible(false);
                        btnEdit.setVisible(false);
                        btnDelete.setVisible(false);

                        txtFullname.setEditable(true);
                        txtPassword.setEditable(true);
                        txtUserId.setEditable(true);

                        cbUserType.setEnabled(true);
                        randomNumber.setEnabled(true);
                        
                        
                        updateBorrowedBooks(ids);
                        formWindowOpened(null);
                    }
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchUserId;
        
        searchUserId = JOptionPane.showInputDialog(null, "Search for User ID:", "Finding the Account", 
                JOptionPane.QUESTION_MESSAGE);
        if(searchUserId!=null){
            try{
                int newId = Integer.parseInt(searchUserId); 
                txtFullname.setEditable(false);
                txtPassword.setEditable(false);
                txtUserId.setEditable(false);
                cbUserType.setEnabled(false);

                try {
                    ResultSet rs = stmt.executeQuery("SELECT * FROM ACCOUNTS WHERE USERID = " 
                            + searchUserId);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "User ID: " + aUserID + "\nFullname: " + rs.getString("FULLNAME") +
                                    "\nPassword: " + rs.getString("PASSWORD") + "\nUser Type: " + rs.getString("USERTYPE"), "Account Details", 
                                    JOptionPane.INFORMATION_MESSAGE);

                        txtFullname.setText(rs.getString("FULLNAME"));
                        txtPassword.setText(rs.getString("PASSWORD"));
                        txtUserId.setText(String.valueOf(aUserID));
                        cbUserType.setSelectedItem(rs.getString("USERTYPE"));
                        } else {
                            JOptionPane.showMessageDialog(null, "Account not Found!");
                        }
                } catch (SQLException err) {
                    JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
                }        
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer value.");
            }
        }   
    }//GEN-LAST:event_btnSearchActionPerformed

    private void randomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomNumberActionPerformed
       int ids = randNumGen("accounts", "userid");
        
       txtUserId.setText(String.valueOf(ids));
    }//GEN-LAST:event_randomNumberActionPerformed

    private void mainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMouseClicked
       
    }//GEN-LAST:event_mainTableMouseClicked

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        logOut();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void mainTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMousePressed
        ids = Integer.parseInt(mainTable.getValueAt(mainTable.getSelectedRow(), 0).toString());
        
        btnSave.setVisible(true);
        btnEdit.setVisible(true);
        btnDelete.setVisible(true);
    }//GEN-LAST:event_mainTableMousePressed

    private boolean checkBorrowedBooks(int userId) {
        try {
            databaseConnect("books");
            ResultSet rs = stmt.executeQuery("SELECT AVAILABILITY FROM BOOKS WHERE BORROWER = " + userId);
            if (rs.next()) {
                String availability = rs.getString("AVAILABILITY");
                if (availability.equals("BORROWED") || availability.equals("RETURNING")) {
                    //databaseConnect("accounts");
                    return true;
                }
            }
            return false;
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
            return false;
        }
    }
    
    private void updateBorrowedBooks(int userId) {
        try {
            databaseConnect("books");
            ResultSet rs = stmt.executeQuery("SELECT AVAILABILITY, BORROWER, DUEDATE FROM BOOKS WHERE BORROWER = " + userId);
            if (rs.next()) {
                rs.updateString("AVAILABILITY", "AVAILABLE");
                rs.updateNull("BORROWER");
                rs.updateNull("DUEDATE");
                rs.updateRow();
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnAdd;
    private Button_Gradient.ButtonGradient btnDelete;
    private Button_Gradient.ButtonGradient btnEdit;
    private Button_Gradient.ButtonGradient btnLogOut;
    private Button_Gradient.ButtonGradient btnSave;
    private Button_Gradient.ButtonGradient btnSearch;
    private combobox.Combobox cbUserType;
    private javax.swing.JPanel fill1;
    private javax.swing.JPanel fill2;
    private javax.swing.JPanel fill3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable mainTable;
    private Button_Gradient.ButtonGradient randomNumber;
    private textfield.TextField txtFullname;
    private textfield.TextField txtPassword;
    private textfield.TextField txtUserId;
    // End of variables declaration//GEN-END:variables

}