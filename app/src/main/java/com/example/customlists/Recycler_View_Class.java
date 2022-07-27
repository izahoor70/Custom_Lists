package com.example.customlists;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Recycler_View_Class extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<RecyclerModel> rlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_class);

        recyclerView = findViewById(R.id.myrecview);
        rlist = new ArrayList<>();

        rlist.add(new RecyclerModel("Zoom","ok",3,R.drawable.whatsapp));
        rlist.add(new RecyclerModel("Youtube","Thanks",2,R.drawable.youtbe));
        rlist.add(new RecyclerModel("Tiktok","See You",4,R.drawable.whatsapp));
        rlist.add(new RecyclerModel("Instagram","nice",5,R.drawable.instagram));
        rlist.add(new RecyclerModel("Whatsapp","wait",6,R.drawable.whatsapp));
        rlist.add(new RecyclerModel("Zoom","ok",3,R.drawable.whatsapp));
        rlist.add(new RecyclerModel("Youtube","Thanks",2,R.drawable.youtbe));
        rlist.add(new RecyclerModel("Tiktok","See You",4,R.drawable.whatsapp));
        rlist.add(new RecyclerModel("Instagram","nice",5,R.drawable.instagram));
        rlist.add(new RecyclerModel("Zoom","ok",3,R.drawable.whatsapp));
        rlist.add(new RecyclerModel("Youtube","Thanks",2,R.drawable.youtbe));
        rlist.add(new RecyclerModel("Tiktok","See You",4,R.drawable.whatsapp));
        rlist.add(new RecyclerModel("Instagram","nice",5,R.drawable.instagram));
        rlist.add(new RecyclerModel("Whatsapp","wait",6,R.drawable.whatsapp));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        RecyclerAdapter adapter=new RecyclerAdapter(this,rlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}