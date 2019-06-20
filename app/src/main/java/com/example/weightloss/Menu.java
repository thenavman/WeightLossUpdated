package com.example.weightloss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class Menu extends AppCompatActivity {
    CardView wLoss,wGain,skinCare,hairCare,bodyCare,generalTips;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        wLoss=findViewById(R.id.CardLoss);
        wGain=findViewById(R.id.CardGain);

        wGain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu.this, TabLayout.class);
                startActivity(intent);
            }
        });
    }
}
