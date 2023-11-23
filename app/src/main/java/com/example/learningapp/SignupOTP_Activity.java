package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupOTP_Activity extends AppCompatActivity {
Button btnNextOtp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_otp);

        initview();

    }

    private void initview() {

        btnNextOtp=findViewById(R.id.btnNextOtp);

        btnNextOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignupOTP_Activity.this, EnterNameActivity.class);
                startActivity(i);
            }
        });

    }
}