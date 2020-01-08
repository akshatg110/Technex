package com.codewithsaurabh.technex;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class Events extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
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
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_cops, R.id.nav_robotic , R.id.nav_astronomy,
                R.id.nav_sae, R.id.nav_aeromodelling,R.id.nav_share)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.events, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public void register(View view){
        startActivity(new Intent(getApplicationContext(),Register.class));
    }
    public void CE1(View view){
        startActivity(new Intent(getApplicationContext(),CE1.class));
    }
    public void CE2(View view){
        startActivity(new Intent(getApplicationContext(),CE2.class));
    }
    public void CE3(View view){
        startActivity(new Intent(getApplicationContext(),CE3.class));
    }
    public void RE1(View view){
        startActivity(new Intent(getApplicationContext(),RE1.class));
    }
    public void RE2(View view){
        startActivity(new Intent(getApplicationContext(),RE2.class));
    }public void RE3(View view){
        startActivity(new Intent(getApplicationContext(),RE3.class));
    }public void AE1(View view){
        startActivity(new Intent(getApplicationContext(),AE1.class));
    }
    public void AE2(View view){
        startActivity(new Intent(getApplicationContext(),AE2.class));
    }public void AE3(View view){
        startActivity(new Intent(getApplicationContext(),AE3.class));
    }
    public void SE1(View view){
        startActivity(new Intent(getApplicationContext(),SE1.class));
    }
    public void SE2(View view){
        startActivity(new Intent(getApplicationContext(),SE2.class));
    }
    public void SE3(View view){
        startActivity(new Intent(getApplicationContext(),SE3.class));
    }
    public void AT1(View view){
        startActivity(new Intent(getApplicationContext(),AT1.class));
    }
    public void AT2(View view){
        startActivity(new Intent(getApplicationContext(),AT2.class));
    }
    public void AT3(View view){
        startActivity(new Intent(getApplicationContext(),AT3.class));
    }
}
