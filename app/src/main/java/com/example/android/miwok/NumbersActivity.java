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

        ArrayList<String> numbersList = new ArrayList<>();

        LinkedHashMap<String, String> numbersMap = new LinkedHashMap<>();

        numbersList.add("One");
        numbersList.add("Two");
        numbersList.add("Three");
        numbersList.add("Four");
        numbersList.add("Five");
        numbersList.add("Six");
        numbersList.add("Seven");
        numbersList.add("Eight");
        numbersList.add("Nine");
        numbersList.add("Ten");

//        //We store the LinearLayout to be able to reference it and add child text views
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        for(Map.Entry numbers : numbersMap.entrySet()) {
//            TextView wordView = new TextView(this); //Create a new wordview
//            wordView.setText((String) numbers.getKey()); //set it's text
//            rootView.addView(wordView); // add it to layout
//        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, numbersList);
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(arrayAdapter);
        GridView gridView = (GridView) findViewById(R.id.list);
        int testVar = 0; //Delete this after
        gridView.setAdapter(arrayAdapter);
        //Testing stuff for git






    }


}
