package com.kumar.dipanshu.viewpagertransformation.Transformations;

import android.support.v4.view.ViewPager;
import android.view.View;

public class FadeOutTransformation implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position*page.getWidth());

        page.setAlpha(1-Math.abs(position));


    }
}