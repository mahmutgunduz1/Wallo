package com.example.wallo.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wallo.Adapter.PhotoAdapter;
import com.example.wallo.Models.NameModel;
import com.example.wallo.Models.ResultsModel;
import com.example.wallo.Models.WalloModels;
import com.example.wallo.R;
import com.example.wallo.WalloService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class PhotosFragment extends Fragment {
        ArrayList<WalloModels> walloModelsArrayList;
        private static final String BASE_URL="https://api.thecatapi.com/v1/";
        Retrofit retrofit;
        RecyclerView rcv;

      PhotoAdapter photoAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim=inflater.inflate(R.layout.fragment_photos, container, false);


        rcv=tasarim.findViewById(R.id.rcv);



// key   ndPKHElqamW1BvPSJqq3Mxkomjrh-uyFmD1AjhF1-hk
        //  M-QCuH35G8TFitiVjajvvEkwdhp6V3eg0K5ezx1JUO8

        Gson gson= new GsonBuilder().setLenient().create();

       retrofit= new Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addConverterFactory(GsonConverterFactory.create(gson))
               .build();

        loadData();

        return  tasarim;


    }


    private void loadData(){


        WalloService walloService= retrofit.create(WalloService.class);

      Call<List<WalloModels>> call= walloService.getdata();

      call.enqueue(new Callback<List<WalloModels>>() {
          @Override
          public void onResponse(Call<List<WalloModels>> call, Response<List<WalloModels>> response) {
            if (response.isSuccessful()){


            List<WalloModels> responseList=response.body();
            walloModelsArrayList =new ArrayList<>(responseList);

        /*    for (WalloModels walloModelss:walloModelsArrayList){

                System.out.println(walloModelss.results);
                System.out.println(walloModelss.picture);
            }*/


                // Adapter'i RecyclerView'e bağlayın
                photoAdapter = new PhotoAdapter(walloModelsArrayList,getContext());
                rcv.setAdapter(photoAdapter);
                int spanCount = 2;
                rcv.setLayoutManager(new GridLayoutManager(requireContext(), spanCount));


            }



          }
          @Override
          public void onFailure(Call<List<WalloModels>> call, Throwable t) {
            t.printStackTrace();
          }
      });

    }
}