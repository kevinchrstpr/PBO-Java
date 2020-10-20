package com.tutorial;

class Polos{
    String dataString;
    int dataInt;
}

class Mahasiswa{
    String nama, NIM, jurusan;

    // Mahasiswa(){
    //     System.out.println("ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Constructor{

    public static void main(String[] args) throws Exception {
        
        Mahasiswa siswa = new Mahasiswa("kevin","2019071012","Teknik informatika");
        Mahasiswa siswa2 = new Mahasiswa("gopli","2019071023","Teknik Mesin");
        
        /* Polos objectPolos = new Polos();
        objectPolos.dataString = "polos";
        objectPolos.dataInteger = 0;

         System.out.println(objectPolos.dataString);
         System.out.println(objectPolos.dataInt);
*/
    }
}