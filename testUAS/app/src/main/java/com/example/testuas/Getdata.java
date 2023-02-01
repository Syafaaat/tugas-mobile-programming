package com.example.testuas;



public class Getdata {
    private int id;
    private int harga;
    private String nama_produk;
    private String foto;


    @SerializedName("Body")
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}