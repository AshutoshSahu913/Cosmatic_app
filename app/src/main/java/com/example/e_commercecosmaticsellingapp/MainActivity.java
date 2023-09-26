package com.example.e_commercecosmaticsellingapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_commercecosmaticsellingapp.Adapter.CategoryAdapter;
import com.example.e_commercecosmaticsellingapp.Adapter.ProductAdapter;
import com.example.e_commercecosmaticsellingapp.Model.ModelCategory;
import com.example.e_commercecosmaticsellingapp.Model.ModelProduct;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCategory, rvProduct;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*      This for Category RecyclerView*/
        rvCategory = findViewById(R.id.rvCategory);
        ArrayList<ModelCategory> list = new ArrayList<>();
        list.add(new ModelCategory(1, "Trending"));
        list.add(new ModelCategory(2, "Most Popular"));
        list.add(new ModelCategory(3, "All Body Products"));
        list.add(new ModelCategory(4, "Skin Care"));
        list.add(new ModelCategory(5, "Hair Care"));
        list.add(new ModelCategory(6, "Make up"));
        list.add(new ModelCategory(7, "Fragrance"));

        CategoryAdapter categoryAdapter = new CategoryAdapter(list, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvCategory.setAdapter(categoryAdapter);
        rvCategory.setLayoutManager(linearLayoutManager);

        rvProduct = findViewById(R.id.rvProduct);
        ArrayList<ModelProduct> list1 = new ArrayList<>();
        list1.add(new ModelProduct(1, "Japanese Cherry Blossom", "250 ml", "₹299", R.drawable.prod));
        list1.add(new ModelProduct(1, "The Body Shop", "250 ml", "₹199", R.drawable.image1));
        list1.add(new ModelProduct(1, "Long lasting Foundation", "250 ml", "₹99", R.drawable.img));
        list1.add(new ModelProduct(1, "Long lasting Matte perfection", "100 ml", "₹109", R.drawable.img_1));
        list1.add(new ModelProduct(1, "Foundation", "150 ml", "₹199", R.drawable.img));
        list1.add(new ModelProduct(1, "Japanese Cherry Blossom", "250 ml", "₹99", R.drawable.prod));

        list1.add(new ModelProduct(1, "Japanese Cherry Blossom", "250 ml", "₹299", R.drawable.prod));
        list1.add(new ModelProduct(1, "The Body Shop", "250 ml", "₹199", R.drawable.image1));
        list1.add(new ModelProduct(1, "Long lasting Foundation", "250 ml", "₹99", R.drawable.img));
        list1.add(new ModelProduct(1, "Long lasting Matte perfection", "100 ml", "₹109", R.drawable.img_1));
        list1.add(new ModelProduct(1, "Foundation", "150 ml", "₹199", R.drawable.img));
        list1.add(new ModelProduct(1, "Japanese Cherry Blossom", "250 ml", "₹99", R.drawable.prod));

        ProductAdapter productAdapter = new ProductAdapter(list1, this);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvProduct.setLayoutManager(linearLayoutManager1);
        rvProduct.setAdapter(productAdapter);
    }
}