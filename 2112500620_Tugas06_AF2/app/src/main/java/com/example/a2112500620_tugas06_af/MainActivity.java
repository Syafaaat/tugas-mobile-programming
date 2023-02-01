package com.example.a2112500620_tugas06_af;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are You want to exit?")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No",null)
                .show();
    }

    public void segitiga(View view) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.logoapk)
                .setMessage("Yakin ingin menghitung luas segitiga ini?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, ActivitySegitiga.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void persegipanjang(View view) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.logoapk)
                .setMessage("Yakin ingin menghitung luas persegi panjang ini?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, ActivityPersegiPanjang.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void bujur(View view) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.logoapk)
                .setMessage("Yakin mau hitung luas bujur sangkar ini?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, ActivityBujursangka.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();

    }

    public void lingkaran(View view) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.logoapk)
                .setMessage("Yakin mau hitung luas lingkaran ini?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, Activitylingkaran.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void layang(View view) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.logoapk)
                .setMessage("Yakin mau hitung luas layang layang ini ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, ActivityLayangLayang.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void ketupat(View view) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.logoapk)
                .setMessage("Yakin mau hitung luas Belah ketupat ini ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, ActivityBelahKetupat.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}

