package com.pboreg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.util.Observable;

public class Controller {
    public TextField textPesan;
    public Label labelPesan;
    public ListView<String> listViewPesan;
    private Koneksi koneksi = new Koneksi();
    public void buttonPesanOnClick(ActionEvent actionEvent) {
        String teks = textPesan.getText();
        labelPesan.setText(teks);
        //input data ke tabel pesan pada database pbo-reguler
        String query = "INSERT INTO pesan(isipesan) VALUES('" + teks + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil dimasukan ke tabel");
        }
        tampilData();
    }
    public void tampilData() {
        try {
            String query = "SELECT * FROM pesan";
            ResultSet hasil = koneksi.getData(query);
            ObservableList<String> items = FXCollections.observableArrayList();
            listViewPesan.setItems(items);

            while (hasil.next()) {
                items.add(hasil.getString(2));
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}