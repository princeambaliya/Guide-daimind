package com.example.diamond_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TipsAndTricks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_and_tricks);

        Button button = findViewById(R.id.btback);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        LinearLayout linearLayout = findViewById(R.id.GetDevice);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TipsAndTricks.this, GetDevice.class));
            }
        });

        LinearLayout linearLayout1 = findViewById(R.id.LandingPoint);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TipsAndTricks.this, LandingPoint.class));
            }
        });

        LinearLayout linearLayout2 = findViewById(R.id.Explore);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TipsAndTricks.this, Explore.class));
            }
        });

        LinearLayout linearLayout3 = findViewById(R.id.SafeArea);
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TipsAndTricks.this, SafeArea.class));
            }
        });

        LinearLayout linearLayout4 = findViewById(R.id.TakeCover);
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TipsAndTricks.this, TakeCover.class));
            }
        });

        LinearLayout linearLayout5 = findViewById(R.id.VehicleCarefully);
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TipsAndTricks.this, VehicleCarefully.class));
            }
        });

        LinearLayout linearLayout6 = findViewById(R.id.hako);
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TipsAndTricks.this, TakeCover.class));
            }
        });


    }
}