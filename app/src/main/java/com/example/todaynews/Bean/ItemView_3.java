package com.example.todaynews.Bean;

public class ItemView_3{
    private String title;
    private int imageId;
    private String source;
    private String remarks;
    private String time;

    public ItemView_3(String title,int imageId,String source,String remarks,String time){
        this.title=title;
        this.imageId=imageId;
        this.source=source;
        this.remarks=remarks;
        this.time=time;
    }

    public String getTitle(){
        return title;
    }

    public int getImageId(){
        return imageId;
    }

    public String getSource() {
        return source;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getTime() {
        return time;
    }
}
