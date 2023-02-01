package com.example.utstipebgenap_2112500620_syalsyahsyafaath_af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KantinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kantin);
    }

    public void khususmahasiswa(View view) {
        startActivity(new Intent(KantinActivity.this, MenuMakananActivity.class));
    }

    public void khususdosen(View view) {
        startActivity(new Intent(KantinActivity.this, menudosen.class));
    }

    public void khusustaff(View view) {
        startActivity(new Intent(KantinActivity.this, menustaff.class));
    }
}