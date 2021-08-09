package ru.netology.domain;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;

    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    // текущая станция
    public int getCurrentStation() {
        return currentStation;
    }

    // следующая станция
    public void nextStation() {
        if (currentStation <= maxStation) {
            currentStation = 0;
        }
    }

    // предыдущая станция
    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = 9;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    // установи текущую станцию
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    // текущий звук
    public int getCurrentVolume() {
        return currentVolume;
    }

    // увеличение звука
    public void plusVolume() {
        if (currentVolume > maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    // уменьшение звука
    public void minusVolume() {
        if (currentVolume == minVolume) {
            return;
        }
            this.currentVolume = currentVolume - 1;
        }


    // установи текущий звук
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


}


