package data;
import AccountData.Account;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class AccountManager {
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final static String url = "jdbc:sqlserver://localhost:1433;databaseName=USERLOGIN;user=sa;password=26092005;encrypt= false;";
    private final static String user = "sa";
    private final static String password = "26092005";
    private static Statement st;
    private static ResultSet rs;
    ArrayList<Account> account = new ArrayList<>();
    public static AccountManager instance;
    private static boolean isInitiallized = false;

    public static void Init() {
        if (isInitiallized == true) {
            return;
        }
        instance = new AccountManager();
        isInitiallized = true;
    }

    public void LoadAccount() {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select * from account ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int n = 1;
            while (rs.next()) {
                int id = rs.getInt("idUser");
                String name = rs.getString("username");
                String pass = rs.getString("pass");
                String gmail = rs.getString("gmail");
                Account _account = new Account(id ,name, pass, gmail);
                this.account.add(_account);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unexpected error: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Account> getDataAccount() {
        return account;
    }

}
