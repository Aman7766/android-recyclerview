package com.amandeep.recyclerviewapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=(ImageView) itemView.findViewById(R.id.imageView);
        textView=(TextView) itemView.findViewById(R.id.tv);
    }
}
