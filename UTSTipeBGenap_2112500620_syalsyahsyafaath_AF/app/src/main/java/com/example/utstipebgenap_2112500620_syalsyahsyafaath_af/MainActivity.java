package com.example.utstipebgenap_2112500620_syalsyahsyafaath_af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void facebook(View view) {
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/budiluhur.ac.id/"));
        startActivity(implicit);
    }

    public void instagram(View view) {
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/kampusbudiluhur/"));
        startActivity(implicit);
    }

    public void Twitter(View view) {
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/kampusbudiluhur"));
        startActivity(implicit);
    }

    public void Kampus(View view) {
        Intent intent = new Intent(MainActivity.this, KampusActivity.class);
        startActivity(intent);
    }

    public void Kantin(View view) {
        Intent intent = new Intent(MainActivity.this, KantinActivity.class);
        startActivity(intent);
    }
}