package com.example.aplikasiuas.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ListBarangModel {

	@SerializedName("result")
	private List<BarangModel> result;

	public List<BarangModel> getResult(){
		return result;
	}
}