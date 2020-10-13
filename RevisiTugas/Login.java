package com.tutorial;

import java.util.*;

public class Login {

    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);
        String username, password, username2, password2;
        /*
        menggunakan integer untuk menentukan increment sebagai
        patokan agar bisa mencapai percobaan maksimal (3x)
         */
        int a = 0;
        boolean kondisi = true;

        System.out.println("\n\tKevin Ope Blogs Membership!");
        System.out.println("\t\tCreate new account");
        System.out.println("===================================\n");

        System.out.print("Username = ");
        username = inputUser.next();
        System.out.print("Password = ");
        password = inputUser.next();
        System.out.println("\nYou've created an account!");

        do{
            System.out.println("\n\t\t\t\tLogin");
            System.out.println("====================================");
            System.out.print("\nUsername = ");
            username2 = inputUser.next();
            System.out.print("Password = ");
            password2 = inputUser.next();
            a++;

            if(a == 3){
                System.out.println("You've been reached the maximum attempt");
                kondisi = false;
            }else if(!username2.equals(username)){
                System.out.println("Your username wrong!");
            } else if(!password2.equals(password)){
                System.out.println("Your password wrong!");
            } else{
                System.out.println("Login Succeed!");
                break;
            }

        } while(kondisi);

    }

}
