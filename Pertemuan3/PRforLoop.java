package com.kevin;

import java.util.*;

public class PRforLoop {

    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir, total;
        System.out.println("Masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.println("Masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        for (total = 0; nilaiAwal<=nilaiAkhir;nilaiAwal++){

            total = nilaiAwal + total;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);

        }

    }

}
