package com.example.wallo;

import com.example.wallo.Models.WalloModels;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WalloService {


    @GET("images/search?limit=10")
    Call<List<WalloModels>> getdata();
//Call<List<WalloModels>> getdata();: getdata() metodunun dönüş tipi Call<List<WalloModels>> olarak belirtilmiş
// . Bu, Retrofit tarafından sunulan Call interface'ini kullanarak API isteği yapılacağını ve geri dönüş olarak List<WalloModels>
// tipinde bir liste alınacağını gösterir.
// WalloModels
// ise API'den dönen verilerin modelini temsil eden bir sınıf veya veri yapısıdır.
}
