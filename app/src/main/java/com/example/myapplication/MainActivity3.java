package com.example.myapplication;


        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button booknow;
    EditText noOfCustomer, noOfNights;
    int Customer,Nights;
    int cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        booknow = findViewById(R.id.button5);
        noOfCustomer=findViewById(R.id.editTextTextPersonName4);
        noOfNights=findViewById(R.id.editTextTextPersonName5);
        Customer = Integer.parseInt(noOfCustomer.getText().toString());
        Nights = Integer.parseInt(noOfNights.getText().toString());


        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this , MainActivity5.class);
                startActivity(i);
            }
        });
    }
}