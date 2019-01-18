package com.example.todaynews.ViewHolder;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.todaynews.R;

public class FirstViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView source;
    public TextView remarks;
    public TextView time;


    public FirstViewHolder(View itemView) {
        super(itemView);

        this.title=itemView.findViewById(R.id.title_1);
        this.source=itemView.findViewById(R.id.source_1);
        this.remarks=itemView.findViewById(R.id.remark_1);
        this.time=itemView.findViewById(R.id.time_1);
    }

    public  void  setData(){

    }
}
