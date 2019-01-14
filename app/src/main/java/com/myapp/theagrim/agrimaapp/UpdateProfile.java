package com.myapp.theagrim.agrimaapp;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class UpdateProfile  extends AppCompatActivity {

    EditText name,registration;
    Spinner year,branch;
    ImageView imageView;
    DatabaseReference student;
    FirebaseAuth firebaseAuth;
    ProgressDialog progressDialog;
    AlertDialog.Builder alertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);

        name = findViewById(R.id.etName);
        registration= findViewById(R.id.etRegistration);
        year =findViewById(R.id.spYear);
        branch =findViewById(R.id.spBranch);
        imageView =findViewById(R.id.profile_image);
        imageView.setImageResource(R.drawable.profile);
        progressDialog=new ProgressDialog(this);
        firebaseAuth= FirebaseAuth.getInstance();
        student= FirebaseDatabase.getInstance().getReference(firebaseAuth.getUid());

        progressDialog.setMessage("Loading...");


    }


    public void Registration(View view){
        progressDialog.show();
        String username= name.getText().toString().trim();
        String registration_user = registration.getText().toString();
        String year_user =year.getSelectedItem().toString();
        String branch_user= branch.getSelectedItem().toString();

        if(!TextUtils.isEmpty(username)&&!TextUtils.isEmpty(registration_user)&&!TextUtils.isEmpty(year_user)&&!TextUtils.isEmpty(branch_user)){

            student.child("name").setValue(username);
            student.child("branch").setValue(branch_user);
            student.child("registration").setValue(registration_user);
            student.child("year").setValue(year_user);
            progressDialog.dismiss();
            alertDialog= new AlertDialog.Builder(this);
            alertDialog.setMessage("Details Successfully Updated Go back to LogIn page").setCancelable(false)
                    .setPositiveButton("Back", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            startActivity(new Intent(UpdateProfile.this,StudentProfile.class));

                        }
                    });


            AlertDialog alert= alertDialog.create();
            alert.setTitle("Successful Registration");

            alert.show();

        }

        else{
            progressDialog.dismiss();

            Toast.makeText(this,"Invalid username or registration",Toast.LENGTH_LONG).show();
            return;
        }

    }
}
