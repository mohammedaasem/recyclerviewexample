package com.aasem.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    
    RecyclerView recyclerView;
    ArrayList<DataStudent> studentArrayList;
    Adapter adapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        studentArrayList=new ArrayList<>();
        adapter=new Adapter(this,studentArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "Clicked" +position, Toast.LENGTH_SHORT).show();
            }
        }));
        setData();
    }
    private void setData() {
        studentArrayList.add(new DataStudent(1,"11","Aasem","9767612120"));
        studentArrayList.add(new DataStudent(2,"12","Rahul","8787878787"));
        studentArrayList.add(new DataStudent(3,"13","Amol","9999999999"));
        studentArrayList.add(new DataStudent(4,"14","Hemant","9111111111"));
        studentArrayList.add(new DataStudent(5,"15","Sonu Mishra","9777777777"));
    }
}
