package com.flag.activities.activities_flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.Context;



public class Activity0 extends AppCompatActivity {

    public static final String APP_PREFERENCES = "settings";
    public static final String APP_PREFERENCES_IS_WORKFLOW_PASSED = "isWorkflowPassed";
    private boolean isWorkflowPassed;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sp = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        isWorkflowPassed = sp.getBoolean(APP_PREFERENCES_IS_WORKFLOW_PASSED, false);
        start();
    }

    private void start (){
        Intent intent;
        if (!isWorkflowPassed) {
            intent = new Intent(this, Activity1.class);
        } else {
            intent = new Intent(this, Activity4.class);
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }
}
