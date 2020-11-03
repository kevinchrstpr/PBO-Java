package com.tutorial;

public class TarifLain extends Rental{
    public double lembar;
    public double teh;

    TarifLain(){
        super();
        this.lembar = 0;
        this.teh = 0;
    }

    public double getScan(double lembar) {
        return this.lembar = (lembar * this.scan);
    }

    public double getPrint(double polos) {
        return this.lembar = (polos * this.print);
    }

    public double getPrintWarna(double warna) {
        return this.lembar = (warna * this.printWarna);
    }

    public double getTehBotol (double teh) {
        return this.teh = (teh * this.tehBotol);
    }

    public double getTotalTarif(double lembar, double lembar1, double lembar2, double teh){
        return getScan(lembar) + getPrint(lembar1) + getPrintWarna(lembar2) + getTehBotol(teh);
    }

}
