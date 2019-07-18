package com.example.recipecraft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void myLogin(View v) {
        etusername=(EditText)findViewById(R.id.etUsername);
        etpassword=(EditText)findViewById(R.id.et);

    }
}
