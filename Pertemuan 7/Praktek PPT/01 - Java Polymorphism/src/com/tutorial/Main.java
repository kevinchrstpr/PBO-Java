package com.tutorial;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig sounds : wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog sounds : woof woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Pig myPig = new Pig();
        Dog myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
