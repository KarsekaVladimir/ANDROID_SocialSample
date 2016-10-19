package com.sample.social.socialsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toMusiclistActivity (View view){
        Intent intent = new Intent(this, MusiclistActivity.class);
        startActivity(intent);
    }

    public void toSplashscreen (View view){
        Intent intent = new Intent(this, Splashscreen.class);
        startActivity(intent);
    }
}
