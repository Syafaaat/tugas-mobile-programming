package com.example.a2112500620_tugas06_af;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activitylingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylingkaran);

        EditText jari = (EditText) findViewById(R.id.jari);
        Button hitung = (Button) findViewById(R.id.hitung);
        TextView Hasil = (TextView) findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valjari = jari.getText().toString();
                if(TextUtils.isEmpty(valjari)){
                    jari.setError("di isi dong masa gak");
                }else{
                    double phi = 3.14;
                    double jari = Double.valueOf(valjari);
                    double luaslingkaran = phi * (jari * jari);

                    String hasil = "Luas lingkaran : " + luaslingkaran + " cm";
                    Hasil.setText(hasil);
                }

            }
        });

    }
    }
