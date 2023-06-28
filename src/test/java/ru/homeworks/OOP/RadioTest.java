package ru.homeworks.OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setNewCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationForLessThanMin() {
        Radio radio = new Radio();
        radio.setNewCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationForMoreThanMax() {
        Radio radio = new Radio();
        radio.setNewCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentRadioStationForLessThenMax() {
        Radio radio = new Radio();
        radio.setNewCurrentRadioStation(5);
        radio.nextCurrentRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentRadioStationForMax() {
        Radio radio = new Radio();
        radio.setNewCurrentRadioStation(9);
        radio.nextCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentRadioStationForMoreThanMin() {
        Radio radio = new Radio();
        radio.setNewCurrentRadioStation(9);
        radio.prevCurrentRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentRadioStationForMin() {
        Radio radio = new Radio();
        radio.setNewCurrentRadioStation(0);
        radio.prevCurrentRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForLessThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(90);
        radio.increaseVolume();
        int expected = 91;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForMoreThenMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(90);
        radio.decreaseVolume();
        int expected = 89;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
