package com.kumar.dipanshu.viewpagertransformation.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kumar.dipanshu.viewpagertransformation.R;
import com.squareup.picasso.Picasso;

public class SixthFragment extends Fragment {


    public SixthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sixth, container, false);
        ImageView six = view.findViewById(R.id.fragmentSixBackground);

        Picasso.get().load(R.drawable.six).fit().centerCrop().into(six);
        return view;
    }


}