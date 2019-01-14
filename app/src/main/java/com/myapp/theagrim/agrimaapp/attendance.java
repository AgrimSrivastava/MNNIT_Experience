package com.myapp.theagrim.agrimaapp;



import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class attendance extends AppCompatActivity {
        Button b;
        CheckBox c1,c2,c3,c4,c5,c6,c7;
        TextView t1;
    DatabaseReference student;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;
    AlertDialog.Builder alert;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_attendance);
            t1=findViewById(R.id.textView1);
            c1=findViewById(R.id.checkBox1);
            c2=findViewById(R.id.checkBox2);
            c3=findViewById(R.id.checkBox3);
            c4=findViewById(R.id.checkBox4);
            c5=findViewById(R.id.checkBox5);
            c6=findViewById(R.id.checkBox6);
            c7=findViewById(R.id.checkBox7);
            b=findViewById(R.id.b1);
            student= FirebaseDatabase.getInstance().getReference();
            firebaseAuth= FirebaseAuth.getInstance();
            alert =new AlertDialog.Builder(this);
            alert.setMessage("You have already submitted attendance for the day").setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();

                        }
                    });



            AlertDialog alertDialog= alert.create();
            alertDialog.setTitle("Info");


            if(isMyServiceRunning(AttendanceManager.class)){
                alertDialog.show();

            }



        }

        public void Attendance(View view){
           // String key=   firebaseAuth.getUid();
            if(c1.isChecked())
            {

            }else{

            }
            if(c2.isChecked())
            {

            }else{

            }
            if(c3.isChecked())
            {

            }else{

            }
            if(c4.isChecked())
            {

            }else{

            }
            if(c5.isChecked())
            {

            }else{

            }
            if(c6.isChecked())
            {

            }else{

            }
            if(c7.isChecked())
            {

            }else{

            }
            //student.child(key).setValue(stu);

        }
        public void gotochart(View view){
            Intent i1=new Intent(this,pieChart.class);
            startActivity(i1);

        }

        public void checking(View view){



        }

        private boolean isMyServiceRunning(Class<?> serviceClass) {
            ActivityManager manager = (ActivityManager) getSystemService(this.ACTIVITY_SERVICE);
            for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
                if (serviceClass.getName().equals(service.service.getClassName())) {
                    return true;
                }
            }
            return false;
        }


    }



