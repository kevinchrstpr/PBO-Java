package com.tutorial;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        hero1.show();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Fubuki";
        hero2.defensePower = 100;
        hero2.show();

    }

}