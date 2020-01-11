package com.codewithsaurabh.technex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("MyNotification", "MyNotification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        FirebaseMessaging.getInstance().subscribeToTopic("general")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "succesfull";
                        if (!task.isSuccessful()) {
                            msg = "Failed";
                        }
                    }
                });
    }

        @Override
        public void onBackPressed () {

        }

    public void events(View view) {
        startActivity(new Intent(getApplicationContext(), Events.class));
    }

    public void workshop(View view) {
        startActivity(new Intent(getApplicationContext(), workshop.class));
    }

    public void schedule(View view) {
        startActivity(new Intent(getApplicationContext(), Schedule.class));
    }

    public void startup(View view) {
        Intent intent = new Intent(MainActivity.this,Stratup.class);
        startActivity(intent);
    }
    public void exibition(View view) {
        Intent intent = new Intent(MainActivity.this,exibition.class);
        startActivity(intent);
    }
    public void kaleidoscope(View view) {
        Intent intent = new Intent(MainActivity.this,kaleidoscope.class);
        startActivity(intent);
    }
    public void thinktalks(View view) {
        Intent intent = new Intent(MainActivity.this,thinktalks.class);
        startActivity(intent);
    }
    public void initiative(View view) {
        Intent intent = new Intent(MainActivity.this,initiative.class);
        startActivity(intent);
    }
    public void corporate(View view) {
        Intent intent = new Intent(MainActivity.this,corporateConclave.class);
        startActivity(intent);
    }
    public void gaming(View view) {
        Intent intent = new Intent(MainActivity.this,gamingDungeon.class);
        startActivity(intent);
    }

}

