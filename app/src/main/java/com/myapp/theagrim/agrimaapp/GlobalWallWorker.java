package com.myapp.theagrim.agrimaapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class GlobalWallWorker extends ArrayAdapter<String> {

    Activity context;
    List<String> notificationList;
    
    public GlobalWallWorker(Activity context, List<String> notificationList){
        super(context,R.layout.custom_layout);
        this.context=context;
        this.notificationList=notificationList;
    }
    
    public View getView(int position, View counterView, ViewGroup parent){

        LayoutInflater inflater= context.getLayoutInflater();
        View itemList= inflater.inflate(R.layout.activity_global_wall,null,true);
        TextView message= itemList.findViewById(R.id.textView12);
         String str= notificationList.get(position);
         message.setText(str);

        return itemList;
    }
   
}