package com.flag.activities.activities_flag;

import android.content.Intent;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {
    SharedPreferences sPref = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    /*    public void to4Activity(View view){
            Intent intent = new Intent(this, Activity4.class);
            startActivity(intent);
        }
      */
    public void to4Activity(View view) {
        startActivity(new Intent(this, Activity4.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
        SharedPreferences activityPreferences = getSharedPreferences(Activity0.comparison, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = activityPreferences.edit();
        editor.putBoolean(Activity0.workflowDone, true);
        editor.apply();
    }

}