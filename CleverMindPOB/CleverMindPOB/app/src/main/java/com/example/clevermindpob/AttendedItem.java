package com.example.clevermindpob;

import android.widget.ImageView;

public class AttendedItem {

    int attendImg;
    String attendType,attendDate;

    public AttendedItem(int attendImg, String attendType, String attendDate) {
        this.attendImg = attendImg;
        this.attendType = attendType;
        this.attendDate = attendDate;
    }

    public int getAttendImg() {
        return attendImg;
    }

    public String getAttendType() {
        return attendType;
    }

    public String getAttendDate() {
        return attendDate;
    }
}
