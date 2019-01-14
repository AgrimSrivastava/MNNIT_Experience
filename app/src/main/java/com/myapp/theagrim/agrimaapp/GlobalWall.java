package com.myapp.theagrim.agrimaapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class GlobalWall extends AppCompatActivity {

    ListView listView;
    DatabaseReference admin;
    ProgressDialog progressDialog;
    ArrayList<String> inf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_wall);
        inf= new ArrayList<>();
        listView= findViewById(R.id.notif);
        admin= FirebaseDatabase.getInstance().getReference("Messages");
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        final ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,inf);
        listView.setAdapter(arrayAdapter);

        admin.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                String value= dataSnapshot.getValue(String.class);
                inf.add(value);
                arrayAdapter.notifyDataSetChanged();
                progressDialog.dismiss();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();




    }

    public void Navigation(View view){
        startActivity(new Intent(this,Navigation.class));
    }
}

