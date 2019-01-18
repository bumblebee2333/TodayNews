package com.example.todaynews.Bean;

public class ItemView_4{
    private String title;
    private int imageId_1;
    private int imageId_2;
    private int imageId_3;
    private String source;
    private String remarks;
    private String time;

    public ItemView_4(String title,int imageId_1,int imageId_2,int imageId_3,
                      String source,String remarks,String time){
        this.title=title;
        this.imageId_1=imageId_1;
        this.imageId_2=imageId_2;
        this.imageId_3=imageId_3;
        this.source=source;
        this.remarks=remarks;
        this.time=time;
    }

    public String getTitle() {
        return title;
    }

    public void setImageId_1(int imageId_1) {
        this.imageId_1 = imageId_1;
    }

    public void setImageId_2(int imageId_2) {
        this.imageId_2 = imageId_2;
    }

    public int getImageId_3() {
        return imageId_3;
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
