package managmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Db {

    static private Connection con;
    static private Statement st;
    static private ResultSet rs;
    static private PreparedStatement stm;

    public static Connection getConnection() throws Exception {
        if (con == null) {
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "admin";
            String userName = "root";
            String Password = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                // establish connection  
                con = DriverManager.getConnection(url + dbName, userName, Password);
            } catch (SQLException | ClassNotFoundException se) {
                JOptionPane.showMessageDialog(null, se + "\nDatabase Connection problem...");
            }
        }
        return con;
    }

    public static void setData(String query) throws Exception {
        try {            
            Db.getConnection().createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Operation Succussfull..");
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ResultSet getData(String query) throws Exception {
        return Db.getConnection().createStatement().executeQuery(query);
    }
}
