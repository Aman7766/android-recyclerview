package com.amandeep.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //1
    RecyclerView recyclerView;
    //2
    ViewModel[] viewModels;
    //3
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1.1
        recyclerView=findViewById(R.id.rv);
        //2.2
        viewModels=new ViewModel[7];
        viewModels[0]=new ViewModel(R.drawable.burger,"Burger");
        viewModels[1]=new ViewModel(R.drawable.cake,"Cake");
        viewModels[2]=new ViewModel(R.drawable.fries,"Fries");
        viewModels[3]=new ViewModel(R.drawable.maggi,"Maggi");
        viewModels[4]=new ViewModel(R.drawable.pancake,"Pancake");
        viewModels[5]=new ViewModel(R.drawable.pasta,"Pasta");
        viewModels[6]=new ViewModel(R.drawable.pizza,"Pizza");

        //3.1
        myAdapter=new MyAdapter(viewModels);
        recyclerView.setAdapter(myAdapter);

        //4
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);

    }
}