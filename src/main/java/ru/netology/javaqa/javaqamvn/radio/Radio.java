package ru.netology.javaqa.javaqamvn.radio;

public class Radio {


    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int radioNumber = minRadioStation;
    private int maxRadioVolume = 100;
    private int minRadioVolume = 0;
    private int soundVolume = minRadioVolume;

    public Radio(int minRadioStation, int maxRadioStation, int minRadioVolume, int maxRadioVolume) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.radioNumber = minRadioStation;
        this.minRadioVolume = minRadioVolume;
        this.maxRadioVolume = maxRadioVolume;
        this.soundVolume = minRadioVolume;
    }

    public Radio(int size) {
        maxRadioStation = minRadioStation + size;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioVolume() {
        return maxRadioVolume;
    }

    public int getMinRadioVolume() {
        return minRadioVolume;
    }


    public int getRadioNumber() {
        return radioNumber;
    }

    public void setRadioNumber(int radioNumber) {
        if (radioNumber < 0) {
            return;
        }
        if (radioNumber > maxRadioStation) {
            return;
        }
        this.radioNumber = radioNumber;
    }

    public void nextRadioNumber() {
        if (radioNumber != maxRadioStation) {
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
        if (soundVolume > maxRadioVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < maxRadioVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}

