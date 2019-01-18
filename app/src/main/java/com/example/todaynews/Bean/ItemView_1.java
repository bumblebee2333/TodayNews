package com.example.todaynews.Bean;

public class ItemView_1{
    private String title;
    private String soure;
    private String remarks;
    private String time;

    public ItemView_1(String title,String soure,String remarks,String time){
        this.title=title;
        this.soure=soure;
        this.remarks=remarks;
        this.time=time;
    }

    public String getTitle(){
        return title;
    }

    public String getSoure(){
        return soure;
    }

    public String getRemarks(){
        return remarks;
    }

    public String getTime(){
        return time;
    }
}
