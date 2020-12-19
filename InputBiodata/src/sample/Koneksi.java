package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {
    // Buat attribut untuk koneksi
    private Connection conn;

    // Buat deklarasi attribut untuk statement
    private Statement st;

    // Mendefinisikan username, password, alamat dari server sql
    public Koneksi() {
        try {
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/pbo-reguler";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    // Untuk Input Data (Insert), Edit Data (Update), Hapus Data (Delete)
    public int manipulasiData(String query) {
        try {
            st = conn.createStatement();
            return st.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
            return 0;
        }
    }
}