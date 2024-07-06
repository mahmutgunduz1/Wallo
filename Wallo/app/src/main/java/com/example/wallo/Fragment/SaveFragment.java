package com.example.wallo.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.wallo.R;


public class SaveFragment extends Fragment {
    private ImageView add;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim= inflater.inflate(R.layout.fragment_save, container, false);
        add=tasarim.findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "başka bir zaman en güzel halinde ...", Toast.LENGTH_SHORT).show();
            }
        });
        return tasarim;
    }
}