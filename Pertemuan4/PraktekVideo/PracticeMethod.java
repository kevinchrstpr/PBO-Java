package com.tutorial;

import java.util.*;

public class PracticeMethod{

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Length = ");
            int inputPanjang = userInput.nextInt();
        System.out.print("Width = ");
            int inputLebar = userInput.nextInt();

        gambar(inputPanjang,inputLebar);

        System.out.println("luas = " + luas(inputPanjang,inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang,inputLebar));

        outputKelilingDanLuas(inputPanjang,inputLebar);
    }

    private static void outputKelilingDanLuas(int panjang,int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("keliling = " + keliling(panjang,lebar));
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;

        return hasil;
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;

        return hasil;
    }

    private static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}
