package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void test() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(12);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio rad = new Radio();
        rad.setNextRadioStation(9);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void next2() {
        Radio rad = new Radio();
        rad.setNextRadioStation(8);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void next3() {
        Radio rad = new Radio();
        rad.setNextRadioStation(5);

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void next4() {
        Radio rad = new Radio();
        rad.setNextRadioStation(0);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void next5() {
        Radio rad = new Radio();
        rad.setNextRadioStation(1);

        int expected = 2;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }



    @Test
    public void prev() {
        Radio rad = new Radio();

        rad.setPrevRadioStation(0);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prev2() {
        Radio rad = new Radio();
        rad.setPrevRadioStation(1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void prev3() {
        Radio rad = new Radio();
        rad.setPrevRadioStation(10);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void prev4() {
        Radio rad = new Radio();
        rad.setPrevRadioStation(9);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void number() {
        Radio rad = new Radio();
        rad.setNumberRadioStation(1);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void number2() {
        Radio rad = new Radio();
        rad.setNumberRadioStation(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void number3() {
        Radio rad = new Radio();
        rad.setNumberRadioStation(10);

        int expected = 10;
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
    public void plusVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.setIncreaseVolume();


        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.setIncreaseVolume();


        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void plusVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setIncreaseVolume();


        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void plusVolume4() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.setIncreaseVolume();


        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void minusVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-2);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void minusVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void minusVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.setDecreaseVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void minusVolume4() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.setDecreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void minusVolume5() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.setDecreaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
