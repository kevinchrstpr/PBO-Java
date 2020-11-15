package com.pbo;

import java.util.*;

abstract class Luas {
    Scanner input = new Scanner(System.in);
    public double diameter;
    public double alas;
    public double phi;
    public double tinggi;

    public Luas() {
        this.diameter = 0;
        this.alas = 0;
        this.tinggi = 0;
        this.phi = 3.14;
    }
    public double
}

//class Lingkaran extends Luas {

//    @Override
//    public void LuasLingkaran(double diameter) {
//        System.out.println("Luas Lingkaran");
//        System.out.print("Masukan diameter : ");
//        diameter = input.nextDouble();
//        System.out.println("Luas lingkaran : " + phi * diameter * diameter);
//    }
//
//    @Override
//    public void LuasSegitiga(double alas, double tinggi) {
//        System.out.println("Luas Segitiga");
//        System.out.print("Masukan alas : ");
//        alas = input.nextDouble();
//        System.out.print("Masukan tinggi : ");
//        tinggi = input.nextDouble();
//        System.out.println("Luas Segitiga : " + alas * tinggi);
//    }
}