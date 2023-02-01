package com.example.testuas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HargaSatuanActivity extends AppCompatActivity {

    TextView tvData  ;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData      = findViewById(R.id.tv_data);

        Retrofit retrofit       = new Retrofit.Builder()
                .baseUrl("https://cvsyalsyahsyafaath.000webhostapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        Apiservice apiService = retrofit.create(Apiservice.class);

        Call<List<Getdata>> call = Apiservice.getPost();

        call.enqueue(new Callback<List<Getdata>>() {
            @Override
            public void onResponse(Call<List<Getdata>> call, Response<List<Getdata>> response) {

                if (response.isSuccessful()){

                    List<Getdata> posts = response.body();

                    for (Getdata data : posts){
                        String isidata ="";
                        isidata += "id" + data.getId()+ "\n";
                        isidata += "nama_produk"+ data.getNama_produk()+ "\n";
                        isidata += "foto"+ data.getFoto()+ data.getFoto()+ "\n";
                        isidata += "harga"+ data.getHarga()+ data.getHarga()+ "\n";

                        tvData.append(isidata);




                    }
                    return;
                }
            }

            @Override
            public void onFailure(Call<List<Getdata>> call, Throwable t) {

            }
        });
    }
}