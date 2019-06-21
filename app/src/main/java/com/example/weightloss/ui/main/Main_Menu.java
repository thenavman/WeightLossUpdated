package com.example.weightloss.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.weightloss.Body_Care;
import com.example.weightloss.General_Tips;
import com.example.weightloss.Hair_Care;
import com.example.weightloss.R;
import com.example.weightloss.Skin_Care;
import com.example.weightloss.Weight_Gain;
import com.example.weightloss.Weight_Loss;

public class Main_Menu extends AppCompatActivity {
    CardView diet, skincare, haircare, bodycare, generaltipss,weightgain;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        diet = findViewById(R.id.weight1);

        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dit = new Intent(Main_Menu.this, Weight_Loss.class);
                startActivity(dit);
            }
        });

        skincare = findViewById(R.id.cardview_skin_care);

        skincare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent skncre = new Intent(Main_Menu.this, Skin_Care.class);
                startActivity(skncre);
            }
        });
        haircare = findViewById(R.id.Cardview_haircare);

        haircare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hair=new Intent(Main_Menu.this, Hair_Care.class);
                startActivity(hair);
            }
        });

        bodycare=findViewById(R.id.Cardview_bodycare);
        bodycare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bdycare=new Intent(Main_Menu.this, Body_Care.class);
                startActivity(bdycare);

            }
        });
        generaltipss=findViewById(R.id.Cardview_generaltips);
        generaltipss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gnrltips=new Intent(Main_Menu.this, General_Tips.class);
                startActivity(gnrltips);
            }
        });

        weightgain=findViewById(R.id.Cardview_weightgain);
        weightgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wghtgain=new Intent(Main_Menu.this, Weight_Gain.class);
                startActivity(wghtgain);
            }
        });



    }

}
