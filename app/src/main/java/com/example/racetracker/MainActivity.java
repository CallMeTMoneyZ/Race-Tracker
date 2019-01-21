package com.example.racetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //initialize manage students button
        Button manageStudent = findViewById(R.id.manageStudents);
        manageStudent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                loadManageStudent();
            }
        });

        //initialize manage races button
        Button manageRace = findViewById(R.id.manageRaces);
        manageRace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                loadManageRace();
            }
        });

        //initialize view statistics button
        Button viewStats = findViewById(R.id.viewStats);
        viewStats.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                loadViewStats();
            }
        });
    }

    public void loadManageStudent(){
        Intent intent = new Intent(this, activity_Manage_Students.class);
        startActivity(intent);
    }

    public void loadManageRace(){
        Intent intent = new Intent(this, activity_Mange_Races.class);
        startActivity(intent);
    }

    public void loadViewStats(){
        Intent intent = new Intent(this, activity_View_Stats.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
