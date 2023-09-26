package com.example.e_commercecosmaticsellingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class productDetails extends AppCompatActivity {
    ImageView backBtn;
    ImageView pImg;
    TextView pName, pPrice, pQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        backBtn = findViewById(R.id.backBtn);
        pName = findViewById(R.id.productDetailsName);
        pPrice = findViewById(R.id.productDetailsPrice);
        pQty = findViewById(R.id.productDetailsCount);
        pImg = findViewById(R.id.productDetailsImg);

        int image = getIntent().getIntExtra("proImg", 0);
        String name = getIntent().getStringExtra("proName");
        String price = getIntent().getStringExtra("proPrice");
        pImg.setImageResource(image);
        pName.setText(name);
        pPrice.setText(price);

        backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}