package com.sports.crickethouse.ui.Model;

import com.google.gson.annotations.SerializedName;

public class SeriesModel {

    @SerializedName("seriesList")
    private SeriesCallModel seriesList;

    public SeriesModel(SeriesCallModel seriesList) {
        this.seriesList = seriesList;
    }

    public SeriesCallModel getSeriesList() {
        return seriesList;
    }
}
