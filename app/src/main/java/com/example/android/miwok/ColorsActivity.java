package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colorsList = new ArrayList<>();

        colorsList.add(new Word("Red", "Rojo"));
        colorsList.add(new Word("Blue", "Azul"));
        colorsList.add(new Word("Green", "Verde"));
        colorsList.add(new Word("Yellow", "Amarillo"));
        colorsList.add(new Word("Purple", "Morado"));
        colorsList.add(new Word("White", "Blanco"));
        colorsList.add(new Word("Black", "Negro"));
        colorsList.add(new Word("Orange", "Naranja"));
        colorsList.add(new Word("Pink", "Rosa"));
        colorsList.add(new Word("Brown", "Cafe"));

        WordAdapter wordAdapter = new WordAdapter(this, colorsList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
