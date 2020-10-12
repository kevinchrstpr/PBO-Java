package com.tutorial;

public class VoidMethod {

    public static void main (String[] args){

//         Void means hollow

        System.out.println(simpel());

        fungsiVoid("anything");
        goodMorning("mom");
        goodMorning("dad");

    }

    private static void goodMorning(String nama){
        System.out.println("G'Morning " + nama);
    }

//     Method without return
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
//      return the (10.0f) value
    private static float simpel(){
        return 10.0f;
    }
}