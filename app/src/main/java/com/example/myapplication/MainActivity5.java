package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    TextView home, user;
    Button pay;
    EditText showAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        home = findViewById(R.id.textView2);
        user = findViewById(R.id.textView3);
        pay = findViewById(R.id.button2);
        showAmount = findViewById(R.id.editTextTextPersonName3);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity5.this, "Payment Accepted", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity5.this , MainActivity2.class);
                startActivity(i);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this , MainActivity2.class);
                startActivity(i);
            }
        });
    }
}