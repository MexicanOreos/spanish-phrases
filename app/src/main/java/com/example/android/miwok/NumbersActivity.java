package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        LinkedHashMap<String, String> numbersMap = new LinkedHashMap<>();

        numbersMap.put("One", "Uno");
        numbersMap.put("Two", "Dos");
        numbersMap.put("Three", "Tres");
        numbersMap.put("Four", "Quatro");
        numbersMap.put("Five", "Cinco");
        numbersMap.put("Six", "Sies");
        numbersMap.put("Seven", "Siete");
        numbersMap.put("Eight", "Ocho");
        numbersMap.put("Nine", "Nueve");
        numbersMap.put("Ten", "Diez");

        //We store the LinearLayout to be able to reference it and add child text views
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        for(Map.Entry numbers : numbersMap.entrySet()) {
            TextView wordView = new TextView(this); //Create a new wordview
            wordView.setText((String) numbers.getKey()); //set it's text
            rootView.addView(wordView); // add it to layout
        }




    }


}
