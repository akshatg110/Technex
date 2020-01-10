package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;


public class CopsDialog1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cops_dialog1);


        TextView text = (TextView) findViewById(R.id.proceed1);
        text.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
