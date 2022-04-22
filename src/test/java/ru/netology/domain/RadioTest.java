package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    Radio rad = new Radio();

    @Test
    public void shouldAmountStation() {
        assertEquals(10, rad.getAmountRadioStation());
    }

    @Test
    public void amountStation1() {
        rad.setAmountRadioStation();

        int expected = 10;
        int actual = rad.getAmountRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void amountStation2() {
        Radio rad = new Radio(20);
        rad.setAmountRadioStation();

        int expected = 20;
        int actual = rad.getAmountRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void amountStation3() {
        Radio rad = new Radio(8);
        rad.setAmountRadioStation();

        int expected = 8;
        int actual = rad.getAmountRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void maxStation() {
        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.getMaxRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void maxStation1() {
        rad.setCurrentVolume(11);

        int expected = 10;
        int actual = rad.getMaxRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void minStation() {
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getMinRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void minStation1() {
        rad.setCurrentVolume(-2);

        int expected = 0;
        int actual = rad.getMinRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationBigMax() {

        rad.setCurrentRadioStation(12);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationMax() {

        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationBigBoundaryMax() {

        rad.setCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentRadioStationNewRadio() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(15);

        int expected = 15;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentRadioStationMin() {

        rad.setCurrentRadioStation(1);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationBigBoundaryMin() {

        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationBigBigMin() {

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationMax() {
        rad.setCurrentRadioStation(9);

        rad.setNextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationBoundaryMax() {

        rad.setCurrentRadioStation(8);
        rad.setNextRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationBoundaryAverageMax() {
        rad.setCurrentRadioStation(5);

        rad.setNextRadioStation();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationMim() {
        rad.setCurrentRadioStation(0);

        rad.setNextRadioStation();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationBoundaryMim() {
        rad.setCurrentRadioStation(1);

        rad.setNextRadioStation();

        int expected = 2;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevRadioStationMim() {

        rad.setCurrentRadioStation(0);
        rad.setPrevRadioStation();

        int expected = 10;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationBoundaryMim() {

        rad.setCurrentRadioStation(1);
        rad.setPrevRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationMax() {

        rad.setCurrentRadioStation(10);
        rad.setPrevRadioStation();

        int expected = 10;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationBoundaryMax() {
        rad.setCurrentRadioStation(9);

        rad.setPrevRadioStation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldMaxVolume() {

        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMax() {

        rad.setCurrentVolume(100);
        rad.setIncreaseVolume();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void plusVolumeBoundaryMax() {

        rad.setCurrentVolume(99);
        rad.setIncreaseVolume();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMin() {

        rad.setCurrentVolume(0);
        rad.setIncreaseVolume();


        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeBoundaryMin() {

        rad.setCurrentVolume(1);
        rad.setIncreaseVolume();


        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {

        rad.setCurrentVolume(0);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeMin() {

        rad.setCurrentVolume(-2);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeBoundaryMin() {

        rad.setCurrentVolume(1);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeAverage() {

        rad.setCurrentVolume(50);
        rad.setDecreaseVolume();

        int expected = 49;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
