package com.pbo;

import java.io.FileInputStream;
import java.io.IOException;

public class CthIOException {
    public static void main(String[] args) {
        FileInputStream fileBoongan = null;

        System.out.println("Error Handling IO");
        try {
            fileBoongan = new FileInputStream("fileapayah.txt");
        } catch(IOException a) {
            System.err.println("\n" + a);
        }
    }
}
