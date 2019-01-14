package com.myapp.theagrim.agrimaapp;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class SignUp extends AppCompatActivity {

    Button btn;

    AutoCompleteTextView etEmail,etPassword;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    CheckBox adminChecker;
    String email;
    String password;
    AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseDatabase =FirebaseDatabase.getInstance();

        adminChecker= findViewById(R.id.cb_admin);
        btn=findViewById(R.id.btn_insert);
        etEmail= findViewById(R.id.et1);
        etPassword= findViewById(R.id.et2);
        databaseReference= firebaseDatabase.getReference("LastUser");
        progressDialog=new ProgressDialog(this);
        progressDialog.setCancelable(false);
        alert= new AlertDialog.Builder(this);
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

    public void RegisterT(View view){

            startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }




    public void LogIn(View view){
        email= etEmail.getText().toString().trim();
        password=etPassword.getText().toString().trim();
        if(TextUtils.isEmpty(email)||TextUtils.isEmpty(password)){
            Toast.makeText(SignUp.this,"Invalid username or password",Toast.LENGTH_LONG).show();
            return;
        }


        progressDialog.setMessage("LoggingIn...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();
                if(task.isSuccessful()&&!adminChecker.isChecked()){
                    databaseReference=firebaseDatabase.getReference(firebaseAuth.getUid());

                    if(databaseReference==null){

                       alert.setMessage("It seems like you are a new user \n update your profile to proceed").setCancelable(false).setPositiveButton("Update",new DialogInterface.OnClickListener(){

                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               startActivity(new Intent(SignUp.this, ProfilePage.class));
                               finish();
                           }
                       });
                       AlertDialog dialog= alert.create();
                       dialog.setTitle("Profile Update");
                       dialog.show();

                    }
                    startActivity(new Intent(SignUp.this, GlobalWall.class));
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                    Toast.makeText(SignUp.this,"Logged In Successfully",Toast.LENGTH_LONG).show();
                }

                else if(task.isSuccessful()&&adminChecker.isChecked()){


                    startActivity(new Intent(SignUp.this, AdminLogin.class));
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                    Toast.makeText(SignUp.this,"Logged In Successfully as Admin",Toast.LENGTH_LONG).show();
                }

                else{
                    Toast.makeText(SignUp.this,"No account registered",Toast.LENGTH_LONG).show();
                    Toast.makeText(SignUp.this,"Check your internet connection and try again", Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();


                }

            }
        });
    }

    public void forgotPassword1(View view){
        String email= etEmail.getText().toString().trim();
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Enter a valid email address",Toast.LENGTH_LONG).show();
            return;
        }
       Intent intent= new Intent(this,ForgotPassword.class);
       intent.putExtra("Email",email);
       startActivity(intent);
    }
    protected void onRestart(){
        super.onRestart();
        etPassword.setText("");
        adminChecker.setChecked(false);
    }
}
