package com.example.todaynews.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.todaynews.R;

public class ThirdViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public ImageView imageView;
    public TextView source;
    public TextView remarks;
    public TextView time;

    public ThirdViewHolder(@NonNull View itemView) {
        super(itemView);

        this.title=itemView.findViewById(R.id.title_3);
        this.imageView=itemView.findViewById(R.id.cover_3);
        this.source=itemView.findViewById(R.id.source_3);
        this.remarks=itemView.findViewById(R.id.remark_3);
        this.time=itemView.findViewById(R.id.time_3);
    }
}
