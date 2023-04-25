package com.kumar.dipanshu.viewpagertransformation;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.kumar.dipanshu.viewpagertransformation.Fragments.*;
import com.kumar.dipanshu.viewpagertransformation.Transformations.*;

public class TransformationActivity extends AppCompatActivity {

    ViewPager viewPager;
    MyPagerAdapter pagerAdapter;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transformation);

        viewPager = findViewById(R.id.viewPager);

        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        addingFragmentsTOpagerAdapter();
        viewPager.setAdapter(pagerAdapter);

        SlowTransformation slowTransformation = new SlowTransformation();
        SimpleTransformation simpleTransformation = new SimpleTransformation();
        DepthTransformation depthTransformation = new DepthTransformation();
        ZoomOutTransformation zoomOutTransformation = new ZoomOutTransformation();
        Clock_SpinTransformation clockSpinTransformation = new Clock_SpinTransformation();
        AntiClockSpinTransformation antiClockSpinTransformation = new AntiClockSpinTransformation();
        FidgetSpinTransformation fidgetSpinTransformation = new FidgetSpinTransformation();
        VerticalFlipTransformation verticalFlipTransformation = new VerticalFlipTransformation();
        HorizontalFlipTransformation horizontalFlipTransformation = new HorizontalFlipTransformation();
        PopTransformation popTransformation = new PopTransformation();
        FadeOutTransformation fadeOutTransformation = new FadeOutTransformation();
        CubeOutRotationTransformation cubeOutRotationTransformation = new CubeOutRotationTransformation();
        CubeInRotationTransformation cubeInRotationTransformation = new CubeInRotationTransformation();
        CubeOutScalingTransformation cubeOutScalingTransformation = new CubeOutScalingTransformation();
        CubeInScalingTransformation cubeInScalingTransformation = new CubeInScalingTransformation();
        CubeOutDepthTransformation cubeOutDepthTransformation = new CubeOutDepthTransformation();
        CubeInDepthTransformation cubeInDepthTransformation = new CubeInDepthTransformation();
        HingeTransformation hingeTransformation = new HingeTransformation();
        GateTransformation gateTransformation = new GateTransformation();
        TossTransformation tossTransformation = new TossTransformation();
        FanTransformation fanTransformation = new FanTransformation();
        SpinnerTransformation spinnerTransformation = new SpinnerTransformation();
        VerticalShutTransformation verticalShutTransformation = new VerticalShutTransformation();


        intent = getIntent();
        String transformation = intent.getStringExtra(Constant.TRANSFORMATION);


        switch (transformation) {
            case Constant.SLOW_TRANSFORMATION:
                viewPager.setPageTransformer(true,slowTransformation);
                break;
            case Constant.SIMPLE_TRANSFORMATION:
                viewPager.setPageTransformer(true, simpleTransformation);
                break;
            case Constant.DEPTH_TRANSFORMATION:
                viewPager.setPageTransformer(true, depthTransformation);
                break;
            case Constant.ZOOM_OUT_TRANSFORMATION:
                viewPager.setPageTransformer(true, zoomOutTransformation);
                break;
            case Constant.CLOCK_SPIN_TRANSFORMATION:
                viewPager.setPageTransformer(true, clockSpinTransformation);
                break;
            case Constant.ANTICLOCK_SPIN_TRANSFORMATION:
                viewPager.setPageTransformer(true, antiClockSpinTransformation);
                break;
            case Constant.FIDGET_SPINNER_TRANSFORMATION:
                viewPager.setPageTransformer(true, fidgetSpinTransformation);
                break;
            case Constant.VERTICAL_FLIP_TRANSFORMATION:
                viewPager.setPageTransformer(true, verticalFlipTransformation);
                break;
            case Constant.HORIZONTAL_FLIP_TRANSFORMATION:
                viewPager.setPageTransformer(true, horizontalFlipTransformation);
                break;
            case Constant.POP_TRANSFORMATION:
                viewPager.setPageTransformer(true, popTransformation);
                break;
            case Constant.FADE_OUT_TRANSFORMATION:
                viewPager.setPageTransformer(true, fadeOutTransformation);
                break;
            case Constant.CUBE_OUT_TRANSFORMATION:
                viewPager.setPageTransformer(true, cubeOutRotationTransformation);
                break;
            case Constant.CUBE_IN_TRANSFORMATION:
                viewPager.setPageTransformer(true, cubeInRotationTransformation);
                break;
            case Constant.CUBE_OUT_SCALING_TRANSFORMATION:
                viewPager.setPageTransformer(true, cubeOutScalingTransformation);
                break;
            case Constant.CUBE_IN_SCALING_TRANSFORMATION:
                viewPager.setPageTransformer(true, cubeInScalingTransformation);
                break;
            case Constant.CUBE_OUT_DEPTH_TRANSFORMATION:
                viewPager.setPageTransformer(true, cubeOutDepthTransformation);
                break;
            case Constant.CUBE_IN_DEPTH_TRANSFORMATION:
                viewPager.setPageTransformer(true, cubeInDepthTransformation);
                break;
            case Constant.HINGE_TRANSFORMATION:
                viewPager.setPageTransformer(true, hingeTransformation);
                break;
            case Constant.GATE_TRANSFORMATION:
                viewPager.setPageTransformer(true, gateTransformation);
                break;
            case Constant.TOSS_TRANSFORMATION:
                viewPager.setPageTransformer(true, tossTransformation);
                break;
            case Constant.FAN_TRANSFORMATION:
                viewPager.setPageTransformer(true, fanTransformation);
                break;
            case Constant.SPINNER_TRANSFORMATION:
                viewPager.setPageTransformer(true,spinnerTransformation);
                break;
            case Constant.VERTICAL_SHUT_TRANSFORMATION:
                viewPager.setPageTransformer(true,verticalShutTransformation);
                break;
        }
    }


    private void addingFragmentsTOpagerAdapter() {
        pagerAdapter.addFragments(new FirstFragment());
        pagerAdapter.addFragments(new SecondFragment());
        pagerAdapter.addFragments(new ThirdFragment());
        pagerAdapter.addFragments(new FourthFragment());
        pagerAdapter.addFragments(new FifthFragment());
        pagerAdapter.addFragments(new SixthFragment());
        pagerAdapter.addFragments(new SeventhFragment());
        pagerAdapter.addFragments(new EighthFragment());
        pagerAdapter.addFragments(new NinthFragment());
        pagerAdapter.addFragments(new TenthFragment());
    }

}