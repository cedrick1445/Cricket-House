package com.sports.crickethouse.ui.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GamesModel {



    @SerializedName("matchList")
    private MatchModel matchList;

    public GamesModel(MatchModel matchList) {
        this.matchList = matchList;
    }

    public MatchModel getMatchList() {
        return matchList;
    }














//    @SerializedName("meta")
//    @Expose
//    private Meta meta;
//    @SerializedName("matchList")
//    @Expose
//    private MatchList matchList;
//    @SerializedName("status")
//    @Expose
//    private Integer status;
//    @SerializedName("poweredBy")
//    @Expose
//    private String poweredBy;
//
//    public Meta getMeta() {
//        return meta;
//    }
//
//    public void setMeta(Meta meta) {
//        this.meta = meta;
//    }
//
//    public MatchList getMatchList() {
//        return matchList;
//    }
//
//    public void setMatchList(MatchList matchList) {
//        this.matchList = matchList;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//    public String getPoweredBy() {
//        return poweredBy;
//    }
//
//    public void setPoweredBy(String poweredBy) {
//        this.poweredBy = poweredBy;
//    }
//
//
//    public class Meta {
//
//        @SerializedName("upcomingMatchCount")
//        @Expose
//        private Integer upcomingMatchCount;
//        @SerializedName("inProgressMatchCount")
//        @Expose
//        private Integer inProgressMatchCount;
//        @SerializedName("completedMatchCount")
//        @Expose
//        private Integer completedMatchCount;
//
//        public Integer getUpcomingMatchCount() {
//            return upcomingMatchCount;
//        }
//
//        public void setUpcomingMatchCount(Integer upcomingMatchCount) {
//            this.upcomingMatchCount = upcomingMatchCount;
//        }
//
//        public Integer getInProgressMatchCount() {
//            return inProgressMatchCount;
//        }
//
//        public void setInProgressMatchCount(Integer inProgressMatchCount) {
//            this.inProgressMatchCount = inProgressMatchCount;
//        }
//
//        public Integer getCompletedMatchCount() {
//            return completedMatchCount;
//        }
//
//        public void setCompletedMatchCount(Integer completedMatchCount) {
//            this.completedMatchCount = completedMatchCount;
//        }
//
//    }
//
//    public class MatchList {
//
//        @SerializedName("matches")
//        @Expose
//        private List<Match> matches = null;
//
//        public List<Match> getMatches() {
//            return matches;
//        }
//
//        public void setMatches(List<Match> matches) {
//            this.matches = matches;
//        }
//
//    }
//    public class Match {
//
//        @SerializedName("id")
//        @Expose
//        private Integer id;
//        @SerializedName("matchTypeId")
//        @Expose
//        private Integer matchTypeId;
//        @SerializedName("name")
//        @Expose
//        private String name;
//        @SerializedName("status")
//        @Expose
//        private String status;
//        @SerializedName("homeTeam")
//        @Expose
//        private Teams homeTeam;
//        @SerializedName("awayTeam")
//        @Expose
//        private Teams awayTeam;
//        @SerializedName("currentMatchState")
//        @Expose
//        private String currentMatchState;
//        @SerializedName("isMultiDay")
//        @Expose
//        private Boolean isMultiDay;
//        @SerializedName("matchSummaryText")
//        @Expose
//        private String matchSummaryText;
//        @SerializedName("scores")
//        @Expose
//        private Scores scores;
//        @SerializedName("liveStreams")
//        @Expose
//        private List<Object> liveStreams = null;
//        @SerializedName("isLive")
//        @Expose
//        private Boolean isLive;
//        @SerializedName("currentInningId")
//        @Expose
//        private Integer currentInningId;
//        @SerializedName("isMatchDrawn")
//        @Expose
//        private Boolean isMatchDrawn;
//        @SerializedName("isMatchAbandoned")
//        @Expose
//        private Boolean isMatchAbandoned;
//        @SerializedName("startDateTime")
//        @Expose
//        private String startDateTime;
//        @SerializedName("endDateTime")
//        @Expose
//        private String endDateTime;
//        @SerializedName("isWomensMatch")
//        @Expose
//        private Boolean isWomensMatch;
//        @SerializedName("isGamedayEnabled")
//        @Expose
//        private Boolean isGamedayEnabled;
//        @SerializedName("removeMatch")
//        @Expose
//        private Boolean removeMatch;
//        @SerializedName("winningTeamId")
//        @Expose
//        private Integer winningTeamId;
//
//        public Integer getId() {
//            return id;
//        }
//
//        public void setId(Integer id) {
//            this.id = id;
//        }
//
//        public Integer getMatchTypeId() {
//            return matchTypeId;
//        }
//
//        public void setMatchTypeId(Integer matchTypeId) {
//            this.matchTypeId = matchTypeId;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getStatus() {
//            return status;
//        }
//
//        public void setStatus(String status) {
//            this.status = status;
//        }
//
//        public Teams getHomeTeam() {
//            return homeTeam;
//        }
//
//        public void setHomeTeam(Teams homeTeam) {
//            this.homeTeam = homeTeam;
//        }
//
//        public Teams getAwayTeam() {
//            return awayTeam;
//        }
//
//        public void setAwayTeam(Teams awayTeam) {
//            this.awayTeam = awayTeam;
//        }
//
//        public String getCurrentMatchState() {
//            return currentMatchState;
//        }
//
//        public void setCurrentMatchState(String currentMatchState) {
//            this.currentMatchState = currentMatchState;
//        }
//
//        public Boolean getIsMultiDay() {
//            return isMultiDay;
//        }
//
//        public void setIsMultiDay(Boolean isMultiDay) {
//            this.isMultiDay = isMultiDay;
//        }
//
//        public String getMatchSummaryText() {
//            return matchSummaryText;
//        }
//
//        public void setMatchSummaryText(String matchSummaryText) {
//            this.matchSummaryText = matchSummaryText;
//        }
//
//        public Scores getScores() {
//            return scores;
//        }
//
//        public void setScores(Scores scores) {
//            this.scores = scores;
//        }
//
//        public List<Object> getLiveStreams() {
//            return liveStreams;
//        }
//
//        public void setLiveStreams(List<Object> liveStreams) {
//            this.liveStreams = liveStreams;
//        }
//
//        public Boolean getIsLive() {
//            return isLive;
//        }
//
//        public void setIsLive(Boolean isLive) {
//            this.isLive = isLive;
//        }
//
//        public Integer getCurrentInningId() {
//            return currentInningId;
//        }
//
//        public void setCurrentInningId(Integer currentInningId) {
//            this.currentInningId = currentInningId;
//        }
//
//        public Boolean getIsMatchDrawn() {
//            return isMatchDrawn;
//        }
//
//        public void setIsMatchDrawn(Boolean isMatchDrawn) {
//            this.isMatchDrawn = isMatchDrawn;
//        }
//
//        public Boolean getIsMatchAbandoned() {
//            return isMatchAbandoned;
//        }
//
//        public void setIsMatchAbandoned(Boolean isMatchAbandoned) {
//            this.isMatchAbandoned = isMatchAbandoned;
//        }
//
//        public String getStartDateTime() {
//            return startDateTime;
//        }
//
//        public void setStartDateTime(String startDateTime) {
//            this.startDateTime = startDateTime;
//        }
//
//        public String getEndDateTime() {
//            return endDateTime;
//        }
//
//        public void setEndDateTime(String endDateTime) {
//            this.endDateTime = endDateTime;
//        }
//
//        public Boolean getIsWomensMatch() {
//            return isWomensMatch;
//        }
//
//        public void setIsWomensMatch(Boolean isWomensMatch) {
//            this.isWomensMatch = isWomensMatch;
//        }
//
//        public Boolean getIsGamedayEnabled() {
//            return isGamedayEnabled;
//        }
//
//        public void setIsGamedayEnabled(Boolean isGamedayEnabled) {
//            this.isGamedayEnabled = isGamedayEnabled;
//        }
//
//        public Boolean getRemoveMatch() {
//            return removeMatch;
//        }
//
//        public void setRemoveMatch(Boolean removeMatch) {
//            this.removeMatch = removeMatch;
//        }
//
//        public Integer getWinningTeamId() {
//            return winningTeamId;
//        }
//
//        public void setWinningTeamId(Integer winningTeamId) {
//            this.winningTeamId = winningTeamId;
//        }
//    }
//
//    public class Teams {
//
//        @SerializedName("isBatting")
//        @Expose
//        private Boolean isBatting;
//        @SerializedName("id")
//        @Expose
//        private Integer id;
//        @SerializedName("name")
//        @Expose
//        private String name;
//        @SerializedName("shortName")
//        @Expose
//        private String shortName;
//
//        public Boolean getIsBatting() {
//            return isBatting;
//        }
//
//        public void setIsBatting(Boolean isBatting) {
//            this.isBatting = isBatting;
//        }
//
//        public Integer getId() {
//            return id;
//        }
//
//        public void setId(Integer id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getShortName() {
//            return shortName;
//        }
//
//        public void setShortName(String shortName) {
//            this.shortName = shortName;
//        }
//    }
//
//    public class Scores {
//
//        @SerializedName("homeScore")
//        @Expose
//        private String homeScore;
//        @SerializedName("homeOvers")
//        @Expose
//        private String homeOvers;
//        @SerializedName("awayScore")
//        @Expose
//        private String awayScore;
//        @SerializedName("awayOvers")
//        @Expose
//        private String awayOvers;
//
//        public String getHomeScore() {
//            return homeScore;
//        }
//
//        public void setHomeScore(String homeScore) {
//            this.homeScore = homeScore;
//        }
//
//        public String getHomeOvers() {
//            return homeOvers;
//        }
//
//        public void setHomeOvers(String homeOvers) {
//            this.homeOvers = homeOvers;
//        }
//
//        public String getAwayScore() {
//            return awayScore;
//        }
//
//        public void setAwayScore(String awayScore) {
//            this.awayScore = awayScore;
//        }
//
//        public String getAwayOvers() {
//            return awayOvers;
//        }
//
//        public void setAwayOvers(String awayOvers) {
//            this.awayOvers = awayOvers;
//        }
//
//    }

}

