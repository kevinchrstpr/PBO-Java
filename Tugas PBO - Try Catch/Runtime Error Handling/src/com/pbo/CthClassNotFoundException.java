package com.pbo;

public class CthClassNotFoundException {
    
    public static void main(String [] args) {
        System.out.println("Error Handling : ClassNotFoundException");
        try {
            Class.forName("ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } finally {
            System.out.println("Nama class tidak ditemukan!");
        }
    }
}
