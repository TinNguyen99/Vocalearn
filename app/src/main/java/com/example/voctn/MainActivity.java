package com.example.voctn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.voctn.toeic600.Fragment_Home;
import com.example.voctn.toeic600.Toeic600;
import com.example.voctn.toeiclearn.ToeicLearn;

import static com.example.voctn.R.color.colorAccent;

public class MainActivity extends AppCompatActivity {

    ImageButton btn600, btnvoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn600 = (ImageButton) findViewById(R.id.btnact600);
        btnvoc = (ImageButton) findViewById(R.id.btnactvoc);

        btn600.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Toeic600.class);
                startActivity(intent);
            }
        });


        btnvoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ToeicLearn.class);
                startActivity(intent);
            }
        });

    }
}
