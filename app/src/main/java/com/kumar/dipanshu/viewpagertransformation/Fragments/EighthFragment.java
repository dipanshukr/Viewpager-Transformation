package com.kumar.dipanshu.viewpagertransformation.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.fragment.app.Fragment;

import com.kumar.dipanshu.viewpagertransformation.R;
import com.squareup.picasso.Picasso;

public class EighthFragment extends Fragment {


    public EighthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eighth, container, false);

        ImageView eight = view.findViewById(R.id.fragmentEightBackground);

        Picasso.get().load(R.drawable.eight).fit().centerCrop().into(eight);
        return view;
    }
    
}