package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class TempSplash extends AppCompatActivity {
    private int  SPLASH_TIME1=670;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_splash);
        textView1=findViewById(R.id.textView13);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mySuperIntent = new Intent(TempSplash.this, Avishkar.class);
                startActivity(mySuperIntent);

                finish();
            }
        }, SPLASH_TIME1);
    }

}
