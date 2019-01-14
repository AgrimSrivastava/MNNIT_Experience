package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Rasayan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rasayan);
    }

    public void R1(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","R1");
        startActivity(i);
    }

    public void R2(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","R2");
        startActivity(i);
    }

    public void R3(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","R3");
        startActivity(i);
    }

    public void R4(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","R4");
        startActivity(i);
    }

    public void R5(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","R5");
        startActivity(i);
    }

    public void R6(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","R6");
        startActivity(i);
    }

    public void R7(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","R7");
        startActivity(i);
    }

    public void R8(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","R8");
        startActivity(i);
    }

}
