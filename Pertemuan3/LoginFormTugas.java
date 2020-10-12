package com.kevin;

import java.util.*;

public class LoginForm {

    public static void main(String[] args){

        System.out.println("----- Sign Up Form by Kevin -----");
        Scanner inputUser = new Scanner(System.in);

        int input = 0;
        boolean kondisi = true;
        System.out.print("Masukan Username : ");
        String username = inputUser.next();
        System.out.print("Masukan Password : ");
        String password = inputUser.next();
        System.out.println("\nAnda berhasil membuat akun!");

        while (kondisi) {

            System.out.println("----- Login Form -----");
            System.out.print("Masukan Username : ");
            String username2 = inputUser.next();
            System.out.print("Masukan Password : ");
            String password2 = inputUser.next();
            if(!username.equals(username2)){
                System.out.println("Username salah, coba lagi.");
                input++;
            } if(!password.equals(password2)){
                System.out.println("Password salah, coba lagi");
            }
            else {
                System.out.println("Berhasil Login!");
                break;

            }
            if(input == 3){
                kondisi = false;
                System.out.println("Username / Password anda telah 3x salah, coba lagi nanti.");
                break;
            }

        }

    }

}
