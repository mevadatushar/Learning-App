package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FindMentorActivity extends AppCompatActivity {
TextView txtDesignFM;
LinearLayout imgChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_mentor);
        initview();
    }

    private void initview() {

        txtDesignFM=findViewById(R.id.txtDesignFM);
        imgChat=findViewById(R.id.imgChat);


        txtDesignFM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindMentorActivity.this, FindMentor_DesignActivity.class);
                startActivity(i);

            }
        });

        imgChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindMentorActivity.this, ChatActivity.class);
                startActivity(i);

            }
        });
    }
}