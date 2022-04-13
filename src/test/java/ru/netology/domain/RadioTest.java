package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio rad = new Radio(10,
            9, 0, 0,
            25, 100, 0);

    Radio rad1 = new Radio();

    @Test
    public void shouldAmountStation() {
        assertEquals(10, rad.getAmountRadioStation());
    }

    @Test
    public void maxStation() {
        rad.setCurrentVolume(10);

        int expected = 9;
        int actual = rad.getMaxRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void maxStation1() {
        rad.setCurrentVolume(11);

        int expected = 9;
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
    public void test() {

        rad.setCurrentRadioStation(12);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {

        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {

        rad.setCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {

        rad.setCurrentRadioStation(1);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {

        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next() {

        rad.setNextRadioStation(9);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next2() {

        rad.setNextRadioStation(8);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next3() {

        rad.setNextRadioStation(5);

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next4() {

        rad.setNextRadioStation(0);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next5() {

        rad.setNextRadioStation(1);

        int expected = 2;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void prev() {


        rad.setPrevRadioStation(0);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prev2() {

        rad.setPrevRadioStation(1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prev3() {

        rad.setPrevRadioStation(10);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prev4() {

        rad.setPrevRadioStation(9);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void number() {

        rad.setNumberRadioStation(1);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void number2() {

        rad.setNumberRadioStation(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void number3() {

        rad.setNumberRadioStation(10);

        int expected = 10;
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
    public void plusVolume() {

        rad.setCurrentVolume(100);
        rad.setIncreaseVolume();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void plusVolume2() {

        rad.setCurrentVolume(99);
        rad.setIncreaseVolume();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolume3() {

        rad.setCurrentVolume(0);
        rad.setIncreaseVolume();


        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void plusVolume4() {

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
    public void minusVolume1() {

        rad.setCurrentVolume(-2);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolume2() {

        rad.setCurrentVolume(1);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolume3() {

        rad.setCurrentVolume(5);
        rad.setDecreaseVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolume4() {

        rad.setCurrentVolume(10);
        rad.setDecreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minusVolume5() {

        rad.setCurrentVolume(9);
        rad.setDecreaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
