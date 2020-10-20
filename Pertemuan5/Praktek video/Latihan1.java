package com.tutorial;

class Player{
    String name;
    double health;
    int level;
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void display(){

        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " HP");
        this.weapon.display();
        this.armor.display();

    }
}

// Weapons Fellas!
class Weapon{

    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapons : " + this.name + " , Damage : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , Deff : " + this.defencePower);
    }
}

public class Latihan1{

    public static void main(String[] args) {

        Player p1 = new Player("Kevin",99);
        Player p2 = new Player("Ope",100);

        Weapon Axe = new Weapon("Axe",40);
        Weapon Hammer = new Weapon("Hammer",29);

        Armor Noctis = new Armor("Noctis Tee",33);
        Armor BLS = new Armor("Bruce Lee Shirts",20);

        p1.equipWeapon(Axe);
        p1.equipArmor(Noctis);
        p1.display();

        p2.equipWeapon(Hammer);
        p2.equipArmor(BLS);
        p2.display();
    }
}