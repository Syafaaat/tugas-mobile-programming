package com.example.laporanwarungrevisi;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.laporanwarungrevisi.model.ListProdukModel;
import com.example.laporanwarungrevisi.model.ProdukModel;
import com.example.laporanwarungrevisi.network.ApiClient;
import com.example.laporanwarungrevisi.network.ApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentStok#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentStok extends Fragment {

    private List<ProdukModel> mListProduk = new ArrayList<>();
    GridView gridView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentStok() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentStok.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentStok newInstance(String param1, String param2) {
        FragmentStok fragment = new FragmentStok();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_stok, container, false);

        gridView = root.findViewById(R.id.gridView3);

        getAllData();
        
        return root;

        
    }

    private void getAllData() {
        ApiService apiService = ApiClient.getRetrofit().create(ApiService.class);
        Call<ListProdukModel> call = apiService.getProduk();
        call.enqueue(new Callback<ListProdukModel>() {
            @Override
            public void onResponse(Call<ListProdukModel> call, Response<ListProdukModel> response) {
                mListProduk = response.body().getResult();

                CustomAdapterStok customAdapter = new CustomAdapterStok(mListProduk, getActivity());

                gridView.setAdapter(customAdapter);

            }

            @Override
            public void onFailure(Call<ListProdukModel> call, Throwable t) {
                Toast.makeText(getActivity(), "Koneksi Gagal!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public class CustomAdapterStok extends BaseAdapter {

        private List<ProdukModel> produkModel;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapterStok(List<ProdukModel> produkModel, Context context) {
            this.produkModel = produkModel;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return produkModel.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view == null){
                view = layoutInflater.inflate(R.layout.item_stok_list, viewGroup, false);
            }

            ImageView imageView = view.findViewById(R.id.iv_icon_stok);
            TextView namaProduk = view.findViewById(R.id.nama_produk_stok);
            EditText stokProduk = view.findViewById(R.id.harga_barang_stok);
            Button simpanStok = view.findViewById(R.id.simpanStok);

            Integer stok = Integer.valueOf(produkModel.get(i).getStok());

            namaProduk.setText(produkModel.get(i).getNamaProduk());
            stokProduk.setText(String.valueOf(stok));



            Glide.with(context).load(produkModel.get(i).getFoto()).into(imageView);

            simpanStok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String id = String.valueOf(produkModel.get(i).getId());
                    String stokUpdate = stokProduk.getText().toString().trim();

                    if (TextUtils.isEmpty(stokUpdate)){
                        stokProduk.setError("Data tidak boleh kosong!");
                    }else{
                        ApiService apiService = ApiClient.getRetrofit().create(ApiService.class);
                        Call<ListProdukModel> call = apiService.updateStok(
                                id,
                                stokUpdate
                        );

                        call.enqueue(new Callback<ListProdukModel>() {
                            @Override
                            public void onResponse(Call<ListProdukModel> call, Response<ListProdukModel> response) {
                                Toast.makeText(getActivity(), "Berhasil", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFailure(Call<ListProdukModel> call, Throwable t) {
                                Toast.makeText(getActivity(), "Berhasil", Toast.LENGTH_SHORT).show();
                            }
                        });

                    }


                }
            });

            return view;
        }
    }
}