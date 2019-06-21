package com.example.weightloss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Weight_Loss extends AppCompatActivity {
    CardView weigth1,weigthC2,weigthC3,weigthC4,di;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight__loss);
        di=findViewById(R.id.cardview_diet);

        di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent die=new Intent(Weight_Loss.this,MainActivity.class);
                startActivity(die);
            }
        });


    }
}
