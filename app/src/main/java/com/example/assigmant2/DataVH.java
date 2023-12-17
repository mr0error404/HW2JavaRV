package com.example.assigmant2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataVH extends RecyclerView.ViewHolder {

    ImageView image;
    TextView txt1,txt2;
    public DataVH(@NonNull View itemView) {
        super(itemView);

        image=itemView.findViewById(R.id.imageView);
        txt1=itemView.findViewById(R.id.textView2);
        txt2=itemView.findViewById(R.id.textView3);
    }
}
