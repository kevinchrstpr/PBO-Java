package com.kevin;

import java.util.*;

public class PRdoWhile {

    public static void main(String[] args){

        int nilaiAwal;
        int nilaiAkhir;
        int total;
        boolean kondisi = true;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.println("Masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();
        total = 0;

        do {
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + "menjadi " + total);
            nilaiAwal++;

            if(nilaiAwal>nilaiAkhir){
                kondisi = false;
            }
        } while(kondisi);


    }
}
