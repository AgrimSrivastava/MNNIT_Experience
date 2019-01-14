package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Eleectromania extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleectromania);
    }

    public void E1(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","E1");
        startActivity(i);
    }

    public void E2(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","E2");
        startActivity(i);
    }

    public void E3(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","E3");
        startActivity(i);
    }

    public void E4(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","E4");
        startActivity(i);
    }

    public void E5(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","E5");
        startActivity(i);
    }

    public void E6(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","E6");
        startActivity(i);
    }

    public void E7(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","E7");
        startActivity(i);
    }

    public void E8(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","E8");
        startActivity(i);
    }

}
