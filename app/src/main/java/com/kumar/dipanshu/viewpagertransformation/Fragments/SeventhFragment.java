package com.kumar.dipanshu.viewpagertransformation.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kumar.dipanshu.viewpagertransformation.R;
import com.squareup.picasso.Picasso;

public class SeventhFragment extends Fragment {


    public SeventhFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_seventh, container,false);
        ImageView seven = (ImageView)view.findViewById(R.id.fragmentSevenBackground);

        Picasso.get().load(R.drawable.seven).fit().centerCrop().into(seven);
        return view;
    }

}