package com.pboreg;

import java.sql.*;

public class Koneksi {
    // Buat deklarasi atribut untuk koneksi
    private Connection conn;

    // Buat deklarasi atribut untuk statement
    private Statement st;

    // definsikan username, password, dan alamat dari server mysql
    public Koneksi() {
        try {
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/pbo-reguler";
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    // Untuk input data(insert), edit data(update), dan hapus data(delete)
    public int manipulasiData(String query) {
        try {
            st = conn.createStatement();
            return st.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
            return 0;
        }
    }
    // untuk menampilkan data
    public ResultSet getData(String query) {
        try {
            st = conn.createStatement();
            return st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
            return null;
        }
    }
}