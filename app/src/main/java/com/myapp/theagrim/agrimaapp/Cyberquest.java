package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cyberquest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyberquest);
    }

    public void cyber(View view){
        Intent i=new Intent(this,Cyberquest.class);
        i.putExtra("z","C1");
        startActivity(i);
    }

    public void C1(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","C2");
        startActivity(i);
    }

    public void C2(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","C3");
        startActivity(i);
    }

    public void C4(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","C4");
        startActivity(i);
    }

    public void C5(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","C5");
        startActivity(i);
    }

    public void C6(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","C7");
        startActivity(i);
    }

    public void C7(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","C7");
        startActivity(i);
    }

    public void C8(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","C8");
        startActivity(i);
    }

}
