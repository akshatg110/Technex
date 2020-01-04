package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class workshop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);
    }
    public void reg(View view){
        startActivity(new Intent(getApplicationContext(),reg.class));

    }
}
