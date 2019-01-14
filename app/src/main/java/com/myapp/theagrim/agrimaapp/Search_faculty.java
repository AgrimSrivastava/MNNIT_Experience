package com.myapp.theagrim.agrimaapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search_faculty extends AppCompatActivity
        implements SearchView.OnQueryTextListener {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> list=new ArrayList<>();
    private RecyclerAdapter adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_faculty);
        toolbar =(Toolbar)findViewById(R.id.toolbar_faculty);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        list= Arrays.asList(getResources().getStringArray(R.array.faculty));
        adapter= new RecyclerAdapter(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        MenuItem menuItem=menu.findItem(R.id.action_search);
        SearchView searchView=(SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String userInput=newText.toLowerCase();
        List<String> newList= new ArrayList<>();

        for(String name:list)
        {
           if(name.toLowerCase().contains(userInput))
           {
               newList.add(name);
           }
        }
        adapter.updateList(newList);
        return true;
    }
}
