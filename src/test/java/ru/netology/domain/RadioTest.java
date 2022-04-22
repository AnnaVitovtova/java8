package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldCurrentRadioStationBigMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(12);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void  shouldCurrentRadioStationMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void  shouldCurrentRadioStationBoundaryMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationBoundaryMin () {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationBigMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.setNextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouNextRadioStationBoundaryMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.setNextRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationAverageMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        rad.setNextRadioStation();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationBoundaryMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.setNextRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        rad.setNextRadioStation();

        int expected = 2;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevRadioStationMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.setPrevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationBoundaryMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        rad.setPrevRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        rad.setPrevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationBoundaryMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.setPrevRadioStation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void plusVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.setIncreaseVolume();


        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.setIncreaseVolume();


        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeBoundaryMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.setIncreaseVolume();


        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setIncreaseVolume();


        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeBoundaryMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.setIncreaseVolume();


        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeBigMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-2);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeBoundaryMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeAverage() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.setDecreaseVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.setDecreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeBoundaryMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.setDecreaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
