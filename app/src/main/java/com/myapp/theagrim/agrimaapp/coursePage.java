package com.myapp.theagrim.agrimaapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class coursePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);
    }
    public void it_course(View view){
        Intent it_browse=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mnnit.ac.in/index.php/department/engineering/csed/csedcourses"));
        startActivity(it_browse);
    }

    public void ece_course(View view){
        Intent ece_browse=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mnnit.ac.in/index.php/department/engineering/ece/ececourse"));
        startActivity(ece_browse);
    }

    public void cse_course(View view){
        Intent cse_browse=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mnnit.ac.in/index.php/department/engineering/csed/csedcourses"));
        startActivity(cse_browse);
    }

    public void electrical_course(View view){
        Intent electrical_browse=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mnnit.ac.in/index.php/department/engineering/ee/eecourses"));
        startActivity(electrical_browse);
    }

    public void mechanical_course(View view){
        Intent mechanical_browse=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mnnit.ac.in/index.php/department/engineering/me/mecourses"));
        startActivity(mechanical_browse);
    }

    public void production_course(View view){
        Intent production_browse=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mnnit.ac.in/index.php/department/engineering/me/mecourses"));
        startActivity(production_browse);
    }

    public void chemical_course(View view){
        Intent chemical_browse=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mnnit.ac.in/index.php/department/engineering/cm/cmcourses"));
        startActivity(chemical_browse);
    }

    public void biotech_course(View view){
        Intent biotech_browse=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mnnit.ac.in/index.php/department/engineering/biotech/biotechcourses"));
        startActivity(biotech_browse);
    }

    public void civil_course(View view){
        Intent civil_browse=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mnnit.ac.in/index.php/department/engineering/ce/cecourses"));
        startActivity(civil_browse);
    }
}
