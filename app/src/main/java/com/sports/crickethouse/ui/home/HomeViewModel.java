package com.sports.crickethouse.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> mText1;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Cricket is a game played with a cricket bat and a red ball." +
                " There are two competitors (teams) composed of 11 players. " +
                "This sport can be traced back to the early 16th century and has been very popular ever since. " +
                "The Cricket World Cup is the pinnacle of international competition. Other significant occasions incorporate the T20 World Cup, Test Arrangement, and One Day arrangement. " +
                "Every nation runs a large group of homegrown rivalries all exceptionally serious.");

        mText1 = new MutableLiveData<>();
        mText1.setValue("A Cricket match is played on a grass field, roughly oval with a rectangular area in the middle or center of which is a flat strip, known as the pitch, " +
                "that is 22 yards (20.12 meters) by 10 feet (3.04 meters) the wide of the cricket field. " +
                "At both ends of the pitch, two sets of three wooden sticks called wickets are placed on the ground. At the top of each ticket gate lies horizontal fragments called bail.");


    }



    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<String> getSubText() {
        return mText1;
    }
}