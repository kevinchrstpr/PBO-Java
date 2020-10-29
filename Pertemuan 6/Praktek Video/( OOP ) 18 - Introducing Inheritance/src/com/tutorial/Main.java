package com.tutorial;

public class Main {

    public static void main(String[] args){

        Hero hero1 = new Hero();
        hero1.name = "Ucup";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Kevin";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Saitama";
        hero3.display();


    }

}