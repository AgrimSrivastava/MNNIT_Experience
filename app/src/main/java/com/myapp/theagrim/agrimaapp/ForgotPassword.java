package com.myapp.theagrim.agrimaapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import com.google.firebase.auth.FirebaseAuth;


public class ForgotPassword extends AppCompatActivity {
    FirebaseAuth firebaseAuth;
    EditText textView;
    String email;
    AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        firebaseAuth= FirebaseAuth.getInstance();
        textView= findViewById(R.id.textView17);
        Bundle bundle =getIntent().getExtras();

        email= bundle.getString("Email");

        textView.setText(email);
    }

    public void forgotPassword(View view){

        alertDialog= new AlertDialog.Builder(this);
        alertDialog.setMessage("It can take upto 5mins foe sending Reset Email").setCancelable(false)
                .setPositiveButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        startActivity(new Intent(ForgotPassword.this,SignUp.class));

                    }
                });
        AlertDialog dialog= alertDialog.create();
        dialog.setTitle("Information");
        dialog.show();
        firebaseAuth.sendPasswordResetEmail(email)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(ForgotPassword.this, "Check email to reset your password!", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(ForgotPassword.this, "Fail to send reset password email!", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });







    }
}
