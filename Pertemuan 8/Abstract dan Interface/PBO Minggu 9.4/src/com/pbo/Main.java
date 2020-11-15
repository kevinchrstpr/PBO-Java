package com.pbo;
//interface

interface Mamalia {
    // interface method
    public void tempatTinggal();
    public void tidur();
}

interface MakhlukHidup {
    public void bernafas();
    public void bernama();
}

class Hewan1 implements Mamalia, MakhlukHidup {
    @Override
    public void tempatTinggal() {
        System.out.println("Tempat tinggal : Air");
    }

    @Override
    public void tidur() {
        System.out.println("ZzzZzz");
    }

    @Override
    public void bernafas() {
        System.out.println("Paru-paru");
    }

    @Override
    public void bernama() {
        System.out.println("Ikan Paus");
    }
}

public class Main {

    public static void main(String[] args) {
        Hewan1 paus = new Hewan1();
        paus.bernama();
        paus.bernafas();
        paus.tempatTinggal();
        paus.tidur();
    }
}