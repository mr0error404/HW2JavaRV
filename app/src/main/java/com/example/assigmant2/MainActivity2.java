package com.example.assigmant2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageView image1;
    TextView txt1t,txt2t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        image1 = findViewById(R.id.imageView2);
        txt1t = findViewById(R.id.textView4);
        txt2t = findViewById(R.id.textView5);

        Intent intent = getIntent();

        int image = intent.getIntExtra("foodImage", 0);
        String txt1 = intent.getStringExtra("foodName");
        String txt2= intent.getStringExtra("foodDetiles");

        image1.setImageResource(image);
        txt1t.setText(txt1);
        txt2t.setText(txt2);
    }
}