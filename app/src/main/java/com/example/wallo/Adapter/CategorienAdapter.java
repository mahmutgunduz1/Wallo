package com.example.wallo.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallo.Models.CategoriesModel;
import com.example.wallo.R;

import java.util.ArrayList;



public class CategorienAdapter extends RecyclerView.Adapter<CategorienAdapter.RowHolder> {
    ArrayList<CategoriesModel> categoriesModels;

    public CategorienAdapter(ArrayList<CategoriesModel> categoriesModels) {
        this.categoriesModels = categoriesModels;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return categoriesModels.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;
        public RowHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
        }
    }
}
