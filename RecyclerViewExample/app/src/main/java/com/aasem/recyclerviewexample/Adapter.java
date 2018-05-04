package com.aasem.recyclerviewexample;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by inspire_info_soft on 5/2/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    ArrayList<DataStudent> dataStudents;

    public Adapter(Context context, ArrayList<DataStudent> dataStudents) {
        this.context = context;
        this.dataStudents = dataStudents;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvRollNumber,tvName,tvContactNumber;

        public MyViewHolder(View view) {
            super(view);
            tvRollNumber = (TextView) view.findViewById(R.id.tv_roll_number);
            tvName = (TextView) view.findViewById(R.id.tv_name);
            tvContactNumber = (TextView) view.findViewById(R.id.tv_contact_number);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DataStudent dataStudent=dataStudents.get(position);
        holder.tvName.setText(dataStudent.getName());
        holder.tvContactNumber.setText(dataStudent.getContactNumber());
        holder.tvRollNumber.setText(dataStudent.getRollNumber());
    }

    @Override
    public int getItemCount() {
        return dataStudents.size();
    }
}
