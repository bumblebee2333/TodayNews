package com.example.todaynews.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.todaynews.R;

public class SecondViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public ImageView image;
    public TextView source;
    public TextView remarks;
    public TextView time;


    public SecondViewHolder(@NonNull View itemView) {
        super(itemView);

        this.title=itemView.findViewById(R.id.title_2);
        this.image=itemView.findViewById(R.id.cover_2);
        this.source=itemView.findViewById(R.id.source_2);
        this.remarks=itemView.findViewById(R.id.remark_2);
        this.time=itemView.findViewById(R.id.time_2);
    }
}
