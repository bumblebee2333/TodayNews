package com.example.todaynews;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.example.todaynews.Adapter.MyAdafpter;
import com.example.todaynews.Bean.RecycleViewItemData;
import com.example.todaynews.DataAnalysis.GsonWork;
import com.example.todaynews.InternetResquest.HttpUtils;
import com.example.todaynews.Json.SocietyData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    //List<RecycleViewItemData> dataList = new ArrayList<>();
    private List<SocietyData.DataBean> mDataList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdafpter myAdafpter;
    private Context context;
    final String url="http://api01.idataapi.cn:8000/news/toutiao?catid=news_society&apikey" +
            "=WdQFcZxyfnRMXI0pXqpjfHBjQK1LIhDWgshvcABrsOXrpzUCkTYu1aSbMem6PjwW";
    private SwipeRefreshLayout swipeRefreshLayout;
    private Handler handler;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }

        swipeRefreshLayout=findViewById(R.id.swipelayout);
        recyclerView=findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(MainActivity.this));

        recyclerView.addItemDecoration(
                new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL));

        handler=new MyHandler();
        swipeRefreshLayout.setRefreshing(true);
        Thread thread=new UiThread();
        thread.start();
        //swipeRefreshLayout.setRefreshing(false);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
                Thread t=new UiThread();
                t.start();
            }
        });
    }
    class MyHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            String responseText=(String)msg.obj;
            mDataList.addAll(GsonWork.parseJSONWithGSON(responseText));
            if(mDataList!=null){
                myAdafpter=new MyAdafpter(MainActivity.this,mDataList);
                recyclerView.setAdapter(myAdafpter);
                myAdafpter.notifyDataSetChanged();
                recyclerView.smoothScrollToPosition(0);
                swipeRefreshLayout.setRefreshing(false);
            }
        }
    }

    class UiThread extends Thread{
        @Override
        public void run() {
            String responseText=HttpUtils.doGet(url);
            Log.e("LXY",responseText);
            Message msg=handler.obtainMessage();
            msg.obj=responseText;
            handler.sendMessage(msg);
        }
    }
}




