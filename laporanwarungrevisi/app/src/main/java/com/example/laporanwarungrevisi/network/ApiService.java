package com.example.laporanwarungrevisi.network;


import com.example.laporanwarungrevisi.model.ListProdukModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    @GET("read.php")
    Call<ListProdukModel> getProduk();

    @GET("delete.php")
    Call<ListProdukModel> deleteProduk(
            @Query("id") String id
    );

    @FormUrlEncoded
    @POST("add.php")
    Call<ListProdukModel> addNew(
            @Field("nama_produk") String nama,
            @Field("harga") String harga,
            @Field("foto") String foto,
            @Field("stok") String stok

    );

    @FormUrlEncoded
    @POST("update_stok.php")
    Call<ListProdukModel> updateStok(
            @Field("id") String id,
            @Field("stok") String stok
    );

    @FormUrlEncoded
    @POST("update_harga.php")
    Call<ListProdukModel> updateHarga(
            @Field("id") String id,
            @Field("harga") String harga
    );
}
