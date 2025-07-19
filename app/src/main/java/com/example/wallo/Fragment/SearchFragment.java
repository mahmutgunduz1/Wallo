package com.example.wallo.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.wallo.Adapter.HorizontalAdapter;
import com.example.wallo.Adapter.HorizontalAdapter2;
import com.example.wallo.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

public class SearchFragment extends Fragment {

    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> urlla = new ArrayList<>();
    private ArrayList<String> txtHorizontal = new ArrayList<>();
    private ArrayList<String> imgHorizontal = new ArrayList<>();

    private RecyclerView featuredRecyclerView;
    private RecyclerView collectionsGrid;
    private ExtendedFloatingActionButton fabFilter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim = inflater.inflate(R.layout.fragment_search, container, false);
        
        // View'ları bağla
        featuredRecyclerView = tasarim.findViewById(R.id.featuredRecyclerView);
        collectionsGrid = tasarim.findViewById(R.id.collectionsGrid);
        fabFilter = tasarim.findViewById(R.id.fabFilter);

        // FAB tıklama olayı
        fabFilter.setOnClickListener(v -> {
            // Filtre işlemleri burada yapılacak
        });

        initRecyclerViews();
        getImages();
        return tasarim;
    }

    private void getImages() {
        // Mevcut resim URL'leri
        urlla.add("https://http.cat/images/200.jpg");
        name.add("Havasu Falls");
        imgHorizontal.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrmojuD-xMi5uPUpCwC6b-Z0dFubMSpZXRAA&s");
        txtHorizontal.add("Havasu Falls");

        urlla.add("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1200px-Cat03.jpg");
        name.add("Trondheim");
        imgHorizontal.add("https://static.boredpanda.com/blog/wp-content/uploads/2018/04/5acb63d83493f__700-png.jpg");
        txtHorizontal.add("Trondheim");

        urlla.add("https://www.argospetinsurance.co.uk/assets/uploads/2017/12/cat-pet-animal-domestic-104827.jpeg");
        name.add("Portugal");
        imgHorizontal.add("https://www.cats.org.uk/uploads/images/featurebox_sidebar_kids/grief-and-loss.jpg");
        txtHorizontal.add("Portugal");

        urlla.add("https://i.ytimg.com/vi/R81pgRSQ2XQ/maxresdefault.jpg");
        name.add("National Park");
        imgHorizontal.add("https://www.petmd.com/sites/default/files/cat-flea-vaccine_0.jpg");
        txtHorizontal.add("National Park");

        urlla.add("https://i.ytimg.com/vi/cNycdfFEgBc/maxresdefault.jpg");
        name.add("Mahahual");
        imgHorizontal.add("https://cdn.arstechnica.net/wp-content/uploads/2017/06/Fotolia_58941902_Subscription_Monthly_M.jpg");
        txtHorizontal.add("Mahahual");

        // Diğer resimler...
    }

    private void initRecyclerViews() {
        // Featured RecyclerView ayarları
        LinearLayoutManager featuredLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        featuredRecyclerView.setLayoutManager(featuredLayoutManager);
        HorizontalAdapter featuredAdapter = new HorizontalAdapter(getContext(), name, urlla);
        featuredRecyclerView.setAdapter(featuredAdapter);

        // Collections Grid ayarları
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        collectionsGrid.setLayoutManager(gridLayoutManager);
        HorizontalAdapter2 gridAdapter = new HorizontalAdapter2(getContext(), txtHorizontal, imgHorizontal);
        collectionsGrid.setAdapter(gridAdapter);
    }
}