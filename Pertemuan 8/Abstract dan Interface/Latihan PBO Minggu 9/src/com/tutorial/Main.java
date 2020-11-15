package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;
        boolean kondisi = true;
        int opsi;
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();

        do {
            System.out.print("\nPilih luas \n1.Lingkaran \n2.Segitiga \n3.Exit : ");
            opsi = input.nextInt();
            if (opsi == 1){
                System.out.println("\nLingkaran");
                System.out.print("Masukan diameter : ");
                a = input.nextDouble();
                System.out.println("Luas lingkaran adalah : " + lingkaran.getLuasLingkaran(a));
            } else if (opsi == 2){
                System.out.println("\nSegitiga");
                System.out.print("Masukan alas : ");
                a = input.nextDouble();
                System.out.print("Masukan tinggi : ");
                b = input.nextDouble();
                System.out.println("Luas segitiga : " + segitiga.getLuas(a, b));
            } else if (opsi == 0) kondisi = false;
        } while (kondisi);
    }

}
