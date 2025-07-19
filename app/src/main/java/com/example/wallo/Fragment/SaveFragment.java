package com.example.wallo.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.wallo.R;

public class SaveFragment extends Fragment {
    private ExtendedFloatingActionButton fabAdd;
    private RecyclerView savedWallpapersGrid;
    private ConstraintLayout emptyStateLayout;
    private MaterialButton exploreButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim = inflater.inflate(R.layout.fragment_save, container, false);
        
        // View'ları bağla
        fabAdd = tasarim.findViewById(R.id.fabAdd);
        savedWallpapersGrid = tasarim.findViewById(R.id.savedWallpapersGrid);
        emptyStateLayout = tasarim.findViewById(R.id.emptyStateLayout);
        exploreButton = tasarim.findViewById(R.id.exploreButton);

        // Grid Layout Manager ayarla
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        savedWallpapersGrid.setLayoutManager(gridLayoutManager);

        // Boş durum kontrolü (örnek olarak)
        showEmptyState(true);

        // Click Listeners
        fabAdd.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Yeni duvar kağıdı ekle", Toast.LENGTH_SHORT).show();
            // TODO: Yeni duvar kağıdı ekleme işlemleri
        });

        exploreButton.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Duvar kağıtlarını keşfet", Toast.LENGTH_SHORT).show();
            // TODO: Keşfet sayfasına yönlendirme
        });

        return tasarim;
    }

    // Boş durum görünümünü kontrol etme metodu
    private void showEmptyState(boolean isEmpty) {
        if (isEmpty) {
            emptyStateLayout.setVisibility(View.VISIBLE);
            savedWallpapersGrid.setVisibility(View.GONE);
        } else {
            emptyStateLayout.setVisibility(View.GONE);
            savedWallpapersGrid.setVisibility(View.VISIBLE);
        }
    }
}