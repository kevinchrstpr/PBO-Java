package com.kevin;

import java.util.*;

public class ForLoop {

    public static void main(String[] args){

        System.out.println("Awal program bos");

        System.out.println("Loop pertama");

        for (int nilai = 0; nilai <= 10; nilai++){

            System.out.println("for loop ke - " + nilai);

        }
        System.out.println("Loop kedua");

        for (int nilai = 0; nilai < 10; nilai++){

            System.out.println("for loop ke - " + nilai);

        }
        System.out.println("Loop ketiga");

        for (int nilai = 10; nilai >= 5; nilai--){

            System.out.println("for loop ke - " + nilai);

        }
        System.out.println("Loop keempat");

        int nilai = 0;
        for(; nilai < 10 ;){

            System.out.println("for loop ke - " + nilai);
            nilai++;
        }

        System.out.println("akhir program");

    }

}
