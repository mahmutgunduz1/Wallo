package com.example.wallo.Adapter;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.viewpager.widget.ViewPager;

import com.example.wallo.Fragment.SaveFragment;
import com.example.wallo.Models.WalloModels;
import com.example.wallo.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SwapeAdapter extends BaseAdapter {
    private Context context;
    private List<WalloModels> datalist;
    public ImageView saveButton;
    public ImageView likeButton;
    public ImageView closeButton;
    public ViewPager viewPager;

    public SwapeAdapter(Context context, List<WalloModels> datalist) {
        this.context = context;
        this.datalist = datalist;
    }

    @Override
    public int getCount() {
        return datalist.size();
    }

    @Override
    public Object getItem(int position) {
        return datalist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder holder;
        holder = new ViewHolder();




        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_koloda, parent, false);
            closeButton = view.findViewById(R.id.closeButton);
            likeButton = view.findViewById(R.id.likeButton);
            saveButton = view.findViewById(R.id.saveButton);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.imagee9);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }


        WalloModels item = datalist.get(position);
        Picasso.get().load(item.url).into(holder.imageView);

        closeButton.setOnClickListener(v ->

                Toast.makeText(context,"asdassddas",Toast.LENGTH_LONG).show());

        return view;
    }

    static class ViewHolder {

        com.google.android.material.imageview.ShapeableImageView imageView;
    }
}
