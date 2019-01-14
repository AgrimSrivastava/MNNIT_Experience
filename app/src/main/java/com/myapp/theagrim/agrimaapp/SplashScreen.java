package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    Animation frombottom,fromtop;
    private static int SPLASH_TIME = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        fromtop=AnimationUtils.loadAnimation(this,R.anim.fromtop);
        frombottom=AnimationUtils.loadAnimation(this,R.anim.frombottom);
        imageView=findViewById(R.id.imageView2);
        textView= findViewById(R.id.text_view);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        textView.startAnimation(myanim);
        textView.setAnimation(frombottom);
        imageView.setAnimation(fromtop);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mySuperIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(mySuperIntent);

                finish();
            }
        }, SPLASH_TIME);
    }
}