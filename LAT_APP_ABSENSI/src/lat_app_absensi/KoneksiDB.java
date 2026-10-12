/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lat_app_absensi;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author SERVER L.K.1
 */
public class KoneksiDB {
    
    static Connection con;
    
    public static Connection getConnection() {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_absensi", "root", "");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error : Koneksi Gagal!");
                System.exit(0);
            }
            return con;
    }
}
