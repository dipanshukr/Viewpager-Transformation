package com.kumar.dipanshu.viewpagertransformation.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kumar.dipanshu.viewpagertransformation.R;
import com.squareup.picasso.Picasso;

public class NinthFragment extends Fragment {


    public NinthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ninth, container, false);
        ImageView nine = view.findViewById(R.id.fragmentNineBackground);

        Picasso.get().load(R.drawable.nine).fit().centerCrop().into(nine);
        return view;
    }

}