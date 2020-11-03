package com.tutorial;

public class Rental {

    public double internet;
    public double pengetikan;
    public double gameOnline;
    public double scan;
    public double print;
    public double printWarna;
    public double tehBotol;

    Rental(){
        this.internet = 4000;
        this.pengetikan = 2000;
        this.gameOnline = 3000;
        this.scan = 1000;
        this.print = 300;
        this.printWarna = 500;
        this.tehBotol = 3000;
    }

    void show() {
        System.out.println("\n\t\tTarif Rental dan Lain-lain");
        System.out.println("\t\t---------------------------------");
        System.out.println("\n\t\tInternet : " + this.internet + " per menit");
        System.out.println("\t\tPengetikan : " + this.pengetikan + " per menit");
        System.out.println("\t\tGame Online : " + this.gameOnline + " per menit");
        System.out.println("\t\tScan : " + this.scan + " per file");
        System.out.println("\t\tPrint B&W : " + this.print + " per lembar");
        System.out.println("\t\tPrint Warna : " + this.printWarna + " per lembar");
        System.out.println("\t\tTeh Botol : " + this.tehBotol + " per botol");
    }

}
