package com.example.ex02412;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
    }

    public static void main(String[] args) {
        Guitar guitar1 = new Guitar("brown");
        Piano piano1 = new Piano("Grand Piano");
        Drum drum1 = new Drum(3);

        Playble[] playbles = new Playble[3];
        playbles[0] = guitar1;
        playbles[1] = piano1;
        playbles[2] = drum1;

        for (int i = 0; i < 3; i++) {
            playbles[i].Play();
        }
    }
}