package com.method;

public class myClass {

    static void checkAge(int age){
        if(age < 18){
            System.out.println("Access denied - You're not old enough!");
        } else {
            System.out.println("Access granted - You're old enough!");
        }
    }
    public static void main(String[] args){
        checkAge(20);
    }
}
