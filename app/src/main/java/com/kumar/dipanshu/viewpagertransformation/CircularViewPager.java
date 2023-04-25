package com.kumar.dipanshu.viewpagertransformation;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.kumar.dipanshu.viewpagertransformation.Fragments.*;

public class CircularViewPager extends AppCompatActivity {

    Handler handler = new Handler();

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_view_pager);
        
        viewPager = findViewById(R.id.viewPager);

        addFragment();
    }


    private void addFragment() {

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());

        FirstFragment f1 = new FirstFragment();
        FirstFragment f2 = new FirstFragment();
        SecondFragment second = new SecondFragment();
        ThirdFragment third = new ThirdFragment();
        FourthFragment fourth = new FourthFragment();
        FifthFragment fifth = new FifthFragment();
        SixthFragment sixth = new SixthFragment();
        SeventhFragment seventh = new SeventhFragment();
        EighthFragment eight = new EighthFragment();
        NinthFragment ninth = new NinthFragment();
        TenthFragment t1 = new TenthFragment();
        TenthFragment t2 = new TenthFragment();

        adapter.addFragments(t2);
        adapter.addFragments(f1);
        adapter.addFragments(second);
        adapter.addFragments(third);
        adapter.addFragments(fourth);
        adapter.addFragments(fifth);
        adapter.addFragments(sixth);
        adapter.addFragments(seventh);
        adapter.addFragments(eight);
        adapter.addFragments(ninth);
        adapter.addFragments(t1);
        adapter.addFragments(f2);

        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);

        viewPager.addOnPageChangeListener(new MyPageListener());


    }


    private class MyPageListener implements ViewPager.OnPageChangeListener {


        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            if (position == 0) {

                handler.postDelayed(() -> viewPager.setCurrentItem(10, false), 500);

            } else if (position == 11) {

                handler.postDelayed(() -> viewPager.setCurrentItem(1, false), 500);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

}