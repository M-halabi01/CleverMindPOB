package com.example.clevermindpob;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AppCompatActivity{

    ImageView left,right,img;
    DrawerLayout drawerLayout;

    ImageView menu1,menu2;

    TextView profileDrawer,attendedDrawer,eventsDrawer,jobsDrawer,paymentDrawer,settingsDrawer,
            policyDrawer,logoutDrawer;

    ViewPager viewPager;
    LatestNewsAdapter latestNewsAdapter;
    List<LatestNewsModel> latestNewsModels;

    TextView andAttendText,iosAttendText,qaAttendText ;
    ImageView andAttendBtn,iosAttendBtn,qaAttendBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        latestNewsModels=new ArrayList<>();
        latestNewsModels.add(new LatestNewsModel(R.drawable.google,"GOOGLE LAST UPDATES OF DEVELOPMENTS"));
        latestNewsModels.add(new LatestNewsModel(R.drawable.android,"ANDROID DEVELOPERS WEBSITE LEARNING"));
        latestNewsModels.add(new LatestNewsModel(R.drawable.ios,"IOS LAST UPDATES"));

        profileDrawer=findViewById(R.id.profileDrawer);
        attendedDrawer=findViewById(R.id.attendedDrawer);
        eventsDrawer=findViewById(R.id.eventsDrawer);
        jobsDrawer=findViewById(R.id.jobsDrawer);
        paymentDrawer=findViewById(R.id.paymentDrawer);
        settingsDrawer=findViewById(R.id.settingsDrawer);
        policyDrawer=findViewById(R.id.policyDrawer);
        logoutDrawer=findViewById(R.id.logoutDrawer);


        left=findViewById(R.id.left);
        right=findViewById(R.id.right);
        img=findViewById(R.id.img);
        andAttendText=findViewById(R.id.andAttendText);
        andAttendBtn=findViewById(R.id.andAttendBtn);
        iosAttendText=findViewById(R.id.iosAttendText);
        iosAttendBtn=findViewById(R.id.iosAttendBtn);
        qaAttendText=findViewById(R.id.qaAttendText);
        qaAttendBtn=findViewById(R.id.qaAttendBtn);
        drawerLayout=findViewById(R.id.drawer_layout);
        menu1=findViewById(R.id.menu1);
        menu2=findViewById(R.id.menu2);






        latestNewsAdapter=new LatestNewsAdapter(latestNewsModels,this);

        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(latestNewsAdapter);


        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index=viewPager.getCurrentItem();
                if(index==0)viewPager.setCurrentItem(2);
                else viewPager.setCurrentItem(viewPager.getCurrentItem()-1);
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index=viewPager.getCurrentItem();
                if(index==2)viewPager.setCurrentItem(0);
                else viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,LatestNews.class);
                startActivity(intent);
            }
        });
        andAttendText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,AndroidTrainingCenter.class);
                startActivity(intent);
            }
        });
        andAttendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,AndroidTrainingCenter.class);
                startActivity(intent);
            }
        });
        iosAttendText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,IosTrainingCenter.class);
                startActivity(intent);
            }
        });
        iosAttendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,IosTrainingCenter.class);
                startActivity(intent);
            }
        });
        qaAttendText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,QaTrainingCenter.class);
                startActivity(intent);
            }
        });
        qaAttendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,QaTrainingCenter.class);
                startActivity(intent);
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(Gravity.LEFT);
            }
        });

        logoutDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,Login.class);
                drawerLayout.closeDrawer(Gravity.LEFT);
                startActivity(intent);
                finish();
            }
        });
        profileDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,Profile.class);
                drawerLayout.closeDrawer(Gravity.LEFT);
                startActivity(intent);
            }
        });
        attendedDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,Attended.class);
                drawerLayout.closeDrawer(Gravity.LEFT);
                startActivity(intent);
            }
        });
        eventsDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,Events.class);
                drawerLayout.closeDrawer(Gravity.LEFT);
                startActivity(intent);
            }
        });
        jobsDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,Jobs.class);
                drawerLayout.closeDrawer(Gravity.LEFT);
                startActivity(intent);
            }
        });
        settingsDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,SettingsA.class);
                drawerLayout.closeDrawer(Gravity.LEFT);
                startActivity(intent);
            }
        });
        policyDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,PolicyAndPrivacey.class);
                drawerLayout.closeDrawer(Gravity.LEFT);
                startActivity(intent);
            }
        });



    }


}