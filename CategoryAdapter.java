package com.example.finalproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.finalproject.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.VerticalViewHolder>{
  private  List<Category> categories;
  private Context context;
  Bitmap bitmap;


    public static class VerticalViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout verticalLayout;
         TextView regularPrice,regularName;
         ImageView regularimage;

         public VerticalViewHolder(View itemView){
             super(itemView);

             regularimage=itemView.findViewById(R.id.imgnew);
             regularName=itemView.findViewById(R.id.txnew0);
             regularPrice=itemView.findViewById(R.id.txnew1);

             verticalLayout=itemView.findViewById(R.id.category);
         }
    }
    public CategoryAdapter(List<Category> categories, int vertical_recyclerview, Context context) {

        this.context=context;
        this.categories=categories;

    }
@NonNull
@Override
    public CategoryAdapter.VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType)
{
    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.content_cake,parent,false);
    return new CategoryAdapter.VerticalViewHolder(view);
}

    @Override
    public int getItemCount() {
        return categories.size();
    }

    @Override
    public void onBindViewHolder(@NonNull final VerticalViewHolder holder, final int position) {

        holder.regularName.setText(categories.get(position).getName());
        holder.regularPrice.setText(categories.get(position).getPrice());
        Glide.with(context).load(categories.get(position).getImage()).centerCrop().into(holder.regularimage);


    }
}
