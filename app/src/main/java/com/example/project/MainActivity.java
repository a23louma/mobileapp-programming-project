package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private RecyclerViewAdapter adapter;
    private Gson gson;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a23louma";
    private ArrayList<RecyclerViewItem> items;
    private Button aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        gson = new Gson();
        new JsonTask(this).execute(JSON_URL);

        aboutButton = findViewById(R.id.openSecondActivityButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        items = new ArrayList<>(Arrays.asList(new RecyclerViewItem("Fisk1"),new RecyclerViewItem("Fisk2"), new RecyclerViewItem("Fisk3")));

        Log.d("Fisk URL begin", "" + items.size());
        Log.d("Fisk URL done", "" + items.size());

        adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                Log.d("Klickat", "fisk");
            }
        });

        Log.d("Fisk Adapter", "" + items.size());
        RecyclerView view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);
        Log.d("Fisk Adapter done", "" + items.size());

    }

    @Override
    public void onPostExecute(String json) {
        Log.d("Fisk MainActivity", json);
        Type type = new TypeToken<ArrayList<RecyclerViewItem>>() {}.getType();
        items = gson.fromJson(json, type);
        for(RecyclerViewItem r : items) {
            Log.d("Fisk_items onPE", r.getTitle() + "");
        }
        adapter.updateData(items);
        Log.d("Fisk items", "" + items.size());
    }
}