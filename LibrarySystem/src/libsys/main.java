package libsys;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class main extends javax.swing.JFrame {

    // init connection to databases
    Connection con;
    Statement stmt;
    ResultSet rs;
    // displaying the database table
    DefaultTableModel LoginModel = new DefaultTableModel();
    // universal variables for accounts database
    String usiFullName, usiPass, usicPass, usiUsertype, 
           usuFullName, usuPass, usucPass, usuUserType;
    int usiId, usuID;
    boolean matchAcc = false, matchPass = false, matchType = false;
    // variables for books databases
    String t;
    // personalization variables
    public static String currFullName;

    // Connects to the reffered database
    public void databaseConnect(String dbName) {
        try {
            String host = "jdbc:derby://localhost:1527/" + dbName;
            String uName = "userdb";
            String uPass = "0000";

            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM USERDB." + dbName.toUpperCase();
            rs = stmt.executeQuery(sql);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(main.this, err.getMessage());
        }
    }

    // Refreshes the reffered database contents
    public void refreshRsStmt(String dbName) {
        try {
            stmt.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM USERDB." + dbName.toUpperCase();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Gets called in every end of a JFrame so everything goes through the main
    // rather than being thrown and adjusted from JFrame to JFrame
    public static void sendDisplaySignal(JFrame sig) {
        JFrame[] jframe = {
            new MainWindow(), new AdminSignIn(), new LibrarianSignIn(), 
            new LibrarianSignUp(), new ReaderSignIn(), new ReaderSignUp(), 
            new AdminBase(), new BookRegistry(),
        };
        for (JFrame jframe1 : jframe) {
            if (jframe1.getClass().equals(sig.getClass())) {
                //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  // adapt to machinee's screen size
                //jframe1.setSize(screenSize.width, screenSize.height); // set size to screen size
                jframe1.setVisible(true);
            }
        }
    }
    
    // [DEPRECATED]
    // When called, it provides a random number for the unique ID of databases
    public int randNumGen(String dbName, String dbId) {
        Random random = new Random();
        int randNum = random.nextInt(9999); // generates a random integer between 1 and 99999 which is the limit

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT " + dbId.toUpperCase() + " FROM " + dbName.toUpperCase() + " WHERE USERID=" + randNum);
            // check if the generated random number recursively if it already exists in the database
            while (rs.next()) {
                randNum = random.nextInt(9999);
                rs = stmt.executeQuery("SELECT " + dbId.toUpperCase() + " FROM " + dbName.toUpperCase() + " WHERE USERID=" + randNum);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return randNum;
    }

    // Gets called after signing up or signing in
    // Sends the full name of the current user to display name
    public void readerUpInComplete() {
        ReaderBase readerBase = new ReaderBase(currFullName);
        readerBase.initialSearch(); // Readying the Search Engine
        readerBase.setVisible(true); // <--- It goes to
    }
    
    //[POSSIBLE BUG] Did not yet account for where the librarian goes once registered
    public void signUp(String usuFullName, String usuPass, String userType, JTextField txtNewName, JPasswordField txtNewPass, JPasswordField txtNewPassConf, JLabel lblPassNotAligned)
    {
        try 
        {  
            if (!String.valueOf(txtNewPass.getPassword()).equals(String.valueOf(txtNewPassConf.getPassword())))
                lblPassNotAligned.setVisible(true);
            else
            {
                rs.moveToInsertRow();
                rs.updateString("PASSWORD", usuPass);
                rs.updateString("FULLNAME", usuFullName);
                rs.updateInt("USERID", 1235); // <--- Still needs the auto-increment function
                rs.updateString("USERTYPE", "READER");
                rs.insertRow();
                refreshRsStmt("accounts");
                
                JOptionPane.showMessageDialog(null, "Registration Complete!");
                this.dispose();
                currFullName = usuFullName;
                toUsertypeBases(userType);
                
            }
            refreshRsStmt("accounts");
        } 
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }

    //[POSSIBLE BUG] Did not yet consider for where the the librarian go once signed in
    public void signIn(String usiFullName, String usiPass, String userType, JTextField txtLogName, JPasswordField txtLogPass)
    {
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT PASSWORD FROM ACCOUNTS WHERE FULLNAME='" + usiFullName + "'");
            if (rs.next()) 
            {
                usicPass = rs.getString("PASSWORD");
                if (usiPass.equals(usicPass)) 
                {
                    stmt = con.createStatement();
                    rs = stmt.executeQuery("SELECT USERTYPE FROM ACCOUNTS WHERE FULLNAME='" + usiFullName + "'");
                    if (rs.next()) 
                    {
                        usiUsertype = rs.getString("USERTYPE");
                        if (usiUsertype.equals(userType))
                        {
                            matchAcc = true; 
                            matchPass = true;
                            matchType = true;
                        }
                        else
                        {
                            matchAcc = true; 
                            matchPass = true;
                        }
                    }
                }
                else 
                {
                    matchAcc = true;
                }
            } 
            refreshRsStmt("accounts");
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
        
        if (matchAcc && matchPass && matchType)
        {
            JOptionPane.showMessageDialog(null, "Successfully Logged in!");
            this.dispose();
            currFullName = usiFullName;
            toUsertypeBases(userType);
        }
        else if (matchAcc && matchPass && !matchType)
        {
            JOptionPane.showMessageDialog(null, "Wrong Sign up form.");
            // add redirection feature
        }
        else if (matchAcc && !matchPass)
        {
            txtLogName.setText(null);
            txtLogPass.setText(null);
            JOptionPane.showMessageDialog(null, "Incorrect Password!");
        }
        else
        {
            txtLogName.setText(null);
            txtLogPass.setText(null);
            JOptionPane.showMessageDialog(null, "Account not found!", "",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void toUsertypeBases(String userType)
    {
        switch (userType)
            {
                case "ADMIN":
                    sendDisplaySignal(new AdminBase()); break;
                case "LIBRARIAN":
                    sendDisplaySignal(new BookRegistry()); break;
                case "READER":
                    readerUpInComplete(); break;
            }
    }
    
    // The first statement/s to be called
    public static void main(String[] args) {
        sendDisplaySignal(new MainWindow());
    }
}
