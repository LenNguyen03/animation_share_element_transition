package com.se.animation_share_element_transition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;

public class MusicAppRecycle extends AppCompatActivity {

    RecyclerView recyclerView;
    MusicAppRecycleAdapter adapter;
    LinkedList<Person> persons = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_app_recycle);
        recyclerView = findViewById(R.id.recycle_music_list);

        persons.add(new Person("Taylor Swift1", "Love Story", R.drawable.taylorswift));
        persons.add(new Person("The Weekend", "The Hill", R.drawable.the_weeknd));
        persons.add(new Person("Taylor Swift", "Love Story", R.drawable.taylorswift));
        persons.add(new Person("Taylor Swift", "Love Story", R.drawable.taylorswift));

        adapter = new MusicAppRecycleAdapter(persons, this, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }
}
