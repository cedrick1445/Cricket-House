package com.sports.crickethouse.ui.api;

import com.sports.crickethouse.ui.Model.GamesModel;
import com.sports.crickethouse.ui.Model.SeriesModel;
import com.sports.crickethouse.ui.Model.SeriesTeamModel;
import com.sports.crickethouse.ui.Model.StandingsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface MyApi {
    String BASE_URL = "https://dev132-cricket-live-scores-v1.p.rapidapi.com/";

    @Headers({"x-rapidapi-host: dev132-cricket-live-scores-v1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    @GET("matchseries.php")
    Call<GamesModel> getSeriesGames(@Query("seriesid") String id);

    @Headers({"x-rapidapi-host: dev132-cricket-live-scores-v1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    @GET("series.php")
    Call<SeriesModel> getSeries();

    @Headers({"x-rapidapi-host: dev132-cricket-live-scores-v1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    @GET("seriesteams.php")
    Call<SeriesTeamModel> getTeams(@Query("seriesid") String id);

    @Headers({"x-rapidapi-host: dev132-cricket-live-scores-v1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    @GET("seriesstandings.php")
    Call<StandingsModel> getStandings(@Query("seriesid") String id);


}














//
//    @Headers({"x-rapidapi-host: dev132-cricket-live-scores-v1.p.rapidapi.com",
//            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
//            "useQueryString: true"})
//    @GET("matchseries.php")
//    Call<GamesModel> getSeriesGames(@Query("seriesid") String id);
//
//    @Headers({"x-rapidapi-host: dev132-cricket-live-scores-v1.p.rapidapi.com",
//            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
//            "useQueryString: true"})
//    @GET("matches.php")
//    Call<GamesModel> getAllGames(@Query("completedlimit") String climit, @Query("inprogresslimit") String ilimit, @Query("upcomingLimit") String ulimit);
//
//    @Headers({"x-rapidapi-host: dev132-cricket-live-scores-v1.p.rapidapi.com",
//            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
//            "useQueryString: true"})
//    @GET("seriesteams.php")
//    Call<SeriesTeamModel> getTeams(@Query("seriesid") String id);
//
//    @Headers({"x-rapidapi-host: dev132-cricket-live-scores-v1.p.rapidapi.com",
//            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
//            "useQueryString: true"})
//    @GET("seriesstandings.php")
//    Call<StandingsModel> getStandings(@Query("seriesid") String id);
//
//    @Headers({"x-rapidapi-host: dev132-cricket-live-scores-v1.p.rapidapi.com",
//            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
//            "useQueryString: true"})
//    @GET("series.php")
//    Call<SeriesModel> getSeries();
//
//
//
//}
