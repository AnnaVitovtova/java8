package ru.netology.domain;

public class Radio {

    private int amountRadioStation = 10;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }


    public int getAmountRadioStation() {
        return amountRadioStation;
    }


    public int getMaxRadioStation() {
        return maxRadioStation;
    }


    public int getMinRadioStation() {
        return minRadioStation;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setAmountRadioStation() {
        this.maxRadioStation = this.amountRadioStation - 1;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void setNextRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }


    public void setPrevRadioStation(int currentRadioStation) {
        if (currentRadioStation <= 0) {
            this.currentRadioStation = 9;
        }
        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setNumberRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }


    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getMinVolume() {
        return minVolume;
    }


    public void setIncreaseVolume() {


        if (this.currentVolume < 100) {
            this.currentVolume = this.currentVolume + 1;
        }
    }

    public void setDecreaseVolume() {


        if (this.currentVolume > 0) {
            this.currentVolume = this.currentVolume - 1;
        }
    }
}






