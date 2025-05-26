package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    private int radioNumber;
    private int soundVolume;


    public int getRadioNumber() {
        return radioNumber;
    }

    public void setRadioNumber(int radioNumber) {
        if (radioNumber < 0) {
            return;
        }
        if (radioNumber > 9) {
            return;
        }
        this.radioNumber = radioNumber;
    }

    public void nextRadioNumber() {
        if (radioNumber != 9) {
            radioNumber = radioNumber + 1;
        } else {
            radioNumber = 0;
        }
    }

    public void prevRadioNumber() {
        if (radioNumber != 0) {
            radioNumber = radioNumber - 1;

        } else {
            radioNumber = 9;
        }
    }


    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 100) {
            return;
        }
        this.soundVolume = soundVolume;
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

