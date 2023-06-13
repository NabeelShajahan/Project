package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Button booknow;
    EditText noOfCustomer, noOfNights;
    int Customer,Nights;
    int cost;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        booknow = findViewById(R.id.button6);
        noOfCustomer=findViewById(R.id.editTextTextPersonName6);
        noOfNights=findViewById(R.id.editTextTextPersonName7);
        Customer = Integer.parseInt(noOfCustomer.getText().toString());
        Nights = Integer.parseInt(noOfNights.getText().toString());


        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this , MainActivity5.class);
                startActivity(i);
            }
        });

    }
}