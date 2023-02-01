package com.example.aplikasiuas.model;

import com.google.gson.annotations.SerializedName;

public class BarangModel {

	@SerializedName("nama_produk")
	private String namaProduk;

	@SerializedName("id")
	private String id;

	@SerializedName("harga")
	private String harga;

	@SerializedName("foto")
	private String foto;

	public String getNama_Produk(){
		return namaProduk;
	}

	public String getId(){
		return id;
	}

	public String getfoto() { return  foto;}

	public String getHarga() { return harga;}
}