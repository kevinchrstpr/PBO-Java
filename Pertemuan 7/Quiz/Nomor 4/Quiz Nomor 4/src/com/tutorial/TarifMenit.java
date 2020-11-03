package com.tutorial;

public class TarifMenit extends Rental{

    public double menit;

    TarifMenit(){
        this.menit = 0;
    }

    public double getInternet(double menit) {
        if (this.menit <= 30){
            this.menit = 30;
        }
        return (this.menit = (menit / 60) * this.internet);
    }

    public double getMengetik(double menit) {
        if (this.menit <= 30){
            this.menit = 30;
        }
        return (this.menit = (menit / 60) * this.pengetikan);
    }

    public double getGame(double menit) {
        if (this.menit <= 30){
            this.menit = 30;
        }
        return (this.menit = (menit / 60) * this.gameOnline);
    }

    public double getTotalTarif(double menit, double menit1, double menit2){
        return getInternet(menit) + getMengetik(menit1) + getGame(menit2);
    }

}
