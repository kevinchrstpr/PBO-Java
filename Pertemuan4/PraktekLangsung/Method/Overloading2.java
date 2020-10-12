package com.method;

public class Overloading2 {

    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x , double y){
        return x - y;
    }
    static String plusMethod (String x, String y){
        String hasil = x + " " + y;

        return hasil;
    }
    static String plusMethod (String x, String y) {
        String hasil = "Nama " + x + "umur " + y + " tahun";
        return hasil;
    }
    public static void main(String[] args){
        String myNum3 = plusMethod("Kevin", "Ope");
        int myNum1 = plusMethod(8,5);
        double myNum2 = plusMethod(4.3, 6.26);
        String myNum4 = plusMethod("Kevin, 20");
        System.out.println("int = " + myNum1);
        System.out.println("double = " + myNum2);
        System.out.println("String = " + myNum3);
        System.out.println("keterangan = " + myNum4);
    }
}
