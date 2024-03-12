package com.devdroid.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "A", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "B", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "C", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "D", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "E", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "F", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "G", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "H", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "I", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "J", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "K", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "L", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "M", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "N", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "O", "9412993590"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background , "P", "9412993590"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}