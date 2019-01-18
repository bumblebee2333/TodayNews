package com.example.todaynews.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.todaynews.R;

public class FourthViewHolder extends RecyclerView.ViewHolder{
    public TextView title;
    public ImageView imageView_1;
    public ImageView imageView_2;
    public ImageView imageView_3;
    public TextView source;
    public TextView remarks;
    public TextView time;

    public FourthViewHolder(@NonNull View itemView) {
        super(itemView);

        this.title=itemView.findViewById(R.id.title_4);
        this.imageView_1=itemView.findViewById(R.id.image_1);
        this.imageView_2=itemView.findViewById(R.id.image_2);
        this.imageView_3=itemView.findViewById(R.id.image_3);
        this.source=itemView.findViewById(R.id.source_4);
        this.remarks=itemView.findViewById(R.id.remark_4);
        this.time=itemView.findViewById(R.id.time_4);
    }
}
