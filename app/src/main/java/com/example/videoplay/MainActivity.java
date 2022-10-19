package com.example.videoplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toAudioPage(View view) {
        Intent i1 = new Intent(MainActivity.this,AudioActivity.class);
        startActivity(i1);
    }


    public void toVideoPage(View view) {
        Intent i1 = new Intent(MainActivity.this,VideoActivity.class);
        startActivity(i1);
    }
}