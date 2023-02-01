package com.example.laporanwarungrevisi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.laporanwarungrevisi.model.ListProdukModel;
import com.example.laporanwarungrevisi.network.ApiClient;
import com.example.laporanwarungrevisi.network.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentUpload#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentUpload extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentUpload() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentUpload.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentUpload newInstance(String param1, String param2) {
        FragmentUpload fragment = new FragmentUpload();
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
        View root = inflater.inflate(R.layout.fragment_upload, container, false);


        EditText etNamaProduk = (EditText) root.findViewById(R.id.etNamaProduk);
        EditText etHarga = (EditText) root.findViewById(R.id.etHarga);
        EditText etFoto = (EditText) root.findViewById(R.id.etFoto);
        EditText etStok = (EditText) root.findViewById(R.id.etStok);

        Button postBarangBtn = (Button) root.findViewById(R.id.btnTambah);
        Button btnCara = (Button) root.findViewById(R.id.btnCara);
        btnCara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ActivityInformasi.class));
            }
        });



        postBarangBtn.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                String foto = etFoto.getText().toString().trim();
                String namaproduk = etNamaProduk.getText().toString().trim();
                String harga = etHarga.getText().toString().trim();
                String stok = etStok.getText().toString().trim();

                if (TextUtils.isEmpty(namaproduk)){
                    etFoto.setError("Data tidak boleh kosong!");
                }else if (TextUtils.isEmpty(harga)){
                    etNamaProduk.setError("Data tidak boleh kosong!");
                }else if (TextUtils.isEmpty(foto)){
                    etHarga.setError("Data tidak boleh kosong!");
                }else if (TextUtils.isEmpty(stok)){
                    etStok.setError("Data tidak boleh kosong!");
                }else{
                    ApiService apiService = ApiClient.getRetrofit().create(ApiService.class);
                    Call<ListProdukModel> call = apiService.addNew(
                            namaproduk,
                            harga,
                            foto,
                            stok
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

        return root;

    }
}