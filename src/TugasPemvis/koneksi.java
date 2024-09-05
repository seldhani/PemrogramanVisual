/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPemvis;

import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;

 


/**
 *
 * @author Dr. Kudrat Sunandar
 */
public class koneksi {
    private static Connection koneksi; 
public static Connection GetConnection() throws SQLException, java.sql.SQLException{ if (koneksi == null){ new Driver(); koneksi = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/pemvis","root",""); 
      } return koneksi; 
} 


}
