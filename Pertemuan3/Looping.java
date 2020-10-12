package com.kevin;

import java.util.*;

public class Looping {

    public static void main(String[] args) {

        // program untuk menjumlahkan angka dengan rentang
        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;
        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("Ditambah " +nilaiAwal +"menjadi " + total);
            nilaiAwal++;

            //tugas do while & for loop

        }


    }

}
