package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DiscoverActivity extends AppCompatActivity {
BottomNavigationView Discover,Find_a_member,Chat,Profile;
LinearLayout FindMember;
ImageView Search;
TextView txtMoreScience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        initview();

    }

    private void initview() {
        Discover=findViewById(R.id.Discover);
        FindMember=findViewById(R.id.FindMember);
        Chat=findViewById(R.id.Chat);
        Profile=findViewById(R.id.Profile);
        Search=findViewById(R.id.Search);
        txtMoreScience=findViewById(R.id.txtMoreScience);

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscoverActivity.this, SearchActivity.class);
                startActivity(i);

            }
        });

        txtMoreScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscoverActivity.this, ScienceActivity.class);
                startActivity(i);

            }
        });

        FindMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscoverActivity.this, FindMentorActivity.class);
                startActivity(i);

            }
        });



    }
}