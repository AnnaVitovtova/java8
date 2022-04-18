package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
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


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void setIncreaseVolume() {


        if (this.currentVolume < 10) {
            this.currentVolume = this.currentVolume + 1;
        }
    }

    public void setDecreaseVolume() {


        if (this.currentVolume > 0) {
            this.currentVolume = this.currentVolume - 1;
        }
    }
}






