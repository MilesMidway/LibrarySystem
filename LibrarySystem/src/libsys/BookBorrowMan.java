package libsys;

import java.awt.event.ItemEvent;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookBorrowMan extends main {

    public BookBorrowMan() {
        initComponents();
        borrowTable.setDefaultEditor(Object.class, null);
        borrowedTable.setDefaultEditor(Object.class, null);
        bgBorrower.add(rbBorrowing);
        bgBorrower.add(rbReturning);
    }

    private DefaultTableModel borrowTableModel;
    private DefaultTableModel borrowedTableModel;
    public static int borrBookID;
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBorrower = new javax.swing.ButtonGroup();
        panelGradient1 = new Panel_Gradient.PanelGradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        borrowedTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        borrowTable = new javax.swing.JTable();
        rbBorrowing = new radio_button.RadioButtonCustom();
        rbReturning = new radio_button.RadioButtonCustom();
        btnAcceptBorrow = new Button_Gradient.ButtonGradient();
        btnDeny = new Button_Gradient.ButtonGradient();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelGradient1.setBackground(new java.awt.Color(131, 96, 195));
        panelGradient1.setColorGradient(new java.awt.Color(46, 191, 145));

        borrowedTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrowedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(borrowedTable);

        panelGradient1.add(jScrollPane1);
        jScrollPane1.setBounds(780, 260, 512, 663);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BOOK BORROWING / RETURNING");
        panelGradient1.add(jLabel3);
        jLabel3.setBounds(20, 20, 690, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOOK BORROWED");
        panelGradient1.add(jLabel2);
        jLabel2.setBounds(710, 20, 650, 37);

        borrowTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        borrowTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(borrowTable);

        panelGradient1.add(jScrollPane2);
        jScrollPane2.setBounds(150, 260, 505, 663);

        rbBorrowing.setBackground(new java.awt.Color(51, 51, 255));
        rbBorrowing.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbBorrowing.setForeground(new java.awt.Color(255, 0, 0));
        rbBorrowing.setText("Borrowing");
        rbBorrowing.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbBorrowingItemStateChanged(evt);
            }
        });
        panelGradient1.add(rbBorrowing);
        rbBorrowing.setBounds(50, 370, 90, 19);

        rbReturning.setBackground(new java.awt.Color(51, 51, 255));
        rbReturning.setForeground(new java.awt.Color(255, 0, 0));
        rbReturning.setText("Returning");
        rbReturning.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbReturningItemStateChanged(evt);
            }
        });
        panelGradient1.add(rbReturning);
        rbReturning.setBounds(50, 400, 90, 23);

        btnAcceptBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/qweqewq.png"))); // NOI18N
        btnAcceptBorrow.setText("ACCEPT");
        btnAcceptBorrow.setColor1(new java.awt.Color(24, 184, 10));
        btnAcceptBorrow.setColor2(new java.awt.Color(13, 93, 142));
        btnAcceptBorrow.setSizeSpeed(0.5F);
        btnAcceptBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptBorrowActionPerformed(evt);
            }
        });
        panelGradient1.add(btnAcceptBorrow);
        btnAcceptBorrow.setBounds(30, 460, 110, 60);

        btnDeny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove_14px.png"))); // NOI18N
        btnDeny.setText("DENY");
        btnDeny.setColor1(new java.awt.Color(24, 184, 10));
        btnDeny.setColor2(new java.awt.Color(13, 93, 142));
        btnDeny.setSizeSpeed(0.5F);
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });
        panelGradient1.add(btnDeny);
        btnDeny.setBounds(30, 570, 110, 60);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edb8b3da20cdc65f496b6b4dc3fe463d.gif"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelGradient1.add(jLabel5);
        jLabel5.setBounds(20, 20, 690, 190);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edb8b3da20cdc65f496b6b4dc3fe463d.gif"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelGradient1.add(jLabel4);
        jLabel4.setBounds(710, 20, 650, 190);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3346817.jpg"))); // NOI18N
        panelGradient1.add(jLabel1);
        jLabel1.setBounds(20, 210, 1340, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 1383, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String[] columnNames1 = {"BorrowerID", "Title", "BookID", "Availability"};
        borrowTableModel = new DefaultTableModel(columnNames1, 0);
        borrowTable.setModel(borrowTableModel);

        databaseConnect("books");
        try {
            rs = stmt.executeQuery("SELECT BORROWER, TITLE, BOOKID, AVAILABILITY FROM BOOKS WHERE AVAILABILITY = 'BORROWING' OR AVAILABILITY = 'RETURNING'");
            while (rs.next()) {
                borrowTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getString("AVAILABILITY")
                });
            }
            refreshRsStmt("books");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        
        String[] columnNames2 = {"BorrowerID", "Title", "BookID", "Duedate"};
        borrowedTableModel = new DefaultTableModel(columnNames2, 0);
        borrowedTable.setModel(borrowedTableModel);

        databaseConnect("books");
        try {
            rs = stmt.executeQuery("SELECT BORROWER, TITLE, BOOKID, DUEDATE FROM BOOKS WHERE AVAILABILITY = 'BORROWED'");
            while (rs.next()) {
                borrowedTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getDate("DUEDATE")
                });
            }
            refreshRsStmt("books");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void borrowTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowTableMouseClicked
        Object val = borrowTable.getValueAt(borrowTable.getSelectedRow(), 2);
        borrBookID = Integer.parseInt(val.toString());
    }//GEN-LAST:event_borrowTableMouseClicked

    private void rbBorrowingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbBorrowingItemStateChanged
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            databaseConnect("books");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("SELECT BORROWER, TITLE, BOOKID, AVAILABILITY FROM BOOKS WHERE AVAILABILITY = 'BORROWING'");
            borrowTableModel.setRowCount(0);
            while (rs.next()) {
                borrowTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getString("AVAILABILITY")
                });
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_rbBorrowingItemStateChanged

    private void rbReturningItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbReturningItemStateChanged
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            databaseConnect("books");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("SELECT BORROWER, TITLE, BOOKID, AVAILABILITY, DUEDATE FROM BOOKS WHERE AVAILABILITY = 'RETURNING'");
            borrowTableModel.setRowCount(0);
            while (rs.next()) {
                borrowTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getString("AVAILABILITY")
                });
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_rbReturningItemStateChanged

    private void btnAcceptBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptBorrowActionPerformed
       if (borrowTable.getSelectedRow() != -1) {
            try {
                int selectedRow = borrowTable.getSelectedRow();
                Object val = borrowTable.getValueAt(selectedRow, 2);
                borrBookID = Integer.parseInt(val.toString());

                String availability = null;
                Statement updateStmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet updateRs = updateStmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + borrBookID);

                if (updateRs.next()) {
                    Date localNow = Date.valueOf(LocalDate.now());
                    Date bookDue = updateRs.getDate("DUEDATE");
                    long diff_of_dates = dateDiff(bookDue, localNow);
                    availability = updateRs.getString("AVAILABILITY");

                    if (availability.equals("BORROWING")) {
                        availability = "BORROWED";
                    } else if (availability.equals("RETURNING") && (diff_of_dates >= 0)) {
                        availability = "AVAILABLE";
                        updateRs.updateNull("BORROWER");
                        updateRs.updateNull("DUEDATE");
                    } else {
                        JOptionPane.showMessageDialog(null, "Book Overdue. Please handle the case for overdue books.");
                    }

                    updateRs.updateString("AVAILABILITY", availability);
                    updateRs.updateRow();
                }

                updateRs.close();
                updateStmt.close();
                refreshRsStmt("books");
                updateBorrowedTable();
                borrowTableModel.setRowCount(0);

                updateRs.beforeFirst();
                while (updateRs.next()) {
                    availability = updateRs.getString("AVAILABILITY");
                    if (availability.equals("RETURNING") || availability.equals("BORROWING")) {
                        borrowTableModel.addRow(new Object[]{
                            updateRs.getString("BORROWER"),
                            updateRs.getString("TITLE"),
                            updateRs.getInt("BOOKID"),
                            availability
                        });
                    }
                }

                bgBorrower.clearSelection();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Error: " + err.getMessage());
            }
        }
    }//GEN-LAST:event_btnAcceptBorrowActionPerformed

    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        if (borrowTable.getSelectedRow() != -1) {
            try {
                int selectedRow = borrowTable.getSelectedRow();
                Object val = borrowTable.getValueAt(selectedRow, 2);
                borrBookID = Integer.parseInt(val.toString());

                String availability = null;
                Statement updateStmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet updateRs = updateStmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + borrBookID);

                while (updateRs.next()) {
                    availability = updateRs.getString("AVAILABILITY");
                    if (availability.equals("BORROWING")) {
                        availability = "AVAILABLE";
                    } else if (availability.equals("RETURNING")) {
                        availability = "BORROWED";
                    } else {
                        JOptionPane.showMessageDialog(null, "Book Overdue. Please handle the case for overdue books.");
                    }

                    updateRs.updateString("AVAILABILITY", availability);
                    updateRs.updateRow();
                }

                updateRs.close();
                updateStmt.close();
                refreshRsStmt("books");
                updateBorrowedTable();
                borrowTableModel.setRowCount(0);

                Statement selectStmt = con.createStatement();
                ResultSet selectRs = selectStmt.executeQuery("SELECT * FROM BOOKS");

                while (selectRs.next()) {
                    availability = selectRs.getString("AVAILABILITY");
                    if (availability.equals("RETURNING") || availability.equals("BORROWING")) {
                        borrowTableModel.addRow(new Object[]{
                            selectRs.getString("BORROWER"),
                            selectRs.getString("TITLE"),
                            selectRs.getInt("BOOKID"),
                            availability
                        });
                    }
                }

                selectRs.close();
                selectStmt.close();
                bgBorrower.clearSelection();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Error: " + err.getMessage());
            }
        }
    }//GEN-LAST:event_btnDenyActionPerformed

    public void updateBorrowedTable() throws SQLException {
        borrowedTableModel.setRowCount(0);
        rs.beforeFirst(); 
        rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE AVAILABILITY = 'BORROWED'");
        while (rs.next()) {
            String bookAvailability = rs.getString("AVAILABILITY");
            if (bookAvailability.equals("BORROWED")) {
                borrowedTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getDate("DUEDATE")
                });
            }
        }
    }

    public void updateBorrowTable() throws SQLException {
        borrowTableModel.setRowCount(0);
        rs.beforeFirst(); 
        rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE AVAILABILITY = 'BORROWING' AND AVAILABILITY = 'BORROWING'");
        while (rs.next()) {
            String bookAvailability = rs.getString("AVAILABILITY");
            if (bookAvailability.equals("BORROWING") || bookAvailability.equals("RETURNING")) {
                borrowTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    bookAvailability
                });
            }
        }
}
    public long dateDiff(Date duedate, Date currentdate){
        long millDiff = duedate.getTime() - currentdate.getTime();
        long daysDiff = millDiff/(1000 * 60 * 60 * 24);
        return daysDiff;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgBorrower;
    private javax.swing.JTable borrowTable;
    private javax.swing.JTable borrowedTable;
    private Button_Gradient.ButtonGradient btnAcceptBorrow;
    private Button_Gradient.ButtonGradient btnDeny;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private Panel_Gradient.PanelGradient panelGradient1;
    private radio_button.RadioButtonCustom rbBorrowing;
    private radio_button.RadioButtonCustom rbReturning;
    // End of variables declaration//GEN-END:variables
}
