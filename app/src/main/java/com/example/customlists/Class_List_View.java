package com.example.customlists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class Class_List_View extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView list;
    ArrayList<ListModel> mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_list_view);

        list = findViewById(R.id.uslist);
        mylist = new ArrayList<>();

        mylist.add(new ListModel("Zoom","ok",3,R.drawable.whatsapp));
        mylist.add(new ListModel("Youtube","Thanks",2,R.drawable.youtbe));
        mylist.add(new ListModel("Tiktok","See You",4,R.drawable.whatsapp));
        mylist.add(new ListModel("Instagram","nice",5,R.drawable.instagram));
        mylist.add(new ListModel("Whatsapp","wait",6,R.drawable.whatsapp));

        ListAdapter adapter = new ListAdapter(this,mylist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(Class_List_View.this, "Working", Toast.LENGTH_SHORT).show();
    }

}