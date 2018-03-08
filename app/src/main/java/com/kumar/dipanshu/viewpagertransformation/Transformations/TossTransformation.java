package com.kumar.dipanshu.viewpagertransformation.Transformations;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

public class TossTransformation implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());
        page.setCameraDistance(20000);


        if (position < 0.5 && position > -0.5) {
            page.setVisibility(View.VISIBLE);

        }
        else {
            page.setVisibility(View.INVISIBLE);

        }


        if (position < -1) {     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position < 0) {    // [-1,0]
            page.setAlpha(1);
            if (Math.abs(position) <= 0.3) {
                page.setScaleX(1 - Math.abs(position));
                page.setScaleY(1 - Math.abs(position));

            }
            else if (Math.abs(position) <= 0.8) {
                page.setRotationX(180 * (1 - Math.abs(position) + 1));
                Log.e("TOSS", "position <0     " + (180 * (1 - Math.abs(position) + 1)));

            }
            else {
                page.setScaleX(Math.abs(position));
                page.setScaleY(Math.abs(position));

            }

        }
        else if (position <= 1) {    // (0,1]
            page.setAlpha(1);
            if (Math.abs(position) >= 0.7) {
                page.setScaleY(Math.abs(position));
                page.setScaleX(Math.abs(position));

            }
            else if (Math.abs(position) >= 0.2) {
                page.setRotationX(-180 * (1 - Math.abs(position) + 1));
                Log.e("TOSS", "position <= 1     " + (-180 * (1 - Math.abs(position) + 1)));

            }
            else {
                page.setScaleX(1 - Math.abs(position));
                page.setScaleY(1 - Math.abs(position));

            }

        }
        else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}