package com.kumar.dipanshu.viewpagertransformation.Transformations;

import androidx.viewpager.widget.ViewPager;
import android.view.View;

public class CubeInDepthTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setCameraDistance(20000);


        if (position < -1){
            page.setAlpha(0);
        }
        else if (position <= 0){
            page.setAlpha(1);
            page.setPivotX(page.getWidth());
            page.setRotationY(90*Math.abs(position));
        }
        else if (position <= 1){
            page.setAlpha(1);
            page.setPivotX(0);
            page.setRotationY(-90*Math.abs(position));
        }
        else{
            page.setAlpha(0);
        }



        if (Math.abs(position) <= 0.5){
            page.setScaleY(Math.max(.4f,1-Math.abs(position)));
        }
        else if (Math.abs(position) <= 1){
            page.setScaleY(Math.max(.4f,1-Math.abs(position)));

        }


    }
}