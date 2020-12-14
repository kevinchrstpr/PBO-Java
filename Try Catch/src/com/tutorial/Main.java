package com.tutorial;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] array = {0,1,2,3};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai array ke : ");
        int index = input.nextInt();
        FileInputStream fileInput = null;
        // exception handling(try, catch, finally)
        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        // runtime error jika file tidak ada
        System.out.println("Handling IO not found");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch(IOException e) {
            System.err.println("\n" + e);
        }

        //menggabungkan dua exception
        System.out.println("Menggabungkan kedua exception");
        try {
            System.out.printf("index ke-%d, adalah %d", index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } catch(IOException e) {
            System.err.println("File tidak ditemukan");
        }

        //finally
        System.out.println("Finally");
        try {
            System.out.printf("index ke-%d, adalah %d", index, array[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("akhir dari program");
    }
}