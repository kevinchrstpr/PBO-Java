package com.pbo;

interface HitungLuas3 {
    public void setSisi(double...sisi);
    public double getLuas();
}

class LuasSegitiga implements HitungLuas3 {
    private double alas;
    private double tinggi;

    @Override
    public void setSisi(double...sisi) {
        this.alas = sisi[0];
        this.tinggi = sisi[1];
    }

    @Override
    public double getLuas() {
        return 0;
    }

    public double getAlas() {
        return this.alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }
}

public class Luas3 {
    public static void main(String[] args) {
        LuasSegitiga luasSegitiga = new LuasSegitiga();
        luasSegitiga.setSisi(5, 13);
        System.out.println("Luas segitiga = 0.5 x "
                + luasSegitiga.getAlas() + " x "
                + luasSegitiga.getTinggi());
    }
}