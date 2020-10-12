package com.tutorial;

import java.util.*;

public class Recursive{

    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Input value = ");
        int value = userInput.nextInt();
        System.out.println("Your value is = " + value);


        printValue(value);
        int amount = amountValue(value);
        System.out.println("amount = " + amount);

        int faktorial = countFactorial(value);
        System.out.println("factorial result = " + faktorial);
    }
    // Rekursif sederhana

    private static int countFactorial(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 1){
            return parameter;
        }

        return parameter * countFactorial(parameter - 1);

    }

    private static int amountValue(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 0){
            return parameter;
        }
        return parameter + amountValue(parameter - 1);
    }

    private static void printValue (int parameter){
        System.out.println("nilai = " + parameter);

        if (parameter == 0){
            return;
        }
        parameter--;

        printValue(parameter);
    }
}
