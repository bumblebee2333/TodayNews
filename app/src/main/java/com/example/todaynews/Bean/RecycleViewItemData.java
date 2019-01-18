package com.example.todaynews.Bean;

public class RecycleViewItemData<T> {
    //用来装载不同的item数据
    T t;
    //item数据Bean的类型
    int dataType;
    public RecycleViewItemData(){

    }

    public RecycleViewItemData(T t,int dataType){
        this.t=t;
        this.dataType=dataType;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }
}
