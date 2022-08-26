package com.bashirli.cityphotoviewer;

public class Singleton {
    private static Singleton singleton;
    private Data data;

    private Singleton(){

    }
public void setData(Data data){
        this.data=data;
}
public Data getData(){
        return data;
}
public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
}


}
