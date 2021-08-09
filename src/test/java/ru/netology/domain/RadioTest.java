package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test  // установить номер радиостанции 9
    public void setRadioStationNamber9() {
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test  // установить номер радиостанции 8
    public void setRadioStationNamber8() {
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test  // установить номер радиостанции 7
    public void setRadioStationNamber7() {
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test  // установить номер радиостанции 6
    public void setRadioStationNamber6() {
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test  // установить номер радиостанции 5
    public void setRadioStationNamber5() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test  // установить номер радиостанции 4
    public void setRadioStationNamber4() {
        radio.setCurrentStation(4);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test  // установить номер радиостанции 3
    public void setRadioStationNamber3() {
        radio.setCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test  // установить номер радиостанции 2
    public void setRadioStationNamber2() {
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }

    @Test  // установить номер радиостанции 1
    public void setRadioStationNamber1() {
        radio.setCurrentStation(1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test  // установить номер радиостанции 0
    public void setRadioStationNamber0() {
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test  // установи следующую станцию после 9 - 0
    public void setNextStationAfterNinthZero() {
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test  // установи следующую станцию после 0 - 9
    public void setNextStationAfterZeroNinth() {
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }




    @Test // установи звук 0
    public void setVolumeNamber0() {
        radio.setCurrentVolume(0);
        assertEquals( 0,radio.getCurrentVolume());
    }

    @Test // установи звук 10
    public void setVolumeNamber10() {
        radio.setCurrentVolume(10);
        assertEquals( 10,radio.getCurrentVolume());
    }


    @Test // если звук max то ноль
    public void volumeMaxThenZero() {
        radio.setCurrentVolume(10);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test // если звук min то ноль
    public void volumeMinThenZero() {
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


}




