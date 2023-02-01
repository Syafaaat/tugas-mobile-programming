package com.example.aplikasiuas;

public class Configuration {
    public static final String BASE_URL = "https://cvsyalsyahsyafaath.000webhostapp.com/";
    public static final String URL_ADD = BASE_URL + "add.php";
    public static final String URL_GET_MHS = BASE_URL + "detail.php?id=";
    public static final String URL_GET_ALL = BASE_URL + "read.php";
    public static final String URL_UPDATE_MHS = BASE_URL + "update.php";
    public static final String URL_DELETE_MHS = BASE_URL + "delete.php?id=";

    //Request to PHP
    public static final String KEY_barang_ID = "id";
    public static final String KEY_MHS_NAMA_PRODUK = "nama_produk";
    public static final String KEY_MHS_HARGA = "harga";
    public static final String KEY_MHS_FOTO = "foto";
    public static final String KEY_MHS_STOK = "stok";

    //JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA_PRODUK = "nama_produk";
    public static final String TAG_HARGA = "harga";
    public static final String TAG_FOTO = "foto";
    public static final String TAG_STOK = "stok";

    //ID BARANG
    public static final String BARANG_ID = "barang_id";
}