package com.example.laporanwarungrevisi.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ListProdukModel {

	@SerializedName("result")
	private List<ProdukModel> result;

	public List<ProdukModel> getResult(){
		return result;
	}
}