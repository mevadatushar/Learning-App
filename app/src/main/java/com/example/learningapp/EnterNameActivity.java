package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnterNameActivity extends AppCompatActivity {
    Button btnNextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_name);
        initview();

    }

    private void initview() {

        btnNextName = findViewById(R.id.btnNextName);

        btnNextName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EnterNameActivity.this, AddPhotoActivity.class);
                startActivity(i);
            }
        });

    }
}