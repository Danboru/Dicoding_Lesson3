package com.example.danboru.materialtab.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.danboru.materialtab.R;


public class Tab1Fragment extends Fragment {


    public Tab1Fragment() {
        //membutuhkan konstruktor kosong
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_tab1, container, false);
    }
}
