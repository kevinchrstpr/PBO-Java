package com.tutorial;

// ini akan mengimport class console
import com.terminal.Console;

// import static method dari console
import static com.terminal.Console.log;

class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Kevin");
        player1.show();

        Console.log("\nMenampilkan data dengan console.log");
        Console.log(player1.getName());
        log("\nMenampilkan data dengan log saja");
        log(player1.getName());

    }

}
// tidak bisa, penggunaan private tidak diperkenankan
//private class Test {
//
//
