package ru.netology.javaqa.javaqamvn.radio;
public class Radio {


    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int radioNumber = minRadioStation;
    private int maxRadioVolume = 100;
    private int minRadioVolume = 0;
    private int soundVolume = minRadioVolume;
    public Radio (int minRadioStation, int maxRadioStation, int minRadioVolume, int maxRadioVolume) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.radioNumber = minRadioStation;
        this.minRadioVolume = minRadioVolume;
        this.maxRadioVolume = maxRadioVolume;
        this.soundVolume = minRadioVolume;
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
    // public Radio(int radioNumber) {
   //     this.radioNumber = radioNumber;
   // }

    //public void setToMaxNumber() {
//radioNumber = 9;
    //}


    public int getRadioNumber() {
        return radioNumber;
    }

    public void setRadioNumber(int RadioNumber) {
        if (RadioNumber < 0) {
            return;
        }
        if (RadioNumber > maxRadioStation) {
            return;
        }
        this.radioNumber = RadioNumber;
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

    //public void setToMaxSoundVolume() {
      //  soundVolume = 100;
   // }


    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int SoundVolume) {
        if (SoundVolume < 0) {
            return;
        }
        if (SoundVolume > maxRadioVolume) {
            return;
        }
        this.soundVolume = SoundVolume;
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

