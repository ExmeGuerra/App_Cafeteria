package com.example.cafe_meseros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mesero extends AppCompatActivity {
    Button regresarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesero);

        regresarButton = findViewById(R.id.regresarButton);

        regresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mesero.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}