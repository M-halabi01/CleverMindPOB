package com.example.clevermindpob;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AttendedAdapter extends RecyclerView.Adapter<AttendedAdapter.ViewHolder> {

    List<AttendedItem> attendeds=new ArrayList<>();


    public AttendedAdapter(List<AttendedItem> attendeds) {
        this.attendeds = attendeds;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.attended_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.attendImg.setImageResource(attendeds.get(position).getAttendImg());
        holder.attendType.setText(attendeds.get(position).getAttendType());
        holder.attendDate.setText(attendeds.get(position).getAttendDate());

    }

    @Override
    public int getItemCount() {
        return attendeds.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView attendImg;
        TextView attendType,attendDate;
        ImageView cancel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            attendImg=itemView.findViewById(R.id.attendImg);
            attendType=itemView.findViewById(R.id.attendType);
            attendDate=itemView.findViewById(R.id.attendDate);
            cancel=itemView.findViewById(R.id.cancel);
            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
    public void removeItem(int index){
        attendeds.remove(index);
        notifyDataSetChanged();
    }
}
