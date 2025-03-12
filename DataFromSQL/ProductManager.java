/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataFromSQL;

import Production.Shoes;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Class de quan li du lieu sql la duy nhat => static
 */
public final class ProductManager {

    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final static String url = "jdbc:sqlserver://localhost:1433;databaseName=USERLOGIN;user=sa;password=26092005;encrypt= false;";
    private final static String user = "sa";
    private final static String password = "26092005";
    private static Statement st;
    private static ResultSet rs;

    ArrayList<Shoes> shoes = new ArrayList<>();

    //SINGLE TON
    public static ProductManager instance;
    private static boolean isInitiallized = false;

    public static void Init() {
        if (isInitiallized == true) {
            return;
        }
        //neu tao cai thang dung chung roi thi ko duoc tao tiep
        instance = new ProductManager();
        isInitiallized = true;
    }

    //lay data from sql
    public void LoadData() {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM productSeller";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int n = 1;
            while (rs.next()) {
                String idProduct = rs.getString("idProduct");
                String name = rs.getString("nameProduct");
                int size = rs.getInt("size");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                double totalPrice = price * quantity;
                Shoes _shoes = new Shoes(idProduct, name, size, price, quantity, color);
                this.shoes.add(_shoes);
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

    public boolean addProduct(String idProduct, String name, int size, double price, int quantity, String color) {
        boolean check = false;
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "insert into productSeller values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idProduct);
            ps.setString(2, name);
            ps.setInt(3, size);
            ps.setDouble(4, price);
            ps.setInt(5, quantity);
            ps.setString(6, color);
            int n = ps.executeUpdate();
            if (n > 0) {
                Shoes _shoes = new Shoes(idProduct, name, size, price, quantity, color);
                this.shoes.add(_shoes);
                check = true;
            }
            ps.close();
            conn.close();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for Size, Price, and Quantity!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter correct format", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }

    public boolean EditProduct(String name, int size, double price, int quantity, String color, String idProduct) {
        boolean check = false;
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String updateSql = "UPDATE productSeller SET nameProduct =? ,size = ?, price = ?, quantity = ?, color = ? WHERE id  = ?";
            PreparedStatement updatePs = conn.prepareStatement(updateSql);
            updatePs.setString(1, name);
            updatePs.setInt(2, size);
            updatePs.setDouble(3, price);
            updatePs.setInt(4, quantity);
            updatePs.setString(5, color);
            updatePs.setString(6, idProduct);
            int rowsAffected = updatePs.executeUpdate();
            if (rowsAffected > 0) {
                Shoes _shoes = new Shoes(idProduct, name, size, price, quantity, color);
                for (int i = 0; i < this.shoes.size(); i++) {
                    if (this.shoes.get(i).getIdProduct().equalsIgnoreCase(idProduct)) {
                        this.shoes.set(i, _shoes);
                        check = true;
                        break;
                    }
                }
            }
            conn.close();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for Size, Price, and Quantity!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }

    public boolean FindProduct(String idProduct, String name, int size, double price, int quantity, String color) {
        boolean check = false;
        try {
            for (Shoes shoes : this.shoes) {
                if (shoes.getIdProduct().equalsIgnoreCase(idProduct)) {
                    JOptionPane.showMessageDialog(null, "Product Founded: \n"
                            + "ID: " + shoes.getIdProduct()+ "\nname: " + shoes.getName() + "\nsize: " + shoes.getSize() + "\nprice: " + shoes.getPrice() + "\nquantity: " + shoes.getQuantity()
                            + "\ncolor: " + shoes.getColor());
                    check = true;
                    break;
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for Size, Price, and Quantity!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }

    public boolean DeleteProduct(String idProduct, String name, int size, double price, int quantity, String color) {
        boolean check = false;
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String deleteProduct = "delete from productSeller where id = ?  ";
            PreparedStatement ps = conn.prepareStatement(deleteProduct);
            ps.setString(1, idProduct);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                for (Shoes shoes : this.shoes) {
                    if (shoes.getIdProduct().equalsIgnoreCase(idProduct)) {
                        this.shoes.remove(shoes);
                        check = true ; 
                        break ;
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for Size, Price, and Quantity!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }

    public ArrayList<Shoes> GetDataProduct() {
        return shoes;
    }
}
