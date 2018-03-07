package com.kumar.dipanshu.viewpagertransformation.Transformations;

import android.support.v4.view.ViewPager;
import android.view.View;

public class SlowTransformation implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {
        if (position <-1){
            page.setAlpha(1);
        }
        else if (position <=1){
            page.setTranslationX(-position*(page.getWidth()/2));
        }
        else {
            page.setAlpha(1);
        }
    }
}