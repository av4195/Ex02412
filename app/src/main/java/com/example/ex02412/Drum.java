package com.example.ex02412;

import android.widget.TextView;

import org.w3c.dom.Text;

public class Drum implements Playble{
    private int numOfDrums;
    TextView tv;

    public Drum(int numOfDrums){
        this.numOfDrums  = numOfDrums;
    }

    public int getNumOfDrums(){
        return this.numOfDrums;
    }

    public void setNumOfDrums(int numOfDrums) {
        this.numOfDrums = numOfDrums;
    }

    public void Play(){
        tv.setText("the drum is playing");
    }
}
