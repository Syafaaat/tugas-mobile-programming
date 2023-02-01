package com.example.aplikasiuas;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("posts")
    static Call<List<Getdata>> getPost() {
        return null;
    }
}