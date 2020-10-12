package com.tutorial;

import java.util.*;

import java.lang.String;

public class Recursive2{

    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Input n value = ");
        int value = userInput.nextInt();

        int valueFibonacci = fibonacci(value, "top");
        System.out.println("value of fibonacci -"+ value +" is " + valueFibonacci);
    }


    private static int fibonacci(int n, String tree){
        System.out.println("leaves " + tree);
            System.out.println("Fibonacci - " + n);

        if (n == 1 || n == 0){
            return n;
        }
        else {
            return fibonacci(n - 1, "left") + fibonacci(n - 2, "right");
        }
    }

}
