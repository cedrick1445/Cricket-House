package com.sports.crickethouse.ui.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchListModel {
    @SerializedName("id")
    private Integer id;
    @SerializedName("matchTypeId")
    private Integer matchTypeId;
    @SerializedName("series")
    private SeriesModel series;
    @SerializedName("name")
    private String name;
    @SerializedName("status")
    private String status;
    @SerializedName("venue")
    private VenueModel venue;
    @SerializedName("homeTeam")
    private MatchTeamModel homeTeam;
    @SerializedName("awayTeam")
    private MatchTeamModel awayTeam;
    @SerializedName("currentMatchState")
    private String currentMatchState;
    @SerializedName("matchSummaryText")
    private String matchSummaryText;
    @SerializedName("scores")
    private ScoresModel scores;
    @SerializedName("winningTeamId")
    private Integer winningTeamId;
    @SerializedName("startDateTime")
    private String startDateTime;
    @SerializedName("endDateTime")
    private String endDateTime;


    public MatchListModel(Integer id, Integer matchTypeId, SeriesModel series, String name, String status, VenueModel venue, MatchTeamModel homeTeam, MatchTeamModel awayTeam, String currentMatchState, Boolean isMultiDay, String matchSummaryText, ScoresModel scores, List<Object> liveStreams, Boolean isLive, Integer currentInningId, Boolean isMatchDrawn, Boolean isMatchAbandoned, Integer winningTeamId, String startDateTime, String endDateTime, Boolean isWomensMatch, Boolean isGamedayEnabled, Boolean removeMatch) {
        this.id = id;
        this.matchTypeId = matchTypeId;
        this.series = series;
        this.name = name;
        this.status = status;
        this.venue = venue;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.currentMatchState = currentMatchState;
        this.matchSummaryText = matchSummaryText;
        this.scores = scores;
        this.winningTeamId = winningTeamId;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;

    }

    public Integer getId() {
        return id;
    }

    public Integer getMatchTypeId() {
        return matchTypeId;
    }

    public SeriesModel getSeries() {
        return series;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public VenueModel getVenue() {
        return venue;
    }

    public MatchTeamModel getHomeTeam() {
        return homeTeam;
    }

    public MatchTeamModel getAwayTeam() {
        return awayTeam;
    }

    public String getCurrentMatchState() {
        return currentMatchState;
    }

    public String getMatchSummaryText() {
        return matchSummaryText;
    }

    public ScoresModel getScores() {
        return scores;
    }

    public Integer getWinningTeamId() {
        return winningTeamId;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }



}
