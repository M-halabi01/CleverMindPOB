package com.example.clevermindpob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SettingsA extends AppCompatActivity {


    ImageView back;
    Button en,ar,send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        back=findViewById(R.id.back);
        en=findViewById(R.id.en);
        ar=findViewById(R.id.ar);
        send=findViewById(R.id.send);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                en.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4E4B4B")));
                ar.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
            }
        });
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ar.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4E4B4B")));
                en.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsA.this,"SENT",Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });

    }
}