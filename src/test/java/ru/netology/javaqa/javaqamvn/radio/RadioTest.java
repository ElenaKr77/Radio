package ru.netology.javaqa.javaqamvn.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetToMaxNumber() {
        Radio radio = new Radio();
        radio.setToMaxNumber();
        int expected = 9;
        int actual = radio.radioNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioNumber() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.radioNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioNumber() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.radioNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setToMaxSoundVolume();
        int expected = 100;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }
}
