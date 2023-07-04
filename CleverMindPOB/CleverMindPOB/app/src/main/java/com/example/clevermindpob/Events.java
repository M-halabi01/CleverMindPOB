package com.example.clevermindpob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Events extends AppCompatActivity {

    ImageView left, right, img, back;
    ViewPager viewPager;
    LatestNewsAdapter latestNewsAdapter;
    List<LatestNewsModel> latestNewsModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        img = findViewById(R.id.img);
        back = findViewById(R.id.back);

        latestNewsModels = new ArrayList<>();
        latestNewsModels.add(new LatestNewsModel(R.drawable.google, "GOOGLE LAST UPDATES OF DEVELOPMENTS"));
        latestNewsModels.add(new LatestNewsModel(R.drawable.android, "ANDROID DEVELOPERS WEBSITE LEARNING"));
        latestNewsModels.add(new LatestNewsModel(R.drawable.ios, "IOS LAST UPDATES"));


        latestNewsAdapter = new LatestNewsAdapter(latestNewsModels, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(latestNewsAdapter);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = viewPager.getCurrentItem();
                if (index == 0) viewPager.setCurrentItem(2);
                else viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = viewPager.getCurrentItem();
                if (index == 2) viewPager.setCurrentItem(0);
                else viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}