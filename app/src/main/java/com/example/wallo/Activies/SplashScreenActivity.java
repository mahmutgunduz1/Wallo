package com.example.wallo.Activies;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.example.wallo.R;
import com.squareup.picasso.Picasso;

public class SplashScreenActivity extends AppCompatActivity {

    private LottieAnimationView lottieAnimationView;

    private ImageView imgg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);
        imgg = findViewById(R.id.imgg);

        int resourceId = getResources().getIdentifier("wallocat2", "raw", getPackageName());
        imgg.setImageResource(resourceId);

        Handler h = new Handler();
        h.postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000);

    }
}