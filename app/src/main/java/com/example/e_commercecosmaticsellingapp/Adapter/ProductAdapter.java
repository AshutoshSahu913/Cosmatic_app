package com.example.e_commercecosmaticsellingapp.Adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.e_commercecosmaticsellingapp.Model.ModelProduct;
import com.example.e_commercecosmaticsellingapp.R;
import com.example.e_commercecosmaticsellingapp.productDetails;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.viewHolder> {
    ArrayList<ModelProduct>list;
    Context context;

    public ProductAdapter(ArrayList<ModelProduct> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item_list,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.viewHolder holder, int position) {
        ModelProduct modelProduct=list.get(position);
//        holder.productImg.setImageResource(modelProduct.getImageUrl());
        // Load the image with Glide and resize
        RequestOptions requestOptions = new RequestOptions()
                .override(100, 100); // Set the target width and height for resizing

        Glide.with(context)
                .load(modelProduct.getImageUrl())
                .apply(requestOptions)  // Apply the RequestOptions for resizing
                .into(holder.productImg);

        holder.productName.setText(modelProduct.getProductName());
        holder.productPrice.setText(modelProduct.getProductPrice());
        holder.productQty.setText(modelProduct.getProductQty());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, productDetails.class);
            intent.putExtra("proImg",modelProduct.getImageUrl());
            intent.putExtra("proName",modelProduct.getProductName());
            intent.putExtra("proPrice",modelProduct.getProductPrice());

            Pair[] pairs = new Pair[1];
//                Pair<View, String> pair = Pair.create(v, "image");
            pairs[0]=new Pair<View,String>(holder.productImg,"image");
            ActivityOptions activityOptions=ActivityOptions.makeSceneTransitionAnimation((Activity) context,pairs);
            context.startActivity(intent,activityOptions.toBundle());
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class viewHolder extends RecyclerView.ViewHolder{

        ImageView productImg;
        TextView productName,productPrice,productQty;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            productImg=itemView.findViewById(R.id.productImg);
            productName=itemView.findViewById(R.id.productName);
            productPrice=itemView.findViewById(R.id.productPrice);
            productQty=itemView.findViewById(R.id.productQty);
        }
    }
}
