package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrasesList = new ArrayList<>();

        phrasesList.add(new Word("Thanks so much", "Muchas gracias"));
        phrasesList.add(new Word("Excuse me", "Con permiso"));
        phrasesList.add(new Word("I'm sorry", "Perdoname"));
        phrasesList.add(new Word("My name is <name>", "Me llamo <name>"));
        phrasesList.add(new Word("How are you", "Como estas"));
        phrasesList.add(new Word("Good morning/afternoon/night", "Buenos dias/tardes/noches"));
        phrasesList.add(new Word("See you later", "Hasta luego"));
        phrasesList.add(new Word("Thank you", "Gracias"));
        phrasesList.add(new Word("Please", "Por favor"));
        phrasesList.add(new Word("Where is the bathroom", "Donde esta el baño"));

        WordAdapter wordAdapter = new WordAdapter(this, phrasesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
