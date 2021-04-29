package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class transport_car extends AppCompatActivity {
    private ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transport_car);
        btn = findViewById(R.id.imageButton8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });
    }
    public void back(){
        Intent intent = new Intent(this, transport.class);
        startActivity(intent);
    }
}
