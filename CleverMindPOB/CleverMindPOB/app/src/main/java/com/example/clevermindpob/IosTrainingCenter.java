package com.example.clevermindpob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class IosTrainingCenter extends AppCompatActivity {
    ImageView back;
    Button attend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ios_training_center);

        back=findViewById(R.id.back);
        attend=findViewById(R.id.attend);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        attend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=2;
                Intent intent=new Intent(IosTrainingCenter.this,OnlinePayment.class);
                intent.putExtra("ID",id);
                startActivity(intent);
            }
        });
    }

}