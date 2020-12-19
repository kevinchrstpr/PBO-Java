package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public Button buttonPesan;
    public TextField textNama;
    public TextField textNim;
    public TextField textUmur;
    public TextField textJurusan;
    public Label labelPesan;
    private Koneksi koneksi = new Koneksi();

    public void buttonPesanOnClick(ActionEvent actionEvent) {
        String nama = textNama.getText();
        String nim = textNim.getText();
        String umur = textUmur.getText();
        String jurusan = textJurusan.getText();
        labelPesan.setText("Terdaftar!");

        // Input data ke tabel pesan
        String query = "INSERT INTO mahasiswa(nama,nim,umur,jurusan) VALUES('" + nama + "','" + nim + "','" + umur + "','" + jurusan + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil di input ke dalam tabel");
        }
    }
}
