package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class  Mechro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechro);
    }

    public void M1(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","M1");
        startActivity(i);
    }

    public void M2(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","M2");
        startActivity(i);
    }

    public void M3(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","M4");
        startActivity(i);
    }

    public void M4(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","M4");
        startActivity(i);
    }

    public void M5(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","M5");
        startActivity(i);
    }

    public void M6(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","M6");
        startActivity(i);
    }

    public void M7(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","M7");
        startActivity(i);
    }

    public void M8(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","M8");
        startActivity(i);
    }



}
