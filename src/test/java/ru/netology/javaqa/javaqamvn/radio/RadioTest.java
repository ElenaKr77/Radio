package ru.netology.javaqa.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testRadio() {
        Radio radio = new Radio(2, 8, 3, 90);
        Assertions.assertEquals(2, radio.getMinRadioStation());
        Assertions.assertEquals(8, radio.getMaxRadioStation());
        Assertions.assertEquals(2, radio.getRadioNumber());
        Assertions.assertEquals(3, radio.getMinRadioVolume());
        Assertions.assertEquals(90, radio.getMaxRadioVolume());
        Assertions.assertEquals(3, radio.getSoundVolume());
    }

    @Test
    public void testRadioQ() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(10, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getRadioNumber());
    }

    @Test
    public void radioNumberA() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(5);
        int expected = 5;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNumberB() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(-1);
        int expected = 0;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNumberC() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(0);
        int expected = 0;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNumberD() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(1);
        int expected = 1;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNumberE() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(10);
        int expected = 0;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNumberF() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(9);
        int expected = 9;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNumberG() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(8);
        int expected = 8;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioNumberA() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(1);
        radio.nextRadioNumber();
        int expected = 2;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioNumberB() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(9);
        radio.nextRadioNumber();
        int expected = 0;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioNumberA() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(9);
        radio.prevRadioNumber();
        int expected = 8;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioNumberB() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setRadioNumber(0);
        radio.prevRadioNumber();
        int expected = 9;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeA() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(0);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeB() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(1);
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeC() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeD() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(100);
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeE() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(99);
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeF() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(101);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeA() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeB() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeC() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(98);
        radio.increaseVolume();
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeD() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeE() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeF() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeA() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeB() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeC() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(2);
        radio.decreaseVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeD() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeE() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setSoundVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}
