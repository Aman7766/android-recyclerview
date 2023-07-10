package com.amandeep.recyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private ViewModel[] viewModel;

    public MyAdapter(ViewModel[] viewModel)
   {
   this.viewModel=viewModel;
   }
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

       ViewModel viewModel1=viewModel[position];
       holder.textView.setText(viewModel1.getData());
       holder.imageView.setImageResource(viewModel1.getImage());



    }

    @Override
    public int getItemCount() {
        return viewModel.length;
    }


}
