package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PowerSerge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_serge);
    }

    public void P1(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","P1");
        startActivity(i);
    }

    public void P2(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","P2");
        startActivity(i);
    }

    public void P3(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","P3");
        startActivity(i);
    }

    public void P4(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","P4");
        startActivity(i);
    }

    public void P5(View view){
        Intent i =new Intent(this,SubEventsInfo.class);
        i.putExtra("z","P5");
        startActivity(i);
    }

    public void P6(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","P6");
        startActivity(i);
    }

    public void P7(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","P7");
        startActivity(i);
    }

    public void P8(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","P8");
        startActivity(i);
    }

}
