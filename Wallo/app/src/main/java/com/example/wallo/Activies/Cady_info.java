package com.example.wallo.Activies;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.wallo.R;
import com.squareup.picasso.Picasso;

public class Cady_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cady_info);
        // Geçiş efektleri

        // Intent'ten fotoğraf URL'sini al
        String photoUrl = getIntent().getStringExtra("photo_url");

        // ImageView'i bul ve Picasso ile fotoğrafı yükle
        ImageView imageView = findViewById(R.id.imgactivity);
        Picasso.get().load(photoUrl).into(imageView);
    }
    }
