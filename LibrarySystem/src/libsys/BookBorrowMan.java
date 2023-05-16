package libsys;

import java.awt.event.ItemEvent;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAcceptBorrow = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        borrowTable = new javax.swing.JTable();
        rbBorrowing = new javax.swing.JRadioButton();
        rbReturning = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        borrowedTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnDeny = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("BOOK BORROWED");

        btnAcceptBorrow.setText("ACCEPT");
        btnAcceptBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptBorrowActionPerformed(evt);
            }
        });

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

        rbBorrowing.setText("Borrowing");
        rbBorrowing.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbBorrowingItemStateChanged(evt);
            }
        });

        rbReturning.setText("Returning");
        rbReturning.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbReturningItemStateChanged(evt);
            }
        });

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("BOOK BORROWING / RETURNING");

        btnDeny.setText("DENY");
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbBorrowing, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbReturning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAcceptBorrow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDeny, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnAcceptBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(rbBorrowing)
                        .addGap(29, 29, 29)
                        .addComponent(rbReturning)
                        .addGap(36, 36, 36)
                        .addComponent(btnDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void borrowTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowTableMouseClicked
        Object val = borrowTable.getValueAt(borrowTable.getSelectedRow(), 2);
        borrBookID = Integer.parseInt(val.toString());
    }//GEN-LAST:event_borrowTableMouseClicked

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

               refreshRsStmt("books");
               updateBorrowedTable();
               borrowTableModel.setRowCount(0);

               List<Object[]> resultSetData = new ArrayList<>();
               while (updateRs.next()) {
                   availability = updateRs.getString("AVAILABILITY");
                   if (availability.equals("RETURNING") || availability.equals("BORROWING")) {
                       resultSetData.add(new Object[]{
                           updateRs.getString("BORROWER"),
                           updateRs.getString("TITLE"),
                           updateRs.getInt("BOOKID"),
                           availability
                       });
                   }
               }

               for (Object[] rowData : resultSetData) {
                   borrowTableModel.addRow(rowData);
               }

               bgBorrower.clearSelection();

               // Close ResultSet and Statement
               updateRs.close();
               updateStmt.close();
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
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookBorrowMan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgBorrower;
    private javax.swing.JTable borrowTable;
    private javax.swing.JTable borrowedTable;
    private javax.swing.JButton btnAcceptBorrow;
    private javax.swing.JButton btnDeny;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbBorrowing;
    private javax.swing.JRadioButton rbReturning;
    // End of variables declaration//GEN-END:variables
}
