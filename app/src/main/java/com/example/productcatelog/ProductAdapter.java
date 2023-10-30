package com.example.productcatelog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Context context;
    ArrayList<Product> products;

    public ProductAdapter(Context context , ArrayList<Product>products){
        this.context = context;
        this.products = products;

    }
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview,parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product b = products.get(position);
        holder.bTitle.setText(b.title);
        holder.bImage.setImageResource(b.image);

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView bTitle;
        ImageView bImage;


        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            bTitle = itemView.findViewById(R.id.productTitle);
            bImage = itemView.findViewById(R.id.productImage);
        }
    }

}
