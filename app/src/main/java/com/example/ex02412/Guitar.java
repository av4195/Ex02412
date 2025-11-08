package com.example.ex02412;

import android.widget.TextView;

public class Guitar implements Playble{
    TextView tv;

    private String guitarColor;

    public Guitar(String guitarColor){
        this.guitarColor = guitarColor;
    }

    public String getGuitarColor(){
        return this.guitarColor;
    }

    public void setGuitarColor(String guitarColor){
        this.guitarColor = guitarColor;
    }

    public void Play(){
        tv.setText("The guitar is playing");

    }
}
