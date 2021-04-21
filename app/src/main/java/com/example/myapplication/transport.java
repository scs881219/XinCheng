package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class transport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton btn1,btn2,btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        btn = findViewById(R.id.imageButton8);
        btn1 = findViewById(R.id.imageButton19);
        btn2 = findViewById(R.id.imageButton20);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                car();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bus();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn();
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

    public void btn(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

}