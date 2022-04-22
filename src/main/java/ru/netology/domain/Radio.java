package ru.netology.domain;

public class Radio {

    private int amountRadioStation = 10;
    private int maxRadioStation = 10;
    private int minRadioStation;
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume;

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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getMinVolume() {
        return minVolume;
    }


    public void setAmountRadioStation() {

        this.maxRadioStation = amountRadioStation - 1;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > amountRadioStation - 1) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setNextRadioStation() {
        if (currentRadioStation > amountRadioStation - 2) {
            this.currentRadioStation = minRadioStation;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }
    }


    public void setPrevRadioStation() {
        if (currentRadioStation < minRadioStation +1) {
            this.currentRadioStation = amountRadioStation;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }
    }


    public void setIncreaseVolume() {


        if (currentVolume > maxVolume -1) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void setDecreaseVolume() {


        if (currentVolume < minVolume +1) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }
}






