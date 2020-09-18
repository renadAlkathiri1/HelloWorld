package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText E;
    TextView V;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.hButton);
        E = (EditText) findViewById(R.id.personName);
        V = (TextView) findViewById(R.id.textV);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = E.getText().toString();
                V.setText("Hello "+s);

            }
        });
    }
}