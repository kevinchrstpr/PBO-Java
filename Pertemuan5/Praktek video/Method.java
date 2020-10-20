package com.tutorial;

class Mahasiswa{
    String nama, NIM;

    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    void Nama(String nama){
        this.nama = nama;
    }

    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class Method{

    public static void main(String[] args) {

        Mahasiswa siswa = new Mahasiswa("Kevin","2019071012");
        siswa.show();
        siswa.Nama("Ope");
        siswa.show();
        System.out.println(siswa.getNama());
        System.out.println(siswa.getNIM());
        String data = siswa.sayHi("Tamvann");
        System.out.println(data);

    }

}