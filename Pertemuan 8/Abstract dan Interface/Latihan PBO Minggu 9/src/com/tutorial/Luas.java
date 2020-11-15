package com.tutorial;

abstract class Luas {
    public double alas;
    public double tinggi;
    public double diameter;
    public double phi;
}

class Segitiga extends Luas{

    Segitiga(){
        this.alas = 0;
        this.tinggi = 0;
    }

    public double getLuas(double alas, double tinggi){
        return alas * tinggi;
    }

}

class Lingkaran extends Luas{

    Lingkaran(){
        this.diameter = 0;
        this.phi = 3.14;
    }

    public double getLuasLingkaran(double diameter){
        return this.phi * diameter * diameter;
    }
}