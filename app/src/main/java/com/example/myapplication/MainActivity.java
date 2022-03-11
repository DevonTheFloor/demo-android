package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mCreer;
    Button mTrouver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCreer = findViewById(R.id.creer);
        mTrouver = findViewById(R.id.trouver);

        mTrouver.setEnabled(true);
    }
}