package com.flag.activities.activities_flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.Context;



public class Activity0 extends AppCompatActivity {

    public static  String comparison = "comparison";
    public static  String workflowDone = "WorkflowDone";
    private boolean WorkflowDone;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sp = getSharedPreferences(comparison, Context.MODE_PRIVATE);
        WorkflowDone = sp.getBoolean(workflowDone, false);
        start();
    }

    private void start (){
        Intent intent;
        if (!WorkflowDone) {
            intent = new Intent(this, Activity1.class);
        } else {
            intent = new Intent(this, Activity4.class);
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }
}
