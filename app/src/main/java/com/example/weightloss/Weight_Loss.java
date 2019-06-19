package com.example.weightloss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Weight_Loss extends AppCompatActivity {
    CardView weigthC1,weigthC2,weigthC3,weigthC4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight__loss);
        weigthC1=findViewById(R.id.weight1);


        weigthC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Weight_Loss.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
