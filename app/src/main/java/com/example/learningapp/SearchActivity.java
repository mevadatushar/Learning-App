package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {
        TextView btnDesign;
        ImageView imgDesign;
        LinearLayout lytDesign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        intitview();
    }

    private void intitview() {

        btnDesign=findViewById(R.id.btnDesign);
        imgDesign=findViewById(R.id.imgDesign);
        lytDesign=findViewById(R.id.lytDesign);

        btnDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(SearchActivity.this, SearchDesignActivity.class);
                startActivity(i);
            }
        });

        imgDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(SearchActivity.this, SearchDesignActivity.class);
                startActivity(i);
            }
        });

        lytDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(SearchActivity.this, SearchDesignActivity.class);
                startActivity(i);
            }
        });
    }
}