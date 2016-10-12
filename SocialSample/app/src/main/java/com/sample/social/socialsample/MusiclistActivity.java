package com.sample.social.socialsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MusiclistActivity extends AppCompatActivity {

    String[] names = {"TheBeatles", "Elvis Presley", "The Rolling Stones", "Chuck Berry", "Jimi Hendrix", "James Brown", "Little Richard", "Aretha Franklin", "Ray Charles", "Bob Marley", "The Beach Boys", "Led Zeppelin"};
    int size = names.length;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        NumArray numb = new NumArray();
        numb.setNumArray(12);
        int n = numb.getNumArray();
        int [] numMass = new int[n];
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiclist);
        ListView MusicList = (ListView) findViewById(R.id.MusicList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, names);
        MusicList.setAdapter(adapter);
    }

    public int ret (int b){
        MusiclistActivity size= new MusiclistActivity();
        b = size.size;

        return b;
    }
}
