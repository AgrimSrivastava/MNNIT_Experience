package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Avishkar extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avishkar);
    }

    public void cyber(View view){
        Intent i=new Intent(this,Cyberquest.class);
        startActivity(i);
    }

    public void electro(View view){
        Intent i=new Intent(this,Eleectromania.class);
        startActivity(i);
    }

    public void power(View view){
        Intent i=new Intent(this,PowerSerge.class);
        startActivity(i);
    }

    public void nirman(View view){
        Intent i=new Intent(this,Nirman.class);
        startActivity(i);
    }

    public void rasayan(View view){
        Intent i=new Intent(this,Rasayan.class);
        startActivity(i);
    }

    public void mechro(View view){
        Intent i=new Intent(this,Mechro.class);
        startActivity(i);
    }

    public void gen(View view){
        Intent i=new Intent(this,Genesis.class);
        startActivity(i);
    }

    public void kreedo(View view){
        Intent i=new Intent(this,Kreedomania.class);
        startActivity(i);
    }


}