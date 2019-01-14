package com.myapp.theagrim.agrimaapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyviewHolder> {
    private List<String> list;

    public RecyclerAdapter(List<String> list)
    {
        this.list=list;
    }
    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        TextView textView=(TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_faculty, parent, false);
        MyviewHolder myviewHolder=new MyviewHolder(textView);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder viewHolder, int i) {
        viewHolder.faculty_name.setText(list.get(i));

    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }
        public static class MyviewHolder extends RecyclerView.ViewHolder
        {
            TextView faculty_name;

            public MyviewHolder(@NonNull TextView itemView) {
                super(itemView);
                faculty_name=itemView;
            }
        }
        public void updateList(List<String> newList)
        {
            list=new ArrayList<>();
            list.addAll(newList);
            notifyDataSetChanged();

        }
}
