package com.myapp.theagrim.agrimaapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StudentProfile extends AppCompatActivity {

    private TextView user_name,user_registration,user_branch,user_year;
    FirebaseDatabase firebaseDatabase;
    FirebaseAuth firebaseAuth;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        user_name= findViewById(R.id.tvNameD);
        user_branch=findViewById(R.id.tvBranchD);
        user_year=findViewById(R.id.tvYearD);
        user_registration=findViewById(R.id.tvRegistrationD);
        firebaseAuth= FirebaseAuth.getInstance();
        firebaseDatabase =FirebaseDatabase.getInstance();
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        DatabaseReference databaseReference= firebaseDatabase.getReference(firebaseAuth.getUid());

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Student student= dataSnapshot.getValue(Student.class);
                user_name.setText((student.getName()));
                user_branch.setText(student.getBranch());
                user_registration.setText(student.getRegistration());
                user_year.setText(student.getYear());
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                progressDialog.dismiss();
                Toast.makeText(StudentProfile.this,"Error occured please go back and reload",Toast.LENGTH_LONG).show();
            }
        });



    }

    public void profile(View view){
        startActivity(new Intent(this,UpdateProfile.class));
    }
}
