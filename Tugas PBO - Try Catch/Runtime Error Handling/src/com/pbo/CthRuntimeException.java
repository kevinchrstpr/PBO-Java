package com.pbo;

import java.util.*;

class Angka {
    private int x;
    private int y;

    Angka() {
        this.x = 0;
        this.y = 0;
    }

    public int getAngka(int x, int y) {
        return x / y;
    }
}

public class CthRuntimeException {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Angka angka = new Angka();

        System.out.print("Masukan angka pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Masukan angka pertama : ");
        int angka2 = input.nextInt();

        try {
            int hasil = angka.getAngka(angka1, angka2);
            System.out.println(hasil);
        } catch(RuntimeException e) {
            System.err.println(e);
        }

    }

}