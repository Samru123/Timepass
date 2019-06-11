package com.example.timepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class h extends AppCompatActivity {
Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h2);
        b2 = findViewById(R.id.button4);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(h.this, "Hi Samruddhi here!", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(h.this,h2.class);
                startActivity(intent);
            }
        });

    }
}
    /*Button b1;
    // String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Hi Samruddhi here!", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(MainActivity.this,h.class);
                startActivity(intent);
            }
        });

    }*/