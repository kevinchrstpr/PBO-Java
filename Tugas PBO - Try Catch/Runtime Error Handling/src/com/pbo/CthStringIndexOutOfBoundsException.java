package com.pbo;

import java.util.*;

public class CthStringIndexOutOfBoundsException {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan judul kamu : ");
        String judul = input.nextLine();
        // charAt akan mencari index dari judul yang di input
        try {
            System.out.print("Masukan index yang ingin dicari : ");
            int index = input.nextInt();
            char judulS = judul.charAt(index);
        } catch(StringIndexOutOfBoundsException e) {
            System.err.println("Error, index tidak ditemukan \n" + e);
        }
        // jika melebihi dari index yang ada, maka akan tertera StringIndexOutOfBounds

    }
}
