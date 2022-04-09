package com.example.petemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String tima="a";
    String timb="b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txttima = findViewById(R.id.txttima);
        final EditText txttimb = findViewById(R.id.txttimb);
        Button input = findViewById(R.id.input);
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txttima.getText().toString().equalsIgnoreCase(tima)&&txttimb.getText().toString().equalsIgnoreCase(timb)){
                    startActivity(new Intent(MainActivity.this, ScoreActivity.class));
                }
            }
        });
    }
}