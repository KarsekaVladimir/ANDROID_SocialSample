package com.sample.social.socialsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;

public class Main2Activity extends AppCompatActivity {
    String[] names = {"TheBeatles", "Elvis Presley", "The Rolling Stones", "Chuck Berry", "Jimi Hendrix", "James Brown", "Little Richard", "Aretha Franklin", "Ray Charles", "Bob Marley", "The Beach Boys", "Led Zeppelin"};
    int size= names.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView MusicList = (ListView) findViewById(R.id.MusicList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, names);
        MusicList.setAdapter(adapter);
    }
}
