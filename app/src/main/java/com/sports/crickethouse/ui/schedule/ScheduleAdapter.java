package com.sports.crickethouse.ui.schedule;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.github.islamkhsh.CardSliderAdapter;
import com.sports.crickethouse.R;
import com.sports.crickethouse.ui.Model.SeriesListModel;
import com.sports.crickethouse.ui.api.Presets;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ScheduleAdapter extends CardSliderAdapter<ScheduleAdapter.SeriesViewHolder> {

    Context context;
    List<SeriesListModel> seriesList;
    SeriesListModel series;

    public ScheduleAdapter(ScheduleFragment scheduleFragment) {

    }

    @Override
    public void bindVH(SeriesViewHolder holder, int position) {
        series = seriesList.get(position);
        holder.seriesName.setText(series.getName());
        holder.seriesStatus.setText("Status: "+series.getStatus());
        if(series.getStatus().toLowerCase().equals("upcoming")){
            holder.seriesStatus.setTextColor(Color.RED);
        }
        else if (series.getStatus().toLowerCase().equals("completed")){
            holder.seriesStatus.setTextColor(Color.GREEN);
        }
        else if (series.getStatus().toLowerCase().equals("inprogress")){
            holder.seriesStatus.setTextColor(Color.MAGENTA);
        }
        else{
            holder.seriesStatus.setTextColor(Color.BLACK);
        }


        holder.start.setText("Start Date: "+series.getStartDateTime());
        holder.end.setText("End Date: "+series.getEndDateTime());
        Picasso.get().load(series.getShieldImageUrl()).into(holder.seriesBadge);
//        holder.itemView.setOnClickListener((View v)->{
////            changeSeries(position);
//        });
    }


    public class SeriesViewHolder extends RecyclerView.ViewHolder {
        TextView seriesName, seriesStatus,start,end;
        ImageView seriesBadge;
        public SeriesViewHolder(@NonNull View itemView) {
            super(itemView);
            seriesName = itemView.findViewById(R.id.titlename);
            seriesStatus = itemView.findViewById(R.id.progress);
            start = itemView.findViewById(R.id.timestart);
            end = itemView.findViewById(R.id.timeend);
            seriesBadge = itemView.findViewById(R.id.seriesimage);

        }
    }

    public ScheduleAdapter(Context context, List<SeriesListModel> seriesList){
        this.context = context;
        this.seriesList = seriesList;
    }

    @NonNull
    @Override
    public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_layout, parent, false);
        return new SeriesViewHolder(view);
    }



    @Override
    public int getItemCount() {
        return seriesList.size();
    }

//    public void successMessage(){
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this.context);
//        alertDialog.setCancelable(false);
//        alertDialog.setMessage("Changes Applied!");
//        alertDialog.setPositiveButton("OK", (dialog,which) -> {
//            dialog.dismiss();
//        });
//        AlertDialog alert = alertDialog.create();
//        alert.show();
//    }
//
//    public void changeSeries(int id){
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this.context);
//        alertDialog.setCancelable(false);
//        alertDialog.setMessage("Do you want to change the series to \n\"" + seriesList.get(id).getName() + "\"");
//        alertDialog.setPositiveButton("Yes",(dialog,which) -> {
//            Presets.seriesId = String.valueOf(seriesList.get(id).getId());
//            dialog.dismiss();
//            successMessage();
//        });
//        alertDialog.setNegativeButton("No", (dialog,which) -> {
//            dialog.dismiss();
//        });
//        AlertDialog alert = alertDialog.create();
//        alert.show();
//    }



}
