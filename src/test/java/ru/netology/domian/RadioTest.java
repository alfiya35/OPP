package ru.netology.domian;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;


public class RadioTest {

    @Test
    public void test() {
        Radio fm = new Radio();

        fm.currentRadioStation = 15;

        int expected = 15;
        int actual = fm.currentRadioStation;

        assertEquals(expected,actual);
    }

    @Test
    public void test() {
        Radio fm = new Radio();
        fm.currentRadioStation = 11;
        int expected = 0;
        int actual = fm.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

}

