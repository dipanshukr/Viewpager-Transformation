package com.kumar.dipanshu.viewpagertransformation.Transformations;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.kumar.dipanshu.viewpagertransformation.R;

public class SlowTransformation implements ViewPager.PageTransformer {

    TextView number, word, code;
    ImageButton github;

    @Override
    public void transformPage(View page, float position) {

        number = (TextView) page.findViewById(R.id.numberTextView);
        word = (TextView) page.findViewById(R.id.wordTextView);
        code = (TextView) page.findViewById(R.id.codeTextView);
        github = (ImageButton) page.findViewById(R.id.githubImageButton);

        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 1) { // [-1,1]

            number.setTranslationX(-position * 0.5f * page.getWidth());
            word.setTranslationX(-position * 1.0f * page.getWidth());
            github.setTranslationX(-position * 2.0f * page.getWidth());
            code.setTranslationX(-position * 2.5f * page.getWidth());
//            // The 0.5, 1.0, 2.0, 2.5 values you see here are what makes the view move in a different speed.
//            // The bigger the number, the faster the view will translate.
//            // The result float is preceded by a minus because the views travel in the opposite direction of the movement.

        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);
        }
    }
}