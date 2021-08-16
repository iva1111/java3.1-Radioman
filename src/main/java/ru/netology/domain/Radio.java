package ru.netology.domain;

public class Radio {
    private int minStation = 0;
    private int maxStation = 10;
    private int currentStation;
    private int nextCurrentStation;
    private int prevCurrentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int volume;

    public Radio(int minStation, int maxStation, int currentStation, int minVolume, int maxVolume, int volume, int i) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
       /* this.nextCurrentStation = nextCurrentStation;
        this.prevCurrentStation = prevCurrentStation;*/
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.volume = volume;
    }

    // max станция
    public int getMaxStation() {
        return maxStation;
    }

    // min станция
    public int getMinStation() {
        return minStation;
    }

    // текущая станция
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    //  следующая станция
    public void nextCurrentStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    // предыдущая станция
    public void prevCurrentStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
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
