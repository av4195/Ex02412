package com.example.ex02412;

import android.widget.TextView;

public class Piano implements Playble{
    private String pianoType;
    TextView tv;

    public Piano(String pianoType){
        this.pianoType = pianoType;
    }

    public String getPianoType(){
        return this.pianoType;
    }

    public void setPianoType(String pianoType){
        this.pianoType = pianoType;
    }

    public void Play(){
        tv.setText("the piano is playing");
    }

}
