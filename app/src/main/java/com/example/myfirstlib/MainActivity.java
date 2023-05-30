package com.example.myfirstlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mylibrary.NewClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewClass.showToast(this, "Hello");
    }
}