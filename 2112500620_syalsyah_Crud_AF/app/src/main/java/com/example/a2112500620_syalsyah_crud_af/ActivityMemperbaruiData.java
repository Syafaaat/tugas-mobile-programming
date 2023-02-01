package com.example.a2112500620_syalsyah_crud_af;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityMemperbaruiData extends AppCompatActivity {

    protected Cursor cursor;
    DbConfig dbHelper;
    Button btn1, btn2;
    EditText eText1, eText2, eText3, eText4, eText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memperbarui_data);

        dbHelper = new DbConfig(this);
        eText1 = (EditText) findViewById(R.id.editText1);
        eText2 = (EditText) findViewById(R.id.editText2);
        eText3 = (EditText) findViewById(R.id.editText3);
        eText4 = (EditText) findViewById(R.id.editText4);
        eText5 = (EditText) findViewById(R.id.editText5);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        cursor = db.rawQuery("SELECT * FROM biodata WHERE nama = '"+getIntent().getStringExtra("nama")+"'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0);
            eText1.setText(cursor.getString(0).toString());
            eText2.setText(cursor.getString(1).toString());
            eText3.setText(cursor.getString(2).toString());
            eText4.setText(cursor.getString(3).toString());
            eText5.setText(cursor.getString(4).toString());
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("update biodata set nama='"+eText2.getText().toString()+"', tgl='"+eText3.getText().toString()+"', jk='"+eText4.getText().toString()+"', alamat='"+eText5.getText().toString()+"' where no='"+eText1.getText().toString()+"'");
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