/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Client
 */
public class Database {
    public static Connection koneksiDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   Connection conn;
    
    public static Connection KoneksiDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uprak_pbo","root","");
            return conn;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
    public void putuskoneksi(){
        
       try {
           conn.close();
       } catch (SQLException ex) {
           Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
}
