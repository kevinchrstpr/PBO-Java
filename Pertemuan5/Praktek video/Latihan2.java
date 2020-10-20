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

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;

        System.out.println(this.name + " Attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower){
        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " Gets dmg " + damage);
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

public class Latihan2{

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

        System.out.println("\nPrepare for War!");
        System.out.println("\nEpisode 1\n");
        p1.attack(p2);
        p1.display();
        p2.display();
        System.out.println("\nEpisode 2\n");
        p2.attack(p1);
        p1.display();
        p2.display();
    }
}