package com.example.timepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class h2 extends AppCompatActivity {
    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h3);

        b5 = findViewById(R.id.button3);


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(h2.this, "Hi Samruddhi here!", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(h2.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
