package com.sports.crickethouse.ui.teams;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.sports.crickethouse.R;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {

    List<TeamContent> mData;
    Context context;

    public TeamAdapter(List<TeamContent> mData) {
        this.mData = mData;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.team_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.img.setImageResource(mData.get(position).getImage());
        holder.text1.setText(mData.get(position).getName());
//        holder.text2.setText(mData.get(position).getDescription());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView text1;
//        public LinearLayout subLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.teamImage);
            text1 = itemView.findViewById(R.id.teamName);
//            text2 = itemView.findViewById(R.id.tt2);
//            subLayout = itemView.findViewById(R.id.subLayout);
        }
    }



}
