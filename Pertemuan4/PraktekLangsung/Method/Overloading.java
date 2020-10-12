package com.method;

public class Overloading {

    static int intMethod(int x, int y){
        return x + y;
    }
    static double doubleMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args){
        int myNum1 =  intMethod(8,5);
        double myNum2 = doubleMethod(4.3, 6.26);
        System.out.println("int = " + myNum1);
        System.out.println("int = " + myNum2);
    }

}
