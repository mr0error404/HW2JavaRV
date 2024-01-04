package com.example.assigmant2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<DataVH> {

    ArrayList<Data> list;
    private Context context;

    public RecyclerViewAdapter(ArrayList<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public DataVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_desgin,parent,false);
        DataVH dataVH = new DataVH (view1);
        return dataVH;
    }

    @Override
    public void onBindViewHolder(@NonNull DataVH holder, @SuppressLint("RecyclerView") int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.txt1.setText(list.get(position).getfName());
        holder.txt2.setText(list.get(position).getDetiles());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Data item = list.get(position);
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("foodName", item.getfName());
                intent.putExtra("foodDetiles", item.getDetiles());
                intent.putExtra("foodImage", item.getImage());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
