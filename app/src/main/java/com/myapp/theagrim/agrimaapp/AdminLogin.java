package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {

    EditText etKey;
    Button btn_adminlogin;
    TextView backLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        etKey=findViewById(R.id.etKey);
        btn_adminlogin= findViewById(R.id.btn_admin);
        backLogin= findViewById(R.id.login);

    }

    public void goBack(View view){
        startActivity(new Intent(this,MainActivity.class));
    }

    public void adminLogin(View view){
        String key= etKey.getText().toString();
        if(TextUtils.isEmpty(key)){
            Toast.makeText(this,"Key is mandatory for admin login",Toast.LENGTH_LONG).show();
        }
        else
        {
            if(key.equals("admin_1234")){
                startActivity(new Intent(this,AdminPage.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }

            else{
                Toast.makeText(this,"UnauthorisedLogin",Toast.LENGTH_LONG).show();
            }
        }
    }
}
