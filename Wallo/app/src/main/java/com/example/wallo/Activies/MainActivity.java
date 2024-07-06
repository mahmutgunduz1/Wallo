package com.example.wallo.Activies;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.os.Handler;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.wallo.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNav;
    private static int SPLASE_TİME_OUT =4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        setupBottomNavigationWithNavController();
    }


    public void setupBottomNavigationWithNavController(){

        bottomNav=findViewById(R.id.bottomNov);
        NavHostFragment navHostFragment=
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        NavigationUI.setupWithNavController(bottomNav,navHostFragment.getNavController());



    }
}