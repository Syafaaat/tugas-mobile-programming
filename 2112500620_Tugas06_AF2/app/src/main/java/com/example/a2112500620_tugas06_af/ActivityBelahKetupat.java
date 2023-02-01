package com.example.a2112500620_tugas06_af;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityBelahKetupat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat);

        EditText diagonal1 = (EditText) findViewById(R.id.diagonal1);
        EditText diagonal2 = (EditText) findViewById(R.id.diagonal2);
        Button hitung = (Button) findViewById(R.id.hitung);
        TextView Hasil = (TextView) findViewById(R.id.Hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valdiagonal1 = diagonal1.getText().toString();
                String valdiagonal2 = diagonal2.getText().toString();
                if (TextUtils.isEmpty(valdiagonal1)) {
                    diagonal1.setError("Di isi dong masa gak");
                } else if (TextUtils.isEmpty(valdiagonal2)) {
                    diagonal2.setError("Di isi dong masa gak");
                } else {
                    double diagonal1 = Double.valueOf(valdiagonal1);
                    double diagonal2 = Double.valueOf(valdiagonal2);
                    double luasketupat = 0.5 * diagonal1 * diagonal2;

                    String hasilketupat = "Luas layang layang: " + String.valueOf(luasketupat) + " cm";
                    Hasil.setText(hasilketupat);
                }
            }
        });
    }
}
