package ru.netology.javaqa.javaqamvn.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void radioNumberA() {
        Radio radio = new Radio();
        radio.setRadioNumber(5);
        int expected = 5;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void radioNumberB() {
        Radio radio = new Radio();
        radio.setRadioNumber(-1);
        int expected = 0;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void radioNumberC() {
        Radio radio = new Radio();
        radio.setRadioNumber(0);
        int expected = 0;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void radioNumberD() {
        Radio radio = new Radio();
        radio.setRadioNumber(1);
        int expected = 1;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void radioNumberE() {
        Radio radio = new Radio();
        radio.setRadioNumber(10);
        int expected = 0;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void radioNumberF() {
        Radio radio = new Radio();
        radio.setRadioNumber(9);
        int expected = 9;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNumberG() {
        Radio radio = new Radio();
        radio.setRadioNumber(8);
        int expected = 8;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioNumberA() {
        Radio radio = new Radio();
        radio.setRadioNumber(1);
        radio.nextRadioNumber();
        int expected = 2;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioNumberA() {
        Radio radio = new Radio();
        radio.setRadioNumber(9);
        radio.prevRadioNumber();
        int expected = 8;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumeA() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SoundVolumeB() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SoundVolumeC() {
        Radio radio = new Radio();
        radio.setSoundVolume(2);
        int expected = 2;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SoundVolumeD() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SoundVolumeE() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SoundVolumeF() {
        Radio radio = new Radio();
        radio.setSoundVolume(98);
        int expected = 98;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeA() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeB() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeC() {
        Radio radio = new Radio();
        radio.setSoundVolume(98);
        radio.increaseVolume();
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeD() {
        Radio radio = new Radio();
        radio.setSoundVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeE() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeF() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeA() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeB() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeC() {
        Radio radio = new Radio();
        radio.setSoundVolume(2);
        radio.decreaseVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeD() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeE() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}
