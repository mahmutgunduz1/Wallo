package com.example.wallo.Adapter;

import static android.system.Os.bind;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.transition.Fade;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallo.Activies.Cady_info;
import com.example.wallo.Models.NameModel;
import com.example.wallo.Models.WalloModels;
import com.example.wallo.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.RowHolder> {

     public  ArrayList<WalloModels> walloModels;
     Context context;

    public PhotoAdapter(ArrayList<WalloModels> walloModels, Context context) {
        this.walloModels = walloModels;
        this.context = context;
    }

    @NonNull
    @Override
    public PhotoAdapter.RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_row_photo, parent, false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoAdapter.RowHolder holder, int position) {
        WalloModels selectModel= walloModels.get(position);

        holder.bind(walloModels.get(position),position);

        holder.img.setOnClickListener(v -> {
            Intent intent = new Intent(context, Cady_info.class);
            intent.putExtra("photo_url", selectModel.url);


            // Intent'i başlatma
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return walloModels.size();
    }


    public class RowHolder extends RecyclerView.ViewHolder {

        TextView txt;
        ImageView img;

        public RowHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.img);


        }
/*
        public void bind(WalloModels models,Integer position){
            txt.setText("id :"+models.results);


            String imageUrl = models.picture.medium;

        Picasso.get().load(imageUrl).into(img);




        }*/



 /*       public void bind(WalloModels models, Integer position) {
            // Eğer models null değilse ve results dizisi doluysa
            if (models != null && models.results != null && models.results.length > 0) {
                // İlk sonuç üzerinden NameModel'e erişim sağlamak için:
                NameModel nameModel = models.results[position].name;

                // NameModel null değilse isim bilgilerini göster
                if (nameModel != null) {
                    String fullName = nameModel.first + " " + nameModel.last;
                    txt.setText("Name: " + fullName);
                } else {
                    txt.setText("Name: Not available");
                }
            } else {
                txt.setText("Name: Not available");
            }


                // Şimdi de PhotoModel'den resmi yüklemek için:
            if (models != null && models.picture != null) {



                String imageUrl = models.picture.medium;

                // Picasso kütüphanesi ile resmi yükleme
                Picasso.get().load(imageUrl).into(img);
            } else {
                // Resim yoksa veya model boşsa varsayılan bir resim gösterilebilir
                System.out.println("null");
                img.setImageResource(R.drawable.picture);
            }
        }*/


        public void bind(WalloModels walloModels1,Integer position){


            String imageUrl = walloModels1.url;

            Picasso.get()
                    .load(imageUrl)
                    .resize(100, 100) // Sabit genişlik ve yükseklik
                    .centerCrop()
                    .into(img);


        }



    }





}
