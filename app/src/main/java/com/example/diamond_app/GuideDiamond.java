package com.example.diamond_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class GuideDiamond extends AppCompatActivity {

    Button btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_diamond);


        btBack = findViewById(R.id.btback);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        LinearLayout linearLayout = findViewById(R.id.TipsAndTricks);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GuideDiamond.this, TipsAndTricks.class));
            }
        });


        LinearLayout linearLayout1 = findViewById(R.id.GameWeapons);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GuideDiamond.this, GameWeapons.class));
            }
        });

        LinearLayout linearLayout2 = findViewById(R.id.GameVehicle);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GuideDiamond.this, GameVehicle.class));
            }
        });

        LinearLayout linearLayout3 = findViewById(R.id.Characters);
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GuideDiamond.this, Characters.class));
            }
        });

        LinearLayout linearLayout4 = findViewById(R.id.FreeDiamonds);
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GuideDiamond.this, FreeDiamonds.class));
            }
        });

        LinearLayout linearLayout5 = findViewById(R.id.FfCalculator);
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GuideDiamond.this, FfCalculator.class));
            }
        });


    }


}