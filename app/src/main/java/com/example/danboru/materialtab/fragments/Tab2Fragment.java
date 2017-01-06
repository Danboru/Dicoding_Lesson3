package com.example.danboru.materialtab.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.danboru.materialtab.R;

public class Tab2Fragment extends Fragment {

    private Button btnClickMe;

    public Tab2Fragment() {

        //membutuhkan konstruktor kosong

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        btnClickMe = (Button) view.findViewById(R.id.clickSaya);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "Hola", Toast.LENGTH_LONG).show();

            }
        });

    }
}
