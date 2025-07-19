package com.example.wallo.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.wallo.Adapter.PhotoAdapter;
import com.example.wallo.Adapter.SwapeAdapter;
import com.example.wallo.Models.WalloModels;
import com.example.wallo.R;
import com.example.wallo.WalloService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yalantis.library.Koloda;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class CategoriesFragment extends Fragment {
    public SwapeAdapter swapeAdapter;
    public ListView listView;
    public List<WalloModels> dataList;



    private static final String BASE_URL="https://api.thecatapi.com/v1/";
    Retrofit retrofit;
    Koloda koloda;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim=inflater.inflate(R.layout.fragment_categories, container, false);


    koloda=tasarim.findViewById(R.id.koloda);
        dataList = new ArrayList<>();





      swapeAdapter= new SwapeAdapter(getContext(),dataList);
        koloda.setAdapter(swapeAdapter);

        Gson gson= new GsonBuilder().setLenient().create();

        retrofit= new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        loadData();


        return tasarim;
    }

    private void loadData(){
        WalloService walloService = retrofit.create(WalloService.class);
        Call<List<WalloModels>> call = walloService.getdata();



        call.enqueue(new Callback<List<WalloModels>>() {
            @Override
            public void onResponse(Call<List<WalloModels>> call, Response<List<WalloModels>> response) {
                if (response.isSuccessful()){
                    dataList.addAll(response.body());
                    swapeAdapter.notifyDataSetChanged();



        /*    for (WalloModels walloModelss:walloModelsArrayList){

                System.out.println(walloModelss.results);
                System.out.println(walloModelss.picture);
            }*/


                }



            }
            @Override
            public void onFailure(Call<List<WalloModels>> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}