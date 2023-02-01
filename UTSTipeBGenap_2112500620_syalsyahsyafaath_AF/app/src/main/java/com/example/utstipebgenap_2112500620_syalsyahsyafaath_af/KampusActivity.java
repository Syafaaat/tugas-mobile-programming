package com.example.utstipebgenap_2112500620_syalsyahsyafaath_af;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class KampusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kampus);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ViewPager viewPager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        setupViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.about);
        tabLayout.getTabAt(1).setIcon(R.drawable.logopmb);
        tabLayout.getTabAt(2).setIcon(R.drawable.mahsiswabaru);
        tabLayout.getTabAt(3).setIcon(R.drawable.gps);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if(position == 1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(KampusActivity.this);

                    builder.setTitle("SAAT INI BELUM ADA PENERIMAAN MAHASISWA BARU?")
                            .setMessage("Jika Ingin Mendaftar Silakan Hubungi Pihak PMB Universitas Budi Luhur")
                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    private void setupViewPager(ViewPager viewPager) {
        SectionPagerAdapter sectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        sectionPagerAdapter.addFragment(AboutUsFragment.newInstance(), "About us");
        sectionPagerAdapter.addFragment(PMBFragment.newInstance(), "PMB");
        sectionPagerAdapter.addFragment(FalkultasFragment.newInstance(), "Falkultas");
        sectionPagerAdapter.addFragment(MapsFragment.newInstance(), "Maps");
        viewPager.setAdapter(sectionPagerAdapter);
    }

    private class SectionPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> fragmentList = new ArrayList<>();
        private final List<String> fragmentString = new ArrayList<>();

        public SectionPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {




            return fragmentList.get(position);

        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        void addFragment (Fragment fm, String title){
            fragmentList.add(fm);
            fragmentString.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position){
            return  fragmentString.get(position);
        }
    }
}