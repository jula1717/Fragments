package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExampleFragment exampleFragment = ExampleFragment.newInstance("Morelka",99);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,exampleFragment).commit();
    }
}