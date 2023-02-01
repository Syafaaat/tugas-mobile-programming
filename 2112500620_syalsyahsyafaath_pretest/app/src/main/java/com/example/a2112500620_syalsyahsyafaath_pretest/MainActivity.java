package com.example.a2112500620_syalsyahsyafaath_pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Skrpisi(View view) {
        startActivity(new Intent(MainActivity.this, perbaikanactivity.class));
    }

    public void KKP(View view) {
        startActivity(new Intent(MainActivity.this, perbaikanactivity.class));
    }

    public void Nilai(View view) {
        startActivity(new Intent(MainActivity.this, nilaiactivity.class));

    }

    public void Jurusan(View view) {
        startActivity(new Intent(MainActivity.this, jurusanActivity.class));
    }

    public void datamhs(View view) {
        startActivity(new Intent(MainActivity.this, mahasiswaactivity.class));
    }

    public void MataKuliah(View view) {
        startActivity(new Intent(MainActivity.this, matakuliahactivity.class));
    }
}