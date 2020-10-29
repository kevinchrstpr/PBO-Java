package com.tutorial;

public class Player {
    private String name;
    private static int jumlahPlayer;

    // Overloading constructor
    Player(String name) {
        Player.jumlahPlayer++;
        this.name = name;
    }

    // opsi 2
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    void show(){
        System.out.println("Player name : " + this.name);
    }
}
