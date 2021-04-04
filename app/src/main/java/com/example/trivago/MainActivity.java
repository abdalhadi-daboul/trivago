package com.example.trivago;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownTimer timer = new CountDownTimer(5000,1000) //10 second Timer
        {
            public void onTick(long l)
            {

            }

            @Override
            public void onFinish()
            {Toast.makeText(getApplicationContext(),"hey",Toast.LENGTH_LONG).show();

                finish();


            };
        }.start();
}}
