package com.pbo;

abstract class HitungLuas {

    protected double s1;
    protected double s2;
    public HitungLuas() {
        this.s1 = 0;
        this.s2 = 0;
    }

    public void setSisi(double s1){
        this.s1 = s1;
    }

    public void setSisi(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public double getS1(){
        return s1;
    }
    public double getS2() {
        return s2;
    }

    public abstract double getLuas();
}

class Segitiga extends HitungLuas{
    @Override
    public double getLuas() {
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}

class Lingkaran extends HitungLuas{
    @Override
    public double getLuas() {
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}

public class Luas {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.setSisi(5,2);
        System.out.println("Luas segitiga = 0.5 x "
        + segitiga.getS1() + " x " + segitiga.getS2() + " = " + segitiga.getLuas());

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setSisi(10);
        System.out.println("Luas Lingkaran " + lingkaran.getLuas());
    }
}