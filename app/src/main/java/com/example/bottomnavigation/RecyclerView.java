package com.example.bottomnavigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity implements MainView{
    android.support.v7.widget.RecyclerView rv;
    AdapterClass adapter;
    DataClass data;
    List<ModelClass> model = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.recyclerview);

        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterClass(this, model);
        rv.setAdapter(adapter);
        data = new DataClass(this, this);
        data.setData();
    }

    public void onSuccess(List<ModelClass> model) {
        this.model.clear();
        this.model.addAll(model);
        this.adapter.notifyDataSetChanged();
    }
}
