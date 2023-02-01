package com.example.a2112500620_tugas06_af;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivitySegitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        EditText alas = (EditText) findViewById(R.id.Alas);
        EditText tinggi = (EditText) findViewById(R.id.Tinggi);
        Button hitung = (Button) findViewById(R.id.hitung);
        TextView hasil = (TextView) findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valAlas = alas.getText().toString();
                String valTinggi = tinggi.getText().toString();

                if(TextUtils.isEmpty(valAlas)){
                    alas.setError("Alas tidak boleh kosong");
                }else if(TextUtils.isEmpty(valTinggi)){
                    tinggi.setError("Tinggi tidak boleh kosong");
                }else{
                    double alas = Double.valueOf(valAlas);
                    double tinggi = Double.valueOf(valTinggi);
                    double luas = alas * tinggi / 2;

                    hasil.setText("Luas segitiga : " + String.valueOf(luas));
                }
            }
        });
    }
}
