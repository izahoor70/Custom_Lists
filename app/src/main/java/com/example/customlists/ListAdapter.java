package com.example.customlists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList<ListModel> mylist;

    public ListAdapter(Context context, ArrayList<ListModel> mylist) {
        this.context = context;
        this.mylist = mylist;
    }



    @Override
    public int getCount() {
        return mylist.size();
    }

    @Override
    public Object getItem(int i) {
        return mylist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.custom_listview,viewGroup,false);

        String name = mylist.get(i).getName();
        String msg = mylist.get(i).getMessage();
        int time = mylist.get(i).getTime();

        int img = mylist.get(i).getImage();


        TextView txtname,txtmsg,txttime;
        CircularImageView uimg;

        txtname = view.findViewById(R.id.username);
        txtmsg = view.findViewById(R.id.usermsg);
        txttime = view.findViewById(R.id.usertime);

        uimg = view.findViewById(R.id.userimg);

        txtname.setText(name);
        txtmsg.setText(msg);
        txttime.setText(String.valueOf(time));

        uimg.setImageResource(img);

        return view;
    }
}
