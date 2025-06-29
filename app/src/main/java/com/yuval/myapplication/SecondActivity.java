package com.yuval.myapplication; // תעדכן לפי שם החבילה שלך

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String name = getIntent().getStringExtra("myName");

        Toast.makeText(getApplicationContext(), "Welcome aboard, " + name + " 👋", Toast.LENGTH_LONG).show();

        TextView tv = findViewById(R.id.welcomeText);
        tv.setText("Hello brother " + name + " 👋");
    }
}
