package com.sports.crickethouse.ui.schedule;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sports.crickethouse.ui.Model.SeriesListModel;
import com.sports.crickethouse.ui.api.Repositories;

import java.util.List;

public class ScheduleViewModel extends ViewModel {

    private MutableLiveData<List<SeriesListModel>> seriesList;
    private Repositories repositories;


    public void init(Context context){
        if(seriesList != null){
            return;
        }
        repositories = Repositories.getInstance(context);
        seriesList = repositories.getSeries();
    }

    public LiveData<List<SeriesListModel>> getSeries(){
        return seriesList;
    }

}