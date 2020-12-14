package com.pbo;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

public class CalculatorController {
    private String a, b;
    public Label label_pesan;
    public TextField angkaPertama;
    public TextField angkaKedua;
    public Label result;

    public void angkaPertamaClick(ActionEvent actionEvent) {
        String angka1;
        angka1 = angkaPertama.getText();
        System.out.println(angka1);
    }

    public void angkaKeduaClick(ActionEvent actionEvent) {
        String angka2;
        angka2 = angkaKedua.getText();
        System.out.println(angka2);
    }

    public void operanBagiClick(ActionEvent actionEvent) {
        DecimalFormat df = new DecimalFormat("#.#");
        a = angkaPertama.getText();
        b = angkaKedua.getText();
        double angka = Double.parseDouble(a);
        double angka2 = Double.parseDouble(b);
        double hasil = angka / angka2;
        String output = df.format(hasil);
        result.setText(output);
    }

    public void operanKaliClick(ActionEvent actionEvent) {
        DecimalFormat df = new DecimalFormat("#.#");
        a = angkaPertama.getText();
        b = angkaKedua.getText();
        double angka = Double.parseDouble(a);
        double angka2 = Double.parseDouble(b);
        double hasil = angka * angka2;
        String output = df.format(hasil);
        result.setText(output);
    }

    public void operanTambahClick(ActionEvent actionEvent) {
        DecimalFormat df = new DecimalFormat("#.#");
        a = angkaPertama.getText();
        b = angkaKedua.getText();
        double angka = Double.parseDouble(a);
        double angka2 = Double.parseDouble(b);
        double hasil = angka + angka2;
        String output = df.format(hasil);
        result.setText(output);
    }

    public void operanKurangClick(ActionEvent actionEvent) {
        DecimalFormat df = new DecimalFormat("#.#");
        a = angkaPertama.getText();
        b = angkaKedua.getText();
        double angka = Double.parseDouble(a);
        double angka2 = Double.parseDouble(b);
        double hasil = angka - angka2;
        String output = df.format(hasil);
        result.setText(output);
    }

    public void ulangAppClick(ActionEvent actionEvent) {
        angkaPertama.clear();
        angkaKedua.clear();
        String output = "0";
        result.setText(output);
    }
}