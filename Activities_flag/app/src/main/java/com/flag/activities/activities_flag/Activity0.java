package com.flag.activities.activities_flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;


public class Activity0 extends AppCompatActivity {

    SharedPreferences sPref = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sPref = getSharedPreferences("lispr.activitye", MODE_PRIVATE);

        if(sPref.getBoolean("started", true)){
            Intent intent = new Intent(this, Activity1.class);
            startActivity(intent);
            finish();
        }
        else
        {
            Intent intent = new Intent(this, Activity4.class);
            startActivity(intent);
            finish();
        }
    }
}
