/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JCreateAcc;

import java.sql.*;
//import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Level;
public class SQL {  
    private static  String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QLBH;user=sa;password=26092005;encrypt = false;";
    public  static Connection getConnection(){ 
      Connection conn = null; 
        try {
            conn = DriverManager.getConnection(connectionUrl);
            System.out.println("thanhcong");
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("false connect ");
        }
        return conn;
    }
    public static void main(String[] args) {
         try {
            Connection conn = getConnection(); 
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM NHAP");
            while (rs.next()){
                System.out.println( rs.getString("masp"));
              //  System.out.println("");
                 
            }
                
                
        }catch(SQLException ex ){
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null , ex);
        }
    }
}
