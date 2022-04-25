package ru.netology.domain;

public class Radio {
    public int currentStation;
    public int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }
    //public void nextCurrentRadioStation(){
    //   if(currentStation < 9) {
    //     currentStation = currentStation + 1;
    // }

    // }


    public void nextCurrentRadioStation() {
        int newCurrentRadioStation = currentStation + 1;
        //this.currentStation = newCurrentRadioStation;
        setCurrentStation(newCurrentRadioStation);
    }

}