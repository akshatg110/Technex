package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }
    public void sub1(View view){
        Toast.makeText(this, "YOU HAVE SUCCESSFULLY REGISTERED ", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),workshop.class));
    }
}
