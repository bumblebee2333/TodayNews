package com.example.todaynews.InternetResquest;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtils {

    public static OkHttpClient client= new OkHttpClient.Builder()
            .build();

    public HttpUtils(){ }

    public static OkHttpClient getInstance(){
        if(client==null){
            synchronized (HttpUtils.class){
                if(client==null){
                    client=new OkHttpClient();
                }
            }
        }
        return client;
    }

    //Get请求
    public static String doGet(String url){
        Request request=new Request.Builder().url(url).build();
        Call call=getInstance().newCall(request);
        String responseData= null;
        try {
            Response response=call.execute();
            responseData = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseData;
    }
}
