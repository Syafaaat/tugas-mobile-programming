package com.example.a2112500620_tugas06_af;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityBujursangka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujursangka);

        EditText etSisi = (EditText) findViewById(R.id.sisi);
        Button Hitung = (Button) findViewById(R.id.hitung);
        TextView Hasil = (TextView) findViewById(R.id.hasil);

        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valSisi = etSisi.getText().toString();
                if(TextUtils.isEmpty(valSisi)){
                    etSisi.setError("di isi dong masa gak");
                }else{
                    double sisi = Double.valueOf(valSisi);
                    double luasPersegi = sisi * sisi;

                    String hasil = "Luas persegi : " + luasPersegi + " cm";
                    Hasil.setText(hasil);
                }

            }
        });

    }
}

