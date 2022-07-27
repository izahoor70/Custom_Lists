package com.example.customlists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    ArrayList<RecyclerModel> rlist;

    public RecyclerAdapter(Context context, ArrayList<RecyclerModel> rlist) {
        this.context = context;
        this.rlist = rlist;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.custom_listview,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

         String name=rlist.get(position).getName();
         String msg=rlist.get(position).getMsg();
         int utime =rlist.get(position).getTime();
         int uimage=rlist.get(position).getImage();

         holder.setData(name,msg,utime,uimage);
    }

    @Override
    public int getItemCount() {
        return rlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView txtname,txtmsg,txttime;
        CircularImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtname = itemView.findViewById(R.id.username);
            txtmsg = itemView.findViewById(R.id.usermsg);
            txttime = itemView.findViewById(R.id.usertime);
            img = itemView.findViewById(R.id.userimg);

            itemView.setOnClickListener(this);
        }

        public void setData(String name, String msg, int utime, int uimage) {

            txtname.setText(name);
            txtmsg.setText(msg);
            txttime.setText(String.valueOf(utime));
            img.setImageResource(uimage);



        }

        @Override
        public void onClick(View view) {
            Toast.makeText(context, "Working", Toast.LENGTH_SHORT).show();
        }
    }
}
