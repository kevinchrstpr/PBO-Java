package com.pbo;
import java.util.*;

public class CthNumberFormatException {

    public static String hargaMobil = "100.000";
    public static void main(String[] args) {
        System.out.println("Error Handling : NumberFormatException");
        try {
            // x akan mencoba untuk mengkonversi hargaMobil menjadi Int dengan fungsi Parse
            int x = Integer.parseInt(hargaMobil);
        } catch(NumberFormatException y) {
            System.err.println(y);
        }
    }
}