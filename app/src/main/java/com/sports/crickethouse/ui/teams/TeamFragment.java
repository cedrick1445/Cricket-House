package com.sports.crickethouse.ui.teams;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sports.crickethouse.R;
import com.sports.crickethouse.ui.home.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class TeamFragment extends Fragment {

    private TeamViewModel teamViewModel;
    TeamAdapter teamAdapter;
    public static RecyclerView recyclerViewTeam;
    String[] name = {"Delhi Capitals", "Kings XI Punjab", "Kolkata Knight Riders", "Mumbai Indians", "Rajasthan Royals", "Royal Challengers", "Sunrisers Hyderabad", "Chennai Super Kings"};
    Integer[] image = {R.drawable.delhi_capital_logo, R.drawable.team_kings_xi_punjab_logo,R.drawable.team_kolkata_knight_riders_logo, R.drawable.team_mumbai_indians_logo, R.drawable.team_rajasthan_royals_logo, R.drawable.team_royal_challengers_bangalore_logo, R.drawable.team_sunrisers_hyderabad_logo, R.drawable.team_chennai_super_kings_logo};
    View root;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        teamViewModel = ViewModelProviders.of(this).get(TeamViewModel.class);
        root = inflater.inflate(R.layout.fragment_team, container, false);

        initialize();







//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

    private void initialize() {
        List<TeamContent> name1 = new ArrayList<>();
        for(int i = 0; i < name.length; i ++ ){
            name1.add(new TeamContent(name[i],image[i]));
        }


        recyclerViewTeam = root.findViewById(R.id.teamRecycleView);
        recyclerViewTeam.setLayoutManager(new GridLayoutManager(getContext(), 2, LinearLayoutManager.VERTICAL, false));
        teamAdapter = new TeamAdapter(name1);
        recyclerViewTeam.setAdapter(teamAdapter);


//        recyclerViewTeam = root.findViewById(R.id.teamRecycleView);
//        recyclerViewTeam.setLayoutManager(new LinearLayoutManager(getContext()));
//        teamAdapter= new TeamAdapter(name1);
//        recyclerViewTeam.setAdapter(teamAdapter);

    }
}