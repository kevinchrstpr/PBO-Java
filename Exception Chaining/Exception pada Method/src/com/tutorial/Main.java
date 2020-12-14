package com.tutorial;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        int[] arrayData = {0,1,2,3};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Data ke : ");
        int index = input.nextInt();

        // Exception Biasa
        System.out.println("Exception biasa");
        try {
            System.out.printf("Data dari array ke-%d adalah %d\n\n", index, arrayData[index]);
        } catch (Exception e) {
            System.err.println(e);
        }

        //Exception didalam fungsi
        System.out.println("Exception dalam fungsi");
        int data = ambilDataDariArray(arrayData, index);
        System.out.printf("Data dari array ke-%d adalah %d\n\n", index, data);

        System.out.println("\n\nAkhir dari program");

        //Exception throws by method

        System.out.println("Exception throws by method");
        int data2 = ambilDataDariArray2(arrayData, index);
        System.out.printf("Data dari array ke-%d adalah %d\n\n", index, data2);

        System.out.println("\n\nAkhir dari program");
    }

    private static int ambilDataDariArray2(int[] array, int indexInput) {
        int hasil = array[indexInput];
        return hasil;
    }

    private static int ambilDataDariArray(int[] array, int indexInput) throws Exception{
        int hasil = 0;

        try {
            hasil = array[indexInput];
        } catch(Exception e) {
            System.err.println(e);
        }

        return hasil;
    }
}