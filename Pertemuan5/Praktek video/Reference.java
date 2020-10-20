package com.tutorial;

class Buku{

    String judul;
    String penulis;

    Buku(String judul, String penulis){

        this.judul = judul;
        this.penulis = penulis;

    }

    void display(){

        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);

    }

}


public class Reference{

    public static void main(String[] args) {

        Buku buku = new Buku("Theory of Everything", "Stephen Hawking");
        buku.display();

        String addressBuku = Integer.toHexString(System.identityHashCode(buku));
        System.out.println(addressBuku);

        Buku buku2 = buku;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        buku2.judul = "The origin and fate of universe";
        buku.display();
        buku2.display();

        fungsi(buku2);
        buku.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku){

        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address fungsi " + addressDataBuku);
        dataBuku.penulis = "Stephen Hawking";

    }

}