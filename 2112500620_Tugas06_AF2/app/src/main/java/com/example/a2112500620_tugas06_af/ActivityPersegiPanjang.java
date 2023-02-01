package com.example.a2112500620_tugas06_af;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityPersegiPanjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        EditText panjang = (EditText) findViewById(R.id.panjang);
        EditText lebar = (EditText) findViewById(R.id.lebar);
        Button hitung = (Button) findViewById(R.id.hitung);
        TextView hasil = (TextView) findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valpanjang = panjang.getText().toString();
                String vallebar = lebar.getText().toString();
                if (TextUtils.isEmpty(valpanjang)) {
                    panjang.setError("Di isi dong masa gak");
                } else if (TextUtils.isEmpty(vallebar)) {
                    lebar.setError("Di isi dong masa gak");
                } else {
                    double panjang = Double.valueOf(valpanjang);
                    double lebar = Double.valueOf(vallebar);
                    double luasPersegi = panjang * lebar;

                    String hasilsegitiga = "Luas persegi panjang : " + String.valueOf(luasPersegi) + " cm";
                    hasil.setText(hasilsegitiga);
                    }
                }
            });
        }
    }


