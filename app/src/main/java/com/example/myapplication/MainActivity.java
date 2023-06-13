package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText User = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText Password = (EditText) findViewById(R.id.editTextTextPersonName2);
        Button login = (Button) findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (User.getText().toString().equals("") || Password.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Field Required!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Successfully!", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this , MainActivity2.class);
                    startActivity(i);
                }

            }
        });
    }
}