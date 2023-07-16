package com.example.cafeteria_exme;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView ordersTitleTextView;
    private ListView ordersListView;
    private Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ordersTitleTextView = findViewById(R.id.ordersTitleTextView);
        ordersListView = findViewById(R.id.ordersListView);
        backButton = findViewById(R.id.backButton);
    }
}