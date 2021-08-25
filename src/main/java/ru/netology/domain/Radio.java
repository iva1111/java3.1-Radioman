package ru.netology.domain;

public class Radio {
    private int quantityStations = 10;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int volume;

    public Radio() {
    }

    public Radio(int quantityStations, int currentStation, int minVolume, int maxVolume, int volume, int i) {
        this.quantityStations = quantityStations;
        this.currentStation = currentStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.volume = volume;
    }

    // количество станций
    public int getQuantityStation() {
        return quantityStations;
    }

    // текущая станция
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > quantityStations) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    //  следующая станция
    public void nextCurrentStation() {
        if (currentStation < quantityStations) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    // предыдущая станция
    public void prevCurrentStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = quantityStations;
        }
    }


    // текущий звук
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
