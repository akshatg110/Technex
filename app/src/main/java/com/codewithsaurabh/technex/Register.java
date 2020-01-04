package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void sub(View view){
        Toast.makeText(this, "YOU HAVE SUCCESSFULLY REGISTERED ", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(),Events.class));
        }
    }

