package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class workshop extends AppCompatActivity {
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);
    }
    public void reg(View view){
        startActivity(new Intent(getApplicationContext(),reg.class));

    }
    public void chat(View view){
        i=1;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void java(View view){
        i=2;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void digital(View view){
        i=3;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void bridge(View view){
        i=4;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void google(View view){
        i=5;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void drone(View view){
        i=6;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void ardubotics(View view){
        i=7;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void automobile(View view){
        i=8;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void hacking(View view){
        i=9;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void ai(View view){
        i=10;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void autocad(View view){
        i=11;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void iot(View view){
        i=12;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void python(View view){
        i=13;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void website(View view){
        i=14;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void pi(View view){
        i=15;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void plc(View view){
        i=16;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
    public void android(View view){
        i=17;
        Intent intent=new Intent(getApplicationContext(), WebView1.class);
        intent.putExtra("case",i);
        startActivity(intent);
    }
}
