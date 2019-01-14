package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Nirman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nirman);
    }

    public void N1(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","N1");
        startActivity(i);
    }

    public void N2(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","N2");
        startActivity(i);
    }

    public void N3(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","N3");
                startActivity(i);
    }

    public void N4(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","N4");
        startActivity(i);
    }

    public void N5(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","N5");
        startActivity(i);
    }

    public void N6(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","N6");
        startActivity(i);
    }

    public void N7(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","N7");
        startActivity(i);
    }

    public void N8(View view){
        Intent i=new Intent(this,SubEventsInfo.class);
        i.putExtra("z","N8");
        startActivity(i);
    }

}
