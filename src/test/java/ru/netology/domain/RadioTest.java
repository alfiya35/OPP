package ru.netology.domain;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadioStationDefault() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentRadioStation(15);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioSum() {
        Radio radio = new Radio(20);
    }

    @Test
    void middleSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void minSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void maxSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void minNextCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentRadioStation(0);
        radio.nextCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void middleNextCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentRadioStation(4);
        radio.nextCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void maxNextCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentRadioStation(9);
        radio.nextCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void largeNextCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentRadioStation(8);
        radio.nextCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void prevCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentRadioStation(1);
        radio.prevCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void minPrevCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentRadioStation(0);
        radio.prevCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void middlePrevCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 7;
        radio.setCurrentRadioStation(8);
        radio.prevCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void maxPrevCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setCurrentRadioStation(9);
        radio.prevCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void upCurrentVolume() {
        Radio radio = new Radio();
        int expected = 2;
        radio.setCurrentVolume(1);
        radio.upCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void minUpCurrentVolume() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentVolume(0);
        radio.upCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void middleUpCurrentVolume() {
        Radio radio = new Radio();
        int expected = 61;
        radio.setCurrentVolume(60);
        radio.upCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void maxUpCurrentVolume() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(100);
        radio.upCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downCurrentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(1);
        radio.downCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void minDownCurrentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(0);
        radio.downCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void middleDownCurrentVolume() {
        Radio radio = new Radio();
        int expected = 49;
        radio.setCurrentVolume(50);
        radio.downCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void maxDownCurrentVolume() {
        Radio radio = new Radio();
        int expected = 99;
        radio.setCurrentVolume(100);
        radio.downCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}


