package ru.homeworks.OOP;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setNewCurrentRadioStation(-2);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


}
