package com.example.clevermindpob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Attended extends AppCompatActivity {

    ArrayList<AttendedItem> attendedItems=new ArrayList<>();

    int[] images={R.drawable.android,R.drawable.ios,R.drawable.qa};
    String[] types={"ANDROID FULL TRACK DEVELOPMENT","IOS FULL TRACK DEVELOPMENT",
            "QA AND PM FOR MOBILE APPS&#xA; AND WEBSITE"};
    String[] dates={"SUN-THU\n10:00AM-1:00PM","SAT-TUS\n11:00AM-2:00PM",
            "MON-THU\n9:30AM-1:00PM"};

    TextView noAttended;
    RecyclerView attendedList;

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attended);

        back=findViewById(R.id.back);
        noAttended=findViewById(R.id.noAttended);
        attendedList=findViewById(R.id.attendedList);

        SharedPreferences sp=getApplicationContext().getSharedPreferences("Center", Context.MODE_PRIVATE);
        if(sp.contains("id")){
            noAttended.setVisibility(View.INVISIBLE);
            int id=sp.getInt("id",5);
            attendedItems.add(new AttendedItem(images[id-1],types[id-1],dates[id-1]));
            id=5;
        }
        else{
            attendedList.setVisibility(View.INVISIBLE);
        }

        AttendedAdapter adapter=new AttendedAdapter(attendedItems);
        attendedList.setAdapter(adapter);
        attendedList.setLayoutManager(new LinearLayoutManager(this));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}