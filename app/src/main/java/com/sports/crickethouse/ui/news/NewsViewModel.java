package com.sports.crickethouse.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewsViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> mText1;

    public NewsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("A cricket bat is a special device used by cricket players to hit the ball in cricket, usually consisting of a sugar cane handle connected to a flat-headed willow blade. " +
                "If the batter is holding the racket and touching the ground, it can also be used by the batter who is serving to avoid jumping." +
                " The racket must not exceed 38 inches (965 mm) in length and 4.25 inches (108 mm) in width. " +
                "Its use was first mentioned in 1624. Since 1979, a legal change has stipulated that bats can only be made of wood.");

        mText1 = new MutableLiveData<>();
        mText1.setValue("Cricket ball is a hardball used to play cricket. " +
                "Cricket consists of a cork core wound with a rope, then a leather skin is sewn, and then managed on a first-class level according to the cricket method." +
                " When bowling, the trajectory of cricket is affected by the top hat, the state of the ball, and the impact of the ball. " +
                "When bowling, the trajectory of the cricket is affected by the player's action and the state of the ball. A key role in the field. " +
                "The main method for a batter to score is to hit the ball with a racket where it is safe to run or to guide the ball through or over the boundary. Cricket is harder than baseball. " +
                "In the test cricket match, the professional football match lasted for several days, and almost the entire amateur cricket match used the traditional red cricket." +
                " In many one-day cricket matches, white balls are used instead so that they are still visible under floodlights. Since 2010, pink has been introduced to contrast with the white clothing of players and improve night visibility in day/night test matches. " +
                "Cricket balls composed of white, red, and pink cricket training balls are also common can be used for training or informal cricket matches. In a cricket game, the quality of the ball changes to the point where it is no longer usable. During the decline, the nature of the ball changes, which affects the game.  " +
                "During the game, it is forbidden to change the state of cricket outside of the permitted methods specified by the cricket rules, and the so-called tampering with the ball has caused many controversies. Cricket caused injury and death during the game. " +
                "The harm caused by cricket is the main motivation for the introduction of protective equipment.");


    }

    public LiveData<String> getText() {
        return mText;
    }
}