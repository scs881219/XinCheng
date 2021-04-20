package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_transport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton btncar,btnbus;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        btncar = (ImageButton) findViewById(R.id.imageButton19);
        btnbus = (ImageButton) findViewById(R.id.imageButton20);
        btncar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                car();
            }
        });
        btnbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bus();
            }
        });

    }

    public void car(){
        Intent intent = new Intent(this, transport_car.class);
        startActivity(intent);
    }

    public void bus(){
        Intent intent = new Intent(this, transport_bus.class);
        startActivity(intent);
    }



}