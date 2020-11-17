package com.sports.crickethouse.ui.Model;

import android.content.Intent;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SeriesTeamModel {

    @SerializedName("seriesTeams")
    private TeamsModel seriesTeams;

    public SeriesTeamModel(TeamsModel seriesTeams) {
        this.seriesTeams = seriesTeams;
    }

    public TeamsModel getSeriesTeams() {
        return seriesTeams;
    }
}











//    @SerializedName("id")
//    @Expose
//    private Integer id;
//    @SerializedName("name")
//    @Expose
//    private String name;
//    @SerializedName("shortName")
//    @Expose
//    private String shortName;
//    @SerializedName("logoUrl")
//    @Expose
//    private String logoUrl;
//
//    public SeriesTeamModel(Integer id, String name, String shortName, String logoUrl){
//        this.id = id;
//        this.name = name;
//        this.shortName = shortName;
//        this.logoUrl = logoUrl;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getShortName() {
//        return shortName;
//    }
//
//    public void setShortName(String shortName) {
//        this.shortName = shortName;
//    }
//
//    public String getLogoUrl() {
//        return logoUrl;
//    }
//
//    public void setLogoUrl(String logoUrl) {
//        this.logoUrl = logoUrl;
//    }


