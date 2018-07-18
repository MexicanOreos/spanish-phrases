package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyMembersList = new ArrayList<>();

        familyMembersList.add(new Word("Father", "Padre"));
        familyMembersList.add(new Word("Mother", "Madre"));
        familyMembersList.add(new Word("Son", "Hijo"));
        familyMembersList.add(new Word("Daughter", "Hija"));
        familyMembersList.add(new Word("Brother", "Hermano"));
        familyMembersList.add(new Word("Sister", "Hermana"));
        familyMembersList.add(new Word("Uncle", "Tio"));
        familyMembersList.add(new Word("Aunt", "Tia"));
        familyMembersList.add(new Word("Grandfather", "Abuelo"));
        familyMembersList.add(new Word("Grandmother", "Abuela"));

        WordAdapter wordAdapter = new WordAdapter(this, familyMembersList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
