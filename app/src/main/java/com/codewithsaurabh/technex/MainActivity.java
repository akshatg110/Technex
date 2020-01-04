package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void events(View view){
        startActivity(new Intent(getApplicationContext(),Events.class));
    }
    public void profile(View view){
        startActivity(new Intent(getApplicationContext(),profile.class));
    }
    public void workshop(View view){
        startActivity(new Intent(getApplicationContext(),workshop.class));
    }
}
