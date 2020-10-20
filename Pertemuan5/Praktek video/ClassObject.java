package com.tutorial;

import java.util.*;

class Mahasiswa{
    String nama, NIM, jurusan;
    double IPK;
    int umur;
}


public class ClassObject {
    public static void main(String[] args) throws Exception {

        Mahasiswa siswa = new Mahasiswa();
        siswa.nama = "ucup";
        siswa.NIM = "13305041";
        siswa.jurusan = "teknik perteknikan";
        siswa.IPK = 4.0;
        siswa.umur = 17;

        System.out.println(siswa.nama);
        System.out.println(siswa.NIM);
        System.out.println(siswa.jurusan);
        System.out.println(siswa.IPK);
        System.out.println(siswa.umur);
        
        Mahasiswa siswa2 = new Mahasiswa();
        siswa2.nama = "otong";
        siswa2.NIM = "13305042";
        siswa2.jurusan = "teknik perteknikan";
        siswa2.IPK = 3.5;
        siswa2.umur = 32;

        System.out.println(siswa2.nama);
        System.out.println(siswa2.NIM);
        System.out.println(siswa2.jurusan);
        System.out.println(siswa2.IPK);
        System.out.println(siswa2.umur);
    }
}