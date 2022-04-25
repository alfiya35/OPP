package ru.netology.domian;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void get() {

        Radio fm = new Radio();

        fm.currentStation = 7;

        int expected = 7;
        int actual = fm.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void set() {

        Radio fm = new Radio();

        fm.setCurrentStation(10);

        int expected = 0;
        int actual = fm.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next() {

        Radio fm = new Radio();
        fm.setCurrentStation(9);


        fm.nextCurrentRadioStation();

        int expected = 0;
        int actual = fm.getCurrentStation();

        assertEquals(expected, actual);
    }

}






