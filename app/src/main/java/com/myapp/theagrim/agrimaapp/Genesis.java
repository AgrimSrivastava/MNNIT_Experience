package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Genesis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genesis);
    }

    public void G1(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","G1");
        startActivity(i);
    }

    public void G2(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","G2");
        startActivity(i);
    }

    public void G3(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","G3");
        startActivity(i);
    }

    public void G4(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","G4");
        startActivity(i);
    }

    public void G5(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","G5");
        startActivity(i);
    }

    public void G6(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","G6");
        startActivity(i);
    }

    public void G7(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","G7");
        startActivity(i);
    }

    public void G8(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","G8");
        startActivity(i);
    }

}
