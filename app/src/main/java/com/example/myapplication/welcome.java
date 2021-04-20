package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class welcome extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3500);
                    startActivity(new Intent().setClass(welcome.this, home.class));
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finish();
            }
        }).start();
    }
}