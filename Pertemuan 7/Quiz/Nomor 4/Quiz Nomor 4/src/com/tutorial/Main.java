package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean kondisi = true;
        double menit,menit1, menit2;
        double lembar, lembar1, lembar2, teh;
        Scanner input = new Scanner(System.in);
        Rental rental = new Rental();
        TarifMenit tarif = new TarifMenit();
        TarifLain tarifLain = new TarifLain();

        for (int opsi; kondisi;) {
            System.out.println("\nPilih opsi ( 1 / 2 / 3 ) : ");
            System.out.println("1. Daftar Tarif Rental\n2. Menghitung Total Tarif\n3. Exit Program");
            System.out.print("Pilih opsi pemakaian anda ( 1 / 2 / 3 ) : ");
            opsi = input.nextInt();

            if (opsi == 1) {
                rental.show();
            } else if(opsi == 2) {
                System.out.println("\n\t\tPerhitungan Penggunaan Rental");
                System.out.println("\t\t-------------------------------");
                System.out.print("Pemakaian Internet : ");
                menit = input.nextDouble();
                System.out.println("Rp " + tarif.getInternet(menit));
                System.out.print("Pemakaian Mengetik : ");
                menit1 = input.nextDouble();
                System.out.println("Rp " + tarif.getMengetik(menit1));
                System.out.print("Pemakaian Game Online : ");
                menit2 = input.nextDouble();
                System.out.println("Rp : " +tarif.getGame(menit2));
                System.out.print("Jumlah Scan : ");
                lembar = input.nextDouble();
                System.out.println("Rp : " + tarifLain.getScan(lembar));
                System.out.print("Jumlah Print Polos : ");
                lembar1 = input.nextDouble();
                System.out.println("Rp : " + tarifLain.getPrint(lembar1));
                System.out.print("Jumlah Print Warna : ");
                lembar2 = input.nextDouble();
                System.out.println("Rp : " +tarifLain.getPrintWarna(lembar2));
                System.out.print("Jumlah Teh Botol : ");
                teh = input.nextDouble();
                System.out.println("Rp : " + tarifLain.getTehBotol(teh));
                System.out.println("----------------------------------- +");
                System.out.print("Total Bayar : ");
                System.out.println("Rp " + (tarif.getTotalTarif(menit, menit1,menit2) + tarifLain.getTotalTarif(lembar, lembar1, lembar2, teh)));
            } else if (opsi == 3){
                System.out.println("Terima kasih, selamat datang kembali!");
                kondisi = false;
            }

        }

    }

}
