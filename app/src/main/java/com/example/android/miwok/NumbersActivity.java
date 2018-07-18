package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbersList = new ArrayList<>();

//        LinkedHashMap<String, String> numbersMap = new LinkedHashMap<>();

        numbersList.add(new Word("One", "Uno"));
        numbersList.add(new Word("Two", "Dos"));
        numbersList.add(new Word("Three", "Tres"));
        numbersList.add(new Word("Four", "Cuatro"));
        numbersList.add(new Word("Five", "Cinco"));
        numbersList.add(new Word("Six", "Sies"));
        numbersList.add(new Word("Seven", "Siete"));
        numbersList.add(new Word("Eight", "Ocho"));
        numbersList.add(new Word("Nine", "Nueve"));
        numbersList.add(new Word("Ten", "Diez"));

//        //We store the LinearLayout to be able to reference it and add child text views
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        for(Map.Entry numbers : numbersMap.entrySet()) {
//            TextView wordView = new TextView(this); //Create a new wordview
//            wordView.setText((String) numbers.getKey()); //set it's text
//            rootView.addView(wordView); // add it to layout
//        }

        WordAdapter wordAdapter = new WordAdapter(this, numbersList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);






    }


}
