package manajemenrumahsakit;

import java.sql.*;

public class Koneksi {
    private static Connection koneksi;
    
    public void con() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost/db_rumahsakit";
                String user = "root";
                String password = "d4ff44kb4r";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error membuat Koneksi"); 
            }
        }
    }
}
