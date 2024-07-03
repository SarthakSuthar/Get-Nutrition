package com.example.getnutrition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView card1,card2,card3,card4,card5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.Card_WhatIsNutrition);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WhatIsNutrition.class);
                startActivity(intent);
            }
        });

        card2 = findViewById(R.id.Card_Malnutrition);

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WhatIsMalnutrition.class);
                startActivity(intent);
            }
        });

        card3 = findViewById(R.id.Card_Sources);

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SourcesOfNutrition.class);
                startActivity(intent);
            }
        });

        card4 = findViewById(R.id.Card_Necessity);

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NecessityOfNutrition.class);
                startActivity(intent);
            }
        });

        card5 = findViewById(R.id.Card_Deficiency);

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WhatIsNutrition.class);
                startActivity(intent);
            }
        });
    }
}