package ru.netology.domain;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void setNextRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = newCurrentRadioStation + 1;
        }
    }

    public void setPrevRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = newCurrentRadioStation - 1;
        }
    }
    public void setNumberRadioStation(int newCurrentRadioStation){
        currentRadioStation = newCurrentRadioStation;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void setIncreaseVolume() {


        if (this.currentVolume < 10) {
            this.currentVolume = this.currentVolume+1;
        }
    }

    public void setDecreaseVolume() {


        if (this.currentVolume > 0) {
            this.currentVolume = this.currentVolume-1;
        }
    }
}






