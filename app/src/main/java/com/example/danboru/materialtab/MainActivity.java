package com.example.danboru.materialtab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.danboru.materialtab.adapter.TabFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    //initialisasi semua komponen
    private Toolbar toolbar;
    private ViewPager pager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       try{

           //set up toolbar
           Log.d("Toolbar", "Berhasil set Toolbar");

           toolbar = (Toolbar)findViewById(R.id.tool_bar);
           setSupportActionBar(toolbar);
           getSupportActionBar().setTitle("Material Tab");

       }catch (Exception e){

           Log.d("Toolbar", "Terjadi Kesalahan di Toolbarnya = " + e.getMessage());

       }

        //inisialisasi tab dan pager
        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        //set object adapter kedalam ViewPager
        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //Manimpulasi sedikit untuk set TextColor pada Tab
        tabs.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),
                getResources().getColor(android.R.color.white));

        //set tab ke ViewPager
        tabs.setupWithViewPager(pager);

        //konfigurasi Gravity Fill untuk Tab berada di posisi yang proposional
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

    }

}