package com.example.todaynews.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.todaynews.Bean.ItemView_1;
import com.example.todaynews.Bean.ItemView_2;
import com.example.todaynews.Bean.ItemView_3;
import com.example.todaynews.Bean.ItemView_4;
import com.example.todaynews.Bean.RecycleViewItemData;
import com.example.todaynews.Json.SocietyData;
import com.example.todaynews.R;
import com.example.todaynews.ViewHolder.FirstViewHolder;
import com.example.todaynews.ViewHolder.FourthViewHolder;
import com.example.todaynews.ViewHolder.SecondViewHolder;
import com.example.todaynews.ViewHolder.ThirdViewHolder;

import java.util.List;

public class MyAdafpter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYRE_FIRST=0;
    private static final int TYPE_SECOND=1;
    private static final int TYPE_THIRD=2;
    private static final int TYPE_FOURTH=3;
    List<SocietyData.DataBean> mDataList;
    public Context mContext;

    public MyAdafpter(Context mContext,List<SocietyData.DataBean> mDataList){
        this.mDataList=mDataList;
        this.mContext=mContext;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==TYRE_FIRST){
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
            View view=layoutInflater.inflate(R.layout.text,parent,false);
            FirstViewHolder firstViewHolder=new FirstViewHolder(view);
            return firstViewHolder;
        }
        if(viewType==TYPE_SECOND){
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
            View view=layoutInflater.inflate(R.layout.text_pictures,parent,false);
            SecondViewHolder secondViewHolder=new SecondViewHolder(view);
            return secondViewHolder;
        }
        if(viewType==TYPE_THIRD){
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
            View view=layoutInflater.inflate(R.layout.up_down,parent,false);
            ThirdViewHolder thirdViewHolder=new ThirdViewHolder(view);
            return thirdViewHolder;
        }
        if(viewType==TYPE_FOURTH){
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
            View view=layoutInflater.inflate(R.layout.up_down_three,parent,false);
            FourthViewHolder fourthViewHolder=new FourthViewHolder(view);
            return fourthViewHolder;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        if(viewHolder instanceof FirstViewHolder){
            ((FirstViewHolder) viewHolder).title.
                    setText(mDataList.get(position).getTitle());
            ((FirstViewHolder) viewHolder).source.
                    setText(mDataList.get(position).getPosterScreenName());
            ((FirstViewHolder) viewHolder).remarks.setText
                    (mDataList.get(position).getCommentCount()+"评论");
            ((FirstViewHolder) viewHolder).time.setText("刚刚");
        }
        if(viewHolder instanceof SecondViewHolder){
            ((SecondViewHolder) viewHolder).title.setText(mDataList.get(position).getTitle());
            Glide.with(mContext).load(mDataList.get(position).getImageUrls().get(0)).
                    into(((SecondViewHolder) viewHolder).image);
            ((SecondViewHolder) viewHolder).source.
                    setText(mDataList.get(position).getPosterScreenName());
            ((SecondViewHolder) viewHolder).remarks.
                    setText(mDataList.get(position).getCommentCount()+"评论");
            ((SecondViewHolder) viewHolder).time.setText("刚刚");
        }
        if(viewHolder instanceof ThirdViewHolder){
            ((ThirdViewHolder) viewHolder).title.setText(mDataList.get(position).getTitle());
            Glide.with(mContext).load(mDataList.get(position).getImageUrls().get(0)).
                    into(((ThirdViewHolder) viewHolder).imageView);
            ((ThirdViewHolder) viewHolder).source.
                    setText(mDataList.get(position).getPosterScreenName());
            ((ThirdViewHolder) viewHolder).remarks.
                    setText(mDataList.get(position).getCommentCount()+"评论");
            ((ThirdViewHolder) viewHolder).time.setText("刚刚");
        }
        if(viewHolder instanceof FourthViewHolder){
            ((FourthViewHolder) viewHolder).title.setText(mDataList.get(position).getTitle());
            ((FourthViewHolder) viewHolder).source.
                    setText(mDataList.get(position).getPosterScreenName());
             ((FourthViewHolder) viewHolder).remarks.
                      setText(mDataList.get(position).getCommentCount()+"评论");
            ((FourthViewHolder) viewHolder).time.setText("刚刚");
            Glide.with(mContext).load(mDataList.get(position).
                    getImageUrls().get(1)).into(((FourthViewHolder) viewHolder).imageView_1);
            Glide.with(mContext).load(mDataList.get(position).getImageUrls().get(2)).
                    into(((FourthViewHolder) viewHolder).imageView_2);
            Glide.with(mContext).load(mDataList.get(position).getImageUrls().get(3)).
                    into(((FourthViewHolder) viewHolder).imageView_3);
        }
    }

    public int getItemViewType(int position){
        if(mDataList.get(position).getImageUrls()==null){
            return TYRE_FIRST;
        }
        else if(mDataList.get(position).getImageUrls().size()==1){
            return TYPE_SECOND;
        }
        else if(mDataList.get(position).getImageUrls().size()==2){
            return TYPE_THIRD;
        }
        else if(mDataList.get(position).getImageUrls().size()>3){
            return TYPE_FOURTH;
        }
        return 0;
    }

    @Override
    public int getItemCount() {
        if(mDataList!=null){
            return mDataList.size();
        }else{
            return 0;
        }
    }
}
