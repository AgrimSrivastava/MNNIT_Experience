package com.myapp.theagrim.agrimaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubEventsInfo extends AppCompatActivity {
    final TextView t=findViewById(R.id.text_sub_events);
    private String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        string=getIntent().getExtras().getString("z");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_events_info);
     /*   if(string.equals("C1"))
            t.setText();
        if(string.equals("C2"))
            t.setText();
        if(string.equals("C3"))
            t.setText();
        if(string.equals("c4"))
            t.setText();
        if(string.equals("C5"))
            t.setText();
        if(string.equals("C6"))
            t.setText();
        if(string.equals("C7"))
            t.setText();
        if(string.equals("C8"))
            t.setText();


        if(string.equals("P1"))
            t.setText();
        if(string.equals("P2"))
            t.setText();
        if(string.equals("P3"))
            t.setText();
        if(string.equals("P4"))
            t.setText();
        if(string.equals("P5"))
            t.setText();
        if(string.equals("P6"))
            t.setText();
        if(string.equals("P7"))
            t.setText();
        if(string.equals("P8"))
            t.setText();


        if(string.equals("N1"))
            t.setText();
        if(string.equals("N2"))
            t.setText();
        if(string.equals("N3"))
            t.setText();
        if(string.equals("N4"))
            t.setText();
        if(string.equals("N5"))
            t.setText();
        if(string.equals("N6"))
            t.setText();
        if(string.equals("N7"))
            t.setText();
        if(string.equals("N8"))
            t.setText();


        if(string.equals("E1"))
            t.setText();
        if(string.equals("E2"))
            t.setText();
        if(string.equals("E3"))
            t.setText();
        if(string.equals("E4"))
            t.setText();
        if(string.equals("E5"))
            t.setText();
        if(string.equals("E6"))
            t.setText();
        if(string.equals("E7"))
            t.setText();
        if(string.equals("E8"))
            t.setText();


        if(string.equals("R1"))
            t.setText();
        if(string.equals("R2"))
            t.setText();
        if(string.equals("R3"))
            t.setText();
        if(string.equals("R4"))
            t.setText();
        if(string.equals("R5"))
            t.setText();
        if(string.equals("R6"))
            t.setText();
        if(string.equals("R7"))
            t.setText();
        if(string.equals("R8"))
            t.setText();


        if(string.equals("K1"))
            t.setText();
        if(string.equals("K2"))
            t.setText();
        if(string.equals("K3"))
            t.setText();
        if(string.equals("K4"))
            t.setText();
        if(string.equals("K5"))
            t.setText();
        if(string.equals("K6"))
            t.setText();
        if(string.equals("K7"))
            t.setText();
        if(string.equals("K8"))
            t.setText();


        if(string.equals("M1"))
            t.setText();
        if(string.equals("M2"))
            t.setText();
        if(string.equals("M3"))
            t.setText();
        if(string.equals("M4"))
            t.setText();
        if(string.equals("M5"))
            t.setText();
        if(string.equals("M6"))
            t.setText();
        if(string.equals("M7"))
            t.setText();
        if(string.equals("M8"))
            t.setText();


        if(string.equals("G1"))
            t.setText();
        if(string.equals("G2"))
            t.setText();
        if(string.equals("G3"))
            t.setText();
        if(string.equals("G4"))
            t.setText();
        if(string.equals("G5"))
            t.setText();
        if(string.equals("G6"))
            t.setText();
        if(string.equals("G7"))
            t.setText();
        if(string.equals("G8"))
            t.setText();
    */}


}
