package com.yuval.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.et);
        b = findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et.getText().toString();
                Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("myName", name);
                startActivity(i);
            }
        });
    }
}
