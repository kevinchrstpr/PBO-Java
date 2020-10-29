package com.tutorial;

public class Hero {
    // attribute
    String name;
    double defensePower;

    // constructor
    Hero(String name, double defensePower) {
        this.name = name;
        this.defensePower = defensePower;
    }

    Hero(String name) {
        this.name = name;
    }

    void show(){
        System.out.println("Hero Name : " + this.name);
        System.out.println("Defense : " + this.defensePower);
    }
}

// subclass