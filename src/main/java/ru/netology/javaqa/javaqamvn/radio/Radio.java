package ru.netology.javaqa.javaqamvn.radio;
public class Radio {
    public int radioNumber;
    public int soundVolume;

    public void setToMaxNumber() {
        radioNumber = 9;
    }

    public void setRadioNumber(int newRadioNumber) {
        if (newRadioNumber < 0) {
            return;
        }
        if (newRadioNumber > 9) {
            return;
        }
        radioNumber = newRadioNumber;
    }

    public void nextRadioNumber() {
        if (radioNumber < 9) {
            radioNumber = radioNumber + 1;
        } else {
            radioNumber = 0;
        }
    }

    public void prevRadioNumber() {
        if (radioNumber > 0) {
            radioNumber = radioNumber - 1;

        } else {
            radioNumber = 9;
        }
    }

    public void setToMaxSoundVolume() {
        soundVolume = 100;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}

