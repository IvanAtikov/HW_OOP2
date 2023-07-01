package ru.homeworks.OOP;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStations = 10;  // Количество станций по умолчанию
    private int maxNumberStation;   // Максимальный номер станции

    public Radio(int maxStations) {
        this.maxStations = maxStations;
        this.maxNumberStation = maxStations - 1;
        this.currentRadioStation = currentRadioStation;
    }

    public Radio() {
        this.maxStations = maxStations;
        this.maxNumberStation = maxStations - 1;
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNewCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxNumberStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }
    //     if (newCurrentVolume < 0) {
    //         return;
    //     }
    //     if (newCurrentVolume > 100) {
    //         return;
    //     }
    //     currentVolume = newCurrentVolume;
    //  }

    public void nextCurrentRadioStation() {
        if (currentRadioStation < maxNumberStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevCurrentRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxNumberStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }

}
