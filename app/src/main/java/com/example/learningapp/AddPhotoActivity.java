package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddPhotoActivity extends AppCompatActivity {
Button btnNextAddPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_photo);
        initview();

    }

    private void initview() {

        btnNextAddPhoto = findViewById(R.id.btnNextAddPhoto);

        btnNextAddPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AddPhotoActivity.this, DiscoverActivity.class);
                startActivity(i);
            }
        });

    }
}