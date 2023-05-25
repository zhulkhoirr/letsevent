/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsevent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author zhulk
 */
public class Koneksi 
{
    //Koneksi ke database
    private static Connection mysqlKoneksi;
    public static Connection getKoneksi() throws SQLException {
        if(mysqlKoneksi==null)
        {
            try {
                String DB="jdbc:mysql://localhost:3306/lets_event"; // delta_db database
                String user="root"; // user database
                String pass=""; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlKoneksi = (Connection) DriverManager.getConnection(DB,user,pass);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"gagal koneksi");
            }
        }
        return mysqlKoneksi;
    }
}
