package ru.netology.javaqa.javaqamvn.radio;
public class Radio {
    private int radioNumber;
    private int soundVolume;

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
        if (RadioNumber > 9) {
            return;
        }
        this.radioNumber = RadioNumber;
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
        if (SoundVolume > 100) {
            return;
        }
        this.soundVolume = SoundVolume;
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

