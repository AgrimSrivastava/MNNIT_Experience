package com.myapp.theagrim.agrimaapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText etEmail,etPassword,etReEnterpassword;
    DatabaseReference dtb;
    FirebaseAuth firebaseAuth;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth= FirebaseAuth.getInstance();
        FirebaseUser user= firebaseAuth.getCurrentUser();
        if(user != null){
            finish();
            startActivity(new Intent(MainActivity.this,GlobalWall.class));
        }

        btn=findViewById(R.id.btn_insert);
        etEmail= findViewById(R.id.et1);
        etPassword= findViewById(R.id.et2);
        etReEnterpassword=findViewById(R.id.re_enterpassword);


        progressDialog=new ProgressDialog(this);

        dtb= FirebaseDatabase.getInstance().getReference();

    }

    public void Register(View view){

        String email= etEmail.getText().toString().trim();
        String str_ReEnterpassword = etReEnterpassword.getText().toString().trim();
        String password=etPassword.getText().toString().trim();
        if(!str_ReEnterpassword.equals(password)){
            etReEnterpassword.setText("");
            Toast.makeText(this,"Password in both the textfield should be same",Toast.LENGTH_LONG).show();
            return;
        }
        else {

            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_LONG).show();
                return;
            }

            progressDialog.setMessage("Sending Info to Admin...");
            progressDialog.show();
            firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        progressDialog.dismiss();
                        Toast.makeText(MainActivity.this,"Registered Successfully",Toast.LENGTH_LONG).show();
                       startActivity(new Intent(MainActivity.this,ProfilePage.class));
                    }
                    else{
                        Log.e("error",task.getException()+"");
                        Toast.makeText(MainActivity.this, "Check your internet connection and try again", Toast.LENGTH_LONG).show();
                        progressDialog.dismiss();
                    }

                }
            });
        }
    }

    public void SignIn(View view){
        startActivity(new Intent(this,SignUp.class));
    }

    protected void onRestart(){
        super.onRestart();
        etEmail.setText("");
        etPassword.setText("");
        etReEnterpassword.setText("");

    }
}
