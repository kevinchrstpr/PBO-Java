package com.kevin;

import java.util.*;

public class DoWhileLoop {

    public static void main(String[] args) {

        int a = 0;
        boolean kondisi = true;

        System.out.println("ini adalah awal");
        do {
            a++;
            System.out.println("do while ke - " + a);
            if (a == 10) {
                kondisi = false;
            }
        } while (kondisi);
      //  System.out.println("ini adalah akhir program");
    }
}
