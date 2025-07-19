package com.example.wallo.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallo.Activies.Cady_info;
import com.example.wallo.Models.WalloModels;
import com.example.wallo.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.RowHolder> {

    private ArrayList<WalloModels> walloModels;
    private Context context;

    public PhotoAdapter(ArrayList<WalloModels> walloModels, Context context) {
        this.walloModels = walloModels;
        this.context = context;
    }

    // Boş constructor - test için
    public PhotoAdapter() {
        this.walloModels = new ArrayList<>();
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_row_photo, parent, false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        if (walloModels != null && position < walloModels.size()) {
            WalloModels model = walloModels.get(position);
            holder.bind(model);
        }
    }

    @Override
    public int getItemCount() {
        return walloModels != null ? walloModels.size() : 0;
    }

    public void updateData(ArrayList<WalloModels> newData) {
        this.walloModels = newData;
        notifyDataSetChanged();
    }

    public class RowHolder extends RecyclerView.ViewHolder {
        private final ImageView imageView;
        private final TextView titleText;
        private final ImageButton saveButton;

        public RowHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titleText = itemView.findViewById(R.id.titleText);
            saveButton = itemView.findViewById(R.id.saveButton);
        }

        public void bind(WalloModels model) {
            if (model != null && model.url != null && !model.url.isEmpty()) {
                // Resmi yükle
                Picasso.get()
                    .load(model.url)
                    .fit()
                    .centerCrop()
                    .into(imageView);

                // Başlığı ayarla (eğer varsa)
                if (model.title != null) {
                    titleText.setText(model.title);
                    titleText.setVisibility(View.VISIBLE);
                } else {
                    titleText.setVisibility(View.GONE);
                }

                // Resme tıklama
                imageView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, Cady_info.class);
                    intent.putExtra("photo_url", model.url);
                    context.startActivity(intent);
                });

                // Kaydet butonuna tıklama
                saveButton.setOnClickListener(v -> {
                    // TODO: Kaydetme işlemini implement et
                });
            }
        }
    }
}
