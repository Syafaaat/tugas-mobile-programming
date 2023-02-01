package com.example.laporanwarungrevisi.model;

import com.google.gson.annotations.SerializedName;

public class ProdukModel {

	@SerializedName("nama_produk")
	private String namaProduk;

	@SerializedName("harga")
	private String harga;

	@SerializedName("foto")
	private String foto;

	@SerializedName("id")
	private String id;

	@SerializedName("stok")
	private String stok;

	public String getNamaProduk(){
		return namaProduk;
	}

	public String getHarga(){
		return harga;
	}

	public String getFoto(){
		return foto;
	}

	public String getId(){
		return id;
	}

	public String getStok(){
		return stok;
	}
}