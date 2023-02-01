package com.example.a2112500620_syalsyah_crud_af;


import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityBuatData extends AppCompatActivity {

    protected Cursor cursor;
    DbConfig dbHelper;
    Button btn1, btn2;
    EditText eText1, eText2, eText3, eText4, eText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_data);

        dbHelper = new DbConfig(this);
        eText1 = (EditText) findViewById(R.id.editText1);
        eText2 = (EditText) findViewById(R.id.editText2);
        eText3 = (EditText) findViewById(R.id.editText3);
        eText4 = (EditText) findViewById(R.id.editText4);
        eText5 = (EditText) findViewById(R.id.editText5);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into biodata (Nim,nama,tgl,jk,alamat) values ('"+eText1.getText().toString()+"','"+eText2.getText().toString()+"','"+eText3.getText().toString()+"','"+eText4.getText().toString()+"','"+eText5.getText().toString()+"')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                MainActivity.ma.RefreshList();
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}