package com.sports.crickethouse.ui.schedule;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.islamkhsh.CardSliderAdapter;
import com.github.islamkhsh.CardSliderViewPager;
import com.sports.crickethouse.R;
import com.sports.crickethouse.ui.Model.SeriesListModel;

import java.util.ArrayList;
import java.util.List;

public class ScheduleFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private ScheduleViewModel notificationsViewModel;

//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        notificationsViewModel =
//                ViewModelProviders.of(this).get(ScheduleViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
////        final TextView textView = root.findViewById(R.id.text_notifications);
////        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
////            @Override
////            public void onChanged(@Nullable String s) {
////                textView.setText(s);
////            }
////        });
//        return root;
//    }

    public ScheduleFragment() {

    }

    public static ScheduleFragment newInstance(String param1, String param2) {
        ScheduleFragment fragment = new ScheduleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private CardSliderViewPager recyclerView;
    private ScheduleViewModel seriesViewModel;
    private ScheduleAdapter adapter;
    private RelativeLayout relativeLayout;
    List<SeriesListModel> seriesListModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        recyclerView = view.findViewById(R.id.scheduleRecycleView);
        relativeLayout = view.findViewById(R.id.relative_loading);


        seriesViewModel = ViewModelProviders.of(this).get(ScheduleViewModel.class);
        seriesViewModel.init(getContext());
//        relativeLayout.setVisibility(View.VISIBLE);


        seriesViewModel.getSeries().observe(getViewLifecycleOwner(), result -> {
            seriesListModels.addAll(result);
            adapter.notifyDataSetChanged();
            if(adapter != null){
//                relativeLayout.setVisibility(View.GONE);


            }
        });


        initRecyclerView();

        return view;
    }

    private void initRecyclerView() {
        adapter = new ScheduleAdapter(getContext(), seriesListModels);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(adapter);
    }



}