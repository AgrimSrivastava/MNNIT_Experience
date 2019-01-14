package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Kreedomania extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kreedomania);
    }

    public void K1(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","K1");
        startActivity(i);
    }

    public void K2(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","K2");
        startActivity(i);
    }

    public void K3(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","K4");
        startActivity(i);
    }

    public void K4(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","K4");
        startActivity(i);
    }

    public void K5(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","K5");
        startActivity(i);
    }

    public void K6(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","K6");
        startActivity(i);
    }

    public void K7(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","K7");
        startActivity(i);
    }

    public void K8(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","K8");
        startActivity(i);
    }



}
