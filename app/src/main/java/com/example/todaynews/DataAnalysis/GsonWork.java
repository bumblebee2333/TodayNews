package com.example.todaynews.DataAnalysis;

import com.example.todaynews.Json.SocietyData;
import com.google.gson.Gson;

import java.util.List;

public class GsonWork {
    public static List<SocietyData.DataBean> parseJSONWithGSON(String jsonData){
        SocietyData societyData=new Gson().fromJson(jsonData,SocietyData.class);
        List<SocietyData.DataBean> dataBeanList=societyData.getData();
        return dataBeanList;
    }
}
