package com.pbo;

public class Main {

    public static void main(String[] args){

        Bilangan obil = new Bilangan();
        System.out.println("Nilai A = " + obil.tampilkanA());
        System.out.println("Nilai B = " + obil.tampilkanB());
        System.out.println("Nilai C = " + obil.tampilkanC());

        obil.inputA(100);
        System.out.println("\nNilai A setelah di input = " + obil.tampilkanA());
        // nilai B diinput
        obil.inputB(200);
        System.out.println("Nilai B setelah di input = " + obil.tampilkanB());
        obil.inputC(300);
        System.out.println("Nilai C setelah di input = " + obil.tampilkanC());

        obil.tambah();
        System.out.println("\nPertambahan nilai A,B,C = " + obil.tambah());

        obil.kurang();
        System.out.println("Pengurangan nilai A,B,C = " + obil.kurang());

        obil.kali();
        System.out.println("Perkalian nilai A,B,C = " + obil.kali());

        obil.bagi();
        System.out.println("Pembagian A dan B = " + obil.bagi());

        obil.mbahMu(3, 5, 2);
        System.out.println("Hasil pertambahan = " + obil.tambah());
    }

}