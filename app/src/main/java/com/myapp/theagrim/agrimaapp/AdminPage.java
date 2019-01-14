package com.myapp.theagrim.agrimaapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminPage extends AppCompatActivity {

    EditText etMessage;
    DatabaseReference admin;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        etMessage = findViewById(R.id.etMessage);
        admin= FirebaseDatabase.getInstance().getReference("Messages");
        firebaseAuth =FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);
    }


    public void logOut(View view) {

        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(AdminPage.this,SignUp.class));

    }

    public void postMessage( View view){

        String message= etMessage.getText().toString().trim();
        progressDialog.setMessage("Adding...");
        progressDialog.show();


        if(!TextUtils.isEmpty(message)){


            String id = admin.push().getKey();

            admin.child(id).setValue(message);

            Toast.makeText(this,"Message posted",Toast.LENGTH_LONG).show();
            progressDialog.dismiss();

            }

        else{
            progressDialog.dismiss();
            Toast.makeText(this,"Message should contain something useful xD",Toast.LENGTH_LONG).show();
        }
    }
}
