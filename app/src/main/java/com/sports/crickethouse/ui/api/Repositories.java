package com.sports.crickethouse.ui.api;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.MutableLiveData;

import com.sports.crickethouse.ui.Model.GamesModel;
import com.sports.crickethouse.ui.Model.MatchListModel;
import com.sports.crickethouse.ui.Model.SeriesListModel;
import com.sports.crickethouse.ui.Model.SeriesModel;
import com.sports.crickethouse.ui.Model.SeriesTeamModel;
import com.sports.crickethouse.ui.Model.StandingsModel;
import com.sports.crickethouse.ui.Model.TeamsListModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class Repositories {
    private static Repositories instance;
    private MyApi cricketApi;
    public Context context;

    public static Repositories getInstance(Context context){
        if(instance == null){
            instance = new Repositories(context);
        }
        return instance;
    }

    public Repositories(Context context) {
        this.context = context;
        this.cricketApi = RetrofitService.retrofitService(MyApi.class);
    }

    public MutableLiveData<List<SeriesListModel>> getSeries(){
        final MutableLiveData<List<SeriesListModel>> data = new MutableLiveData<>();
        cricketApi.getSeries().enqueue(new Callback<SeriesModel>() {
            @Override
            public void onResponse(Call<SeriesModel> call, retrofit2.Response<SeriesModel> response) {
                List<SeriesListModel> series = new ArrayList<>();
                try{
                    series = response.body().getSeriesList().getSeries();
                }catch (Exception e){
                    Toast.makeText(context, "No Series Available", Toast.LENGTH_SHORT).show();
                }finally {
                     data.setValue(series);
                }
            }
            @Override
            public void onFailure(Call<SeriesModel> call, Throwable t) {
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + t.getMessage());
            }
        });
        return data;
    }

    public MutableLiveData<List<TeamsListModel>> getTeams(){
        final MutableLiveData<List<TeamsListModel>> data = new MutableLiveData<>();
        cricketApi.getTeams(Presets.seriesId).enqueue(new Callback<SeriesTeamModel>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<SeriesTeamModel> call, retrofit2.Response<SeriesTeamModel> response) {
                List<TeamsListModel> teamsList = new ArrayList<>();
                try{
                    teamsList = response.body().getSeriesTeams().getTeams();
                }catch (Exception e){
                    Toast.makeText(context, "No Teams Available", Toast.LENGTH_SHORT).show();
                }finally {
                    data.setValue(teamsList);
                }
            }
            @Override
            public void onFailure(Call<SeriesTeamModel> call, Throwable t) {
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + t.getMessage());
            }
        });
        return data;
    }

    public MutableLiveData<List<MatchListModel>> getSeriesGames(String id){
        final MutableLiveData<List<MatchListModel>> data = new MutableLiveData<>();
        cricketApi.getSeriesGames(id).enqueue(new Callback<GamesModel>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<GamesModel> call, retrofit2.Response<GamesModel> response) {
                List<MatchListModel> list;
                List<MatchListModel> filteredList = new ArrayList<>();
                try{
                    list = response.body().getMatchList().getMatches();
                    for(int i = 0; i < list.size(); i++){
                        if(list.get(i).getStatus().equalsIgnoreCase("LIVE")){
                            filteredList.add(list.get(i));
                        }
                    }
                    for(int i = 0; i < list.size(); i++){
                        if(list.get(i).getStatus().equalsIgnoreCase("COMPLETED")){
                            filteredList.add(list.get(i));
                        }
                    }
                }catch (Exception e){
                    Toast.makeText(context, "No Matches Available", Toast.LENGTH_SHORT).show();
                }finally {
                    data.setValue(filteredList);
                }
            }
            @Override
            public void onFailure(Call<GamesModel> call, Throwable t) {
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + t.getMessage());
            }
        });
        return data;
    }

    public  MutableLiveData<List<MatchListModel>> getFilteredUpcoming() {
        final MutableLiveData<List<MatchListModel>> data = new MutableLiveData<>();
        cricketApi.getSeriesGames(Presets.seriesId).enqueue(new Callback<GamesModel>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<GamesModel> call, retrofit2.Response<GamesModel> response) {
                List<MatchListModel> list;
                List<MatchListModel> filteredList = new ArrayList<>();
                try{
                    list = response.body().getMatchList().getMatches();
                    for(int i = 0; i < list.size(); i++){
                        if(list.get(i).getStatus().equalsIgnoreCase("UPCOMING") && !list.get(i).getHomeTeam().getName().equalsIgnoreCase("unknown")){
                            filteredList.add(list.get(i));
                        }
                    }
                }catch (Exception e){
                    Toast.makeText(context, "No Upcoming Matches Available", Toast.LENGTH_SHORT).show();
                }finally {
                    data.setValue(filteredList);
                }
            }
            @Override
            public void onFailure(Call<GamesModel> call, Throwable t) {
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + t.getMessage());
            }
        });
        return data;
    }



//
//    public MutableLiveData<List<StandingsModel>> getTeamStandings(){
//        MutableLiveData<List<StandingsModel>> data = new MutableLiveData<>();
//
//        MyApi.getStandings(Presets.seriesId).enqueue(new Callback<StandingsModel>() {
//            @RequiresApi(api = Build.VERSION_CODES.N)
//            @Override
//            public void onResponse(Call<StandingsModel> call, retrofit2.Response<StandingsModel> response) {
//                List<StandingsModel> teamStanding = new ArrayList<>();
//                try{
//                    teamStanding = response.body().getTeams();
//                }catch (Exception e){
//                    Toast.makeText(context, "No Standing Available", Toast.LENGTH_SHORT).show();
//                }finally {
//                    data.setValue(teamStanding);
//                }
//            }
//            @Override
//            public void onFailure(Call<StandingsModel> call, Throwable t) {
//                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + t.getMessage());
//            }
//        });
//        return data;
//    }

    }


