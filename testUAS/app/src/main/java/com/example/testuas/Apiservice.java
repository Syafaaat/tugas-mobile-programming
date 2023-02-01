package com.example.testuas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apiservice {

    @GET("posts")
    static Call<List<Getdata>> getPost() {
        return null;
    }

}
