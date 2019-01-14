package com.myapp.theagrim.agrimaapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Intent intent;
    private FirebaseAuth firebaseAuth;
    private AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        firebaseAuth = FirebaseAuth.getInstance();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Current Events", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                startActivity(new Intent(Navigation.this,TempSplash.class));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.time_table) {
            intent = new Intent(Navigation.this, Time_table.class);
            startActivity(intent);
            return false;
        } else if (id == R.id.attendance) {
            intent = new Intent(Navigation.this, attendance.class);
            startActivity(intent);
            return false;

        }
        else if (id == R.id.registration) {
            intent = new Intent(Navigation.this, Registration.class);
            startActivity(intent);
            return false;

        }


        else if (id == R.id.course) {
            intent = new Intent(Navigation.this, Main2Activity.class);
            startActivity(intent);
            return false;
        } else if (id == R.id.faculty) {
            intent = new Intent(Navigation.this, Search_faculty.class);
            startActivity(intent);
            return false;
        }


    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
      }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.events,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){

        switch(menuItem.getItemId()) {

            case R.id.logout: {
                alertDialog= new AlertDialog.Builder(this);
                alertDialog.setMessage("Do you really want to logout").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                firebaseAuth.signOut();
                                finish();
                                startActivity(new Intent(Navigation.this, SignUp.class));

                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        alertDialog.setCancelable(true);
                    }
                });


                AlertDialog alert= alertDialog.create();
                alert.setTitle("LogOut");

                alert.show();

            }

            }


        switch(menuItem.getItemId()){

            case R.id.update:{
                finish();
                startActivity(new Intent(this,StudentProfile.class));
            }

        }

        return true;

    }
    }


