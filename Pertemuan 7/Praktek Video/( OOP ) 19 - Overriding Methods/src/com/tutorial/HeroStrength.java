package com.tutorial;

public class HeroStrength extends Hero{
    double defensePower;

    // overiding methods
    void show() {
        System.out.println("\nHero Strength");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Defense Power : " + this.defensePower);
    }
}