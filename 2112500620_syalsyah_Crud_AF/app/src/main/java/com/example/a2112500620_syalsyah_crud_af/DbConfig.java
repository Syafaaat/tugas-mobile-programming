package com.example.a2112500620_syalsyah_crud_af;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbConfig extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "biodatamahasiswa.db";
    private static final int DATABASE_VERSION = 1;

    public DbConfig (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null)";
        Log.d("Data", "OnCreate: " + sql);
        db.execSQL(sql);

        sql = "insert into biodata (no, nama, tgl, jk, alamat) values ('1912500467', 'Rizsyad AR', '2001-06-01', 'Laki-Laki', 'Tangerang')";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}