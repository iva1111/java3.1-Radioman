package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test // следует установить любую радиостанцию
    public void shouldSetAnyRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxAndMinRadioStation() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
    }

    @Test  // должен установить предыдущую радиостанцию
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(6);
        radio.decreaseStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test  // должен установить следующую радиостанцию
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.increaseStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test // должен установить радиостанцию > max
    public void shouldSetRadioStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test // должен установить радиостанцию ниже min
    public void shouldDownMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test // должен установить радиостанцию следующую за min
    public void shouldDownStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.decreaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test // должен установить радиостанцию следующую за max
    public void shouldNextMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }


    @Test // следует установить любую громкость
    public void shouldSetAnyVolume() {
        Radio radio = new Radio(0);
        radio.setCurrentVolume(23);
        assertEquals(23, radio.getCurrentVolume());
    }

    @Test // должен увеличивать громкость
    public void shouldPlusVolume() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(27);
        radio.increaseVolume();
        assertEquals(28, radio.getCurrentVolume());
    }

    @Test // должен уменьшить громкость
    public void shouldMinusVolume() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(45);
        radio.decreaseVolume();
        assertEquals(44, radio.getCurrentVolume());
    }

    @Test  // должен увеличивать громкость выше max
    public void shouldPlusVolumeAboveMax() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(123);
        radio.increaseVolume();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test  // должен уменьшить громкость ниже min
    public void shouldMinusVolumeBelowMin() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(-33);
        radio.decreaseVolume();
        assertEquals(0, radio.getMinVolume());
    }

    @Test // должен установить желаемую минусовую громкость
    public void shouldSetDesiredAnyMinusVolume() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(-20);
        assertEquals(0, radio.getCurrentVolume());
    }
}