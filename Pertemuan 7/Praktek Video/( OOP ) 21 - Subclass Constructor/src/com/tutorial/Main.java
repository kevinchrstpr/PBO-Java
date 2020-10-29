package com.tutorial;

public class Main{
    public static void main(String[] args) {

        Hero hero1 = new Hero("Kevin", 100); // ini memakai constructor superclass
        hero1.show();

        HeroStrength hero2 = new HeroStrength("Ope", 100);//
        hero2.show();

        HeroStrength hero3 = new HeroStrength("Cinthia");
        hero3.show();
    }
}
