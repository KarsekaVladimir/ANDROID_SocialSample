package com.flag.activities.activities_flag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void to3Activity (View view){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}
