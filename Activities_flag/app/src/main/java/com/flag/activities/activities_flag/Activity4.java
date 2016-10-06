package com.flag.activities.activities_flag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }
    public void to4Activity(View view){
        Intent intent = new Intent(this, Activity0.class);
        startActivity(intent);
    }
}
