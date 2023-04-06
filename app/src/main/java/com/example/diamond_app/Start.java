package com.example.diamond_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
@SuppressWarnings("all")

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        LinearLayout linearLayout=findViewById(R.id.guide);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Start.this,GuideDiamond.class));

            }
        });

        LinearLayout linearLayout1=findViewById(R.id.LinearSkinTools);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Start.this,SkinTools.class));
            }
        });


    }
}