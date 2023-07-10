package com.amandeep.recyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //1
        Context context=parent.getContext();
        //2
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        //3
        View itemview = layoutInflater.inflate(R.layout.recylerview_item,parent,false);
        //4
        return new MyViewHolder(itemview);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
