package com.example.assigmant2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Data> dataArrayList = new ArrayList<>();

        Data d1= new Data(R.drawable.images,"PRAWAN","Cost Per Person Rs 200");
        Data d2 = new Data(R.drawable.images2, "AWADHI LUCKNOW_BIRYANI" ,"Cost Per Person Rs 300");
        Data d3 = new Data(R.drawable.images3, "EGGWRAPS" , "Cost Per Person Rs 150");
        Data d4 = new Data(R.drawable.images4,"CHIPS","Cost Per Person R 320");
        Data d5 = new Data(R.drawable.image5,"Chicken Tikka Masala","talian dessert, Zeppole are tiny donuts");
        Data d6 = new Data(R.drawable.image6,"Easy Halva","for serving with coffee for a midmorning pastry break, or w");
        Data d7 = new Data(R.drawable.image7,"Zeppole"," new to deep-frying");

        dataArrayList.add(d1);
        dataArrayList.add(d2);
        dataArrayList.add(d3);
        dataArrayList.add(d4);
        dataArrayList.add(d5);
        dataArrayList.add(d6);
        dataArrayList.add(d7);
        dataArrayList.add(d4);

        RecyclerViewAdapter rv = new RecyclerViewAdapter(dataArrayList,this);
        RecyclerView.LayoutManager manage = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manage); // Quas
        recyclerView.setAdapter(rv);
    }
}