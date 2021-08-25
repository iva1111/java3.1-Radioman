package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10, 0, 0, 0, 0, 100);

    @Test
    public void testRadio() {
        Radio radio = new Radio();
    }

    @Test  //  задавать количество радиостанций
    public void setAmountRadioStation() {
        assertEquals(10, radio.getQuantityStation());
    }

    @Test // не устанавливать станцию > заданного количества станций
    public void notSetStationMoreQuantityStation() {
        radio.setCurrentStation(10);
        assertEquals(radio.getCurrentStation(), 10);
    }

    @Test // если больше заданного количества станций то ноль
    public void moreQuantityStationThenZero() {
        radio.setCurrentStation(11);
        assertEquals(radio.getCurrentStation(), 0);
    }

    @Test // если меньше мin то ноль
    public void lessMinThenZero() {
        radio.setCurrentStation(-1);
        assertEquals(radio.getCurrentStation(), 0);
    }

    @Test // не устанавливать станцию > min
    public void notSetStationMoreMin() {
        radio.setCurrentStation(1);
        assertEquals(radio.getCurrentStation(), 1);
    }

    @Test  // установи станцию после 10 - 0
    public void setNextStationAfterNine() {
        radio.setCurrentStation(10);
        radio.nextCurrentStation();
        assertEquals(radio.getCurrentStation(), 0);
    }

    @Test  // установи станцию перед 0 - 10
    public void setPrevStationAfterZero() {
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(radio.getCurrentStation(), 10);
    }

    @Test  // установить станцию после 0 - 1
    public void setNextStationAfterZero() {
        radio.setCurrentStation(0);
        radio.nextCurrentStation();
        assertEquals(radio.getCurrentStation(), 1);
    }

    @Test  // установи станцию перед 9 - 8
    public void setRadioStationNamberNine() {
        radio.setCurrentStation(9);
        radio.prevCurrentStation();
        assertEquals(radio.getCurrentStation(), 8);
    }

    @Test // установи любой номер станции
    public void setAnyStationNamber() {
        radio.setCurrentStation(4);
        assertEquals(radio.getCurrentStation(), 4);
    }


    @Test // установи звук меньше 0
    public void setVolumeLess0() {
        radio.setVolume(0);
        assertEquals(radio.getVolume(), 0);
    }

    @Test // установи звук больше 100
    public void setVolumeMore10() {
        radio.setVolume(100);
        assertEquals(radio.getVolume(), 100);
    }

    @Test // увеличить звук свыше 0
    public void plusVolumeOverMax() {
        radio.setVolume(0);
        assertEquals(radio.getVolume(), 0);
    }

    @Test // уменьшить звук меньше 100
    public void minusVolumeMinThenZero() {
        radio.setVolume(99);
        assertEquals(radio.getVolume(), 99);
    }
}

