package com.pbo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CthFileNotFoundException {
    public static void main(String[] args) {
        System.out.println("Error Handling : FileNotFoundException");
        try {
            File file = new File("C:\\Users\\kevin\\Documents\\FileBoongan.txt");
            Scanner input = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } finally {
            System.out.println("File tidak ada / Path Salah");
        }
        System.out.println("Akhir dari program");
    }
}