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
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        borrowTable = new javax.swing.JTable();
        rbBorrowing = new radio_button.RadioButtonCustom();
        rbReturning = new radio_button.RadioButtonCustom();
        btnAcceptBorrow = new Button_Gradient.ButtonGradient();
        btnDeny = new Button_Gradient.ButtonGradient();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelGradient1.setBackground(new java.awt.Color(102, 255, 153));
        panelGradient1.setColorGradient(new java.awt.Color(51, 255, 51));

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
        jScrollPane1.setBounds(740, 70, 512, 610);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOOK BORROWED");
        panelGradient1.add(jLabel2);
        jLabel2.setBounds(660, 20, 650, 37);

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BOOK BORROWING / RETURNING");
        panelGradient1.add(jLabel3);
        jLabel3.setBounds(70, 17, 690, 40);

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
        jScrollPane2.setBounds(160, 70, 505, 610);

        rbBorrowing.setBackground(new java.awt.Color(102, 102, 102));
        rbBorrowing.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbBorrowing.setForeground(new java.awt.Color(61, 31, 31));
        rbBorrowing.setText("Borrowing");
        rbBorrowing.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbBorrowingItemStateChanged(evt);
            }
        });
        panelGradient1.add(rbBorrowing);
        rbBorrowing.setBounds(20, 340, 120, 24);

        rbReturning.setBackground(new java.awt.Color(69, 41, 41));
        rbReturning.setForeground(new java.awt.Color(61, 42, 42));
        rbReturning.setText("Returning");
        rbReturning.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbReturningItemStateChanged(evt);
            }
        });
        panelGradient1.add(rbReturning);
        rbReturning.setBounds(20, 370, 120, 28);

        btnAcceptBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_14px_1.png"))); // NOI18N
        btnAcceptBorrow.setText("ACCEPT");
        btnAcceptBorrow.setColor1(new java.awt.Color(63, 28, 28));
        btnAcceptBorrow.setColor2(new java.awt.Color(75, 53, 53));
        btnAcceptBorrow.setSizeSpeed(0.5F);
        btnAcceptBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptBorrowActionPerformed(evt);
            }
        });
        panelGradient1.add(btnAcceptBorrow);
        btnAcceptBorrow.setBounds(20, 250, 110, 60);

        btnDeny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove_14px.png"))); // NOI18N
        btnDeny.setText("DENY");
        btnDeny.setColor1(new java.awt.Color(64, 44, 44));
        btnDeny.setColor2(new java.awt.Color(47, 30, 30));
        btnDeny.setSizeSpeed(0.5F);
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });
        panelGradient1.add(btnDeny);
        btnDeny.setBounds(20, 440, 110, 60);

        jPanel1.setBackground(new java.awt.Color(76, 39, 39));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        panelGradient1.add(jPanel1);
        jPanel1.setBounds(140, 60, 1130, 650);

        jPanel2.setBackground(new java.awt.Color(60, 31, 31));
        jPanel2.setForeground(new java.awt.Color(58, 38, 38));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelGradient1.add(jPanel2);
        jPanel2.setBounds(860, 10, 260, 50);

        jPanel3.setBackground(new java.awt.Color(58, 34, 34));
        jPanel3.setForeground(new java.awt.Color(79, 46, 46));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelGradient1.add(jPanel3);
        jPanel3.setBounds(240, 10, 350, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 1383, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1290, 750));
        setLocationRelativeTo(null);
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

                refreshRsStmt("books");
                updateBorrowedTable();
                borrowTableModel.setRowCount(0);

                // Store data from ResultSet in a separate data structure
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

                // Use the stored data for subsequent iteration
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private Panel_Gradient.PanelGradient panelGradient1;
    private radio_button.RadioButtonCustom rbBorrowing;
    private radio_button.RadioButtonCustom rbReturning;
    // End of variables declaration//GEN-END:variables
}
