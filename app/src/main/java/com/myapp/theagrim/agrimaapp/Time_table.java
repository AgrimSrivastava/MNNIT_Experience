package com.myapp.theagrim.agrimaapp;

import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;


public class Time_table extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    FirebaseAuth firebaseAuth;
    String BranchCheck;
    String[] arr;
    ListView listView;
    ImageView imageView;
    ArrayAdapter<String> arrayAdapter;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        progressDialog= new ProgressDialog(this);
        progressDialog.setMessage("Loading");
        progressDialog.setCancelable(false);

        listView = findViewById(R.id.listI);
        firebaseAuth = FirebaseAuth.getInstance();
        imageView= findViewById(R.id.image);
        progressDialog.show();



        DatabaseReference databaseReference = firebaseDatabase.getReference(firebaseAuth.getUid());
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                Student student = dataSnapshot.getValue(Student.class);
                BranchCheck = student.getBranch();
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(Time_table.this, "Error occured please go back and reload", Toast.LENGTH_LONG).show();
            }
        });

        }




        public void monday(View view) {

            if(BranchCheck.equals("IT")){
                arr = new TimeTableIT().getMon();
                arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
                listView.setAdapter(arrayAdapter);

            }

            if(BranchCheck.equals("CS")){
                arr = new TimeTableCS().getMon();
                arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
                listView.setAdapter(arrayAdapter);


            }

    }

    public void tuesday(View view) {
        if(BranchCheck.equals("IT")){
            arr = new TimeTableIT().getTue();
            arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
            listView.setAdapter(arrayAdapter);


        }

        if(BranchCheck.equals("CS")){
            arr = new TimeTableCS().getTue();
            arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
            listView.setAdapter(arrayAdapter);


        }
    }

    public void wednesday(View view) {
        if(BranchCheck.equals("IT")){
            arr = new TimeTableIT().getWed();
            arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
            listView.setAdapter(arrayAdapter);


        }

        if(BranchCheck.equals("CS")){
            arr = new TimeTableCS().getWed();
            arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
            listView.setAdapter(arrayAdapter);


        }
    }

    public void thursday(View view) {
        if(BranchCheck.equals("IT")){
            arr = new TimeTableIT().getThurs();
            arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
            listView.setAdapter(arrayAdapter);


        }

        if(BranchCheck.equals("CS")){
            arr = new TimeTableCS().getThurs();
            arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
            listView.setAdapter(arrayAdapter);


        }
    }

    public void friday(View view) {
        if(BranchCheck.equals("IT")){
            arr = new TimeTableIT().getFri();
            arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
            listView.setAdapter(arrayAdapter);


        }
        if(BranchCheck.equals("CS")){
            arr = new TimeTableCS().getFri();
            arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
            listView.setAdapter(arrayAdapter);


        }


    }

    public void saturday(View view){
        arr = new TimeTableIT().getSat();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(arrayAdapter);
    }

    public void sunday(View view){
        arr = new TimeTableIT().getSun();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(arrayAdapter);
    }



}


