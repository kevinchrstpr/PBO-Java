package com.tutorial;

public class Method{

    public static void main (String[] args){

//      y = (x + 2) * x

        int x,y;

        x = 2;
        y = count(x);
        System.out.println("X = " + x + ", Y = " + y);

        x = 10;
        y = count(x);
        System.out.println("\nX = " + x + ", Y = " + y);

        x = 40;
        y = count(x);
        System.out.println("\nX = " + x + ", Y = " + y);

    }

    public static int count(int input){

        int result;
//      result = (input + 2) * input;
        result = input * input;

        return result;
    }
}