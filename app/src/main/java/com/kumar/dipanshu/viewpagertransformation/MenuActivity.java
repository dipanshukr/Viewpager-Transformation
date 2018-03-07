package com.kumar.dipanshu.viewpagertransformation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {


    Button simple, depth, zoomOut, clock_Spin, antiClock_Spin, fidgetSpinner, vertical_Flip, horizontal_Flip,
            pop, fadeOut, cubeOut, cubeIn, cubeOutScale, hinge, gate, toss, slow;

    Intent intent;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.example.com";
                Intent intentGithub = new Intent(Intent.ACTION_VIEW);
                intentGithub.setData(Uri.parse(url));
                startActivity(intentGithub);
            }
        });

        //method where we initialise buttons
        intialiseButtons();

        //method where listner is attached to ezch buttons
        attachListner();

    }


    private void intialiseButtons() {
        simple = (Button) findViewById(R.id.simpleTransformation);
        depth = (Button) findViewById(R.id.depthTransformation);
        zoomOut = (Button) findViewById(R.id.zoomOutTransformation);
        clock_Spin = (Button) findViewById(R.id.clockSpinTransformation);
        antiClock_Spin = (Button) findViewById(R.id.antiClockSpinTransformation);
        fidgetSpinner = (Button) findViewById(R.id.fidgetSpinTransformation);
        vertical_Flip = (Button) findViewById(R.id.verticalFlipTransformation);
        horizontal_Flip = (Button) findViewById(R.id.horizontalFlipTransformation);
        pop = (Button) findViewById(R.id.popTransformation);
        fadeOut = (Button) findViewById(R.id.fadeOutTransformation);
        cubeOut = (Button) findViewById(R.id.cubeOutTransformation);
        cubeIn = (Button) findViewById(R.id.cubeInTransformation);
        cubeOutScale = (Button) findViewById(R.id.cubeOutScalingTransformation);
        hinge = (Button) findViewById(R.id.hingeTransformation);
        gate = (Button) findViewById(R.id.gateTransformation);
        toss = (Button) findViewById(R.id.hingeTransformation);
        slow = (Button) findViewById(R.id.slowTransformation);
    }

    private void attachListner() {
        simple.setOnClickListener(this);
        depth.setOnClickListener(this);
        zoomOut.setOnClickListener(this);
        clock_Spin.setOnClickListener(this);
        antiClock_Spin.setOnClickListener(this);
        fidgetSpinner.setOnClickListener(this);
        vertical_Flip.setOnClickListener(this);
        horizontal_Flip.setOnClickListener(this);
        pop.setOnClickListener(this);
        fadeOut.setOnClickListener(this);
        cubeOut.setOnClickListener(this);
        cubeIn.setOnClickListener(this);
        cubeOutScale.setOnClickListener(this);
        hinge.setOnClickListener(this);
        gate.setOnClickListener(this);
        toss.setOnClickListener(this);
        slow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.simpleTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.SIMPLE_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.depthTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.DEPTH_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.zoomOutTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.ZOOM_OUT_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.clockSpinTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.CLOCK_SPIN_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.antiClockSpinTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.ANTICLOCK_SPIN_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.fidgetSpinTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.FIDGET_SPINNER_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.verticalFlipTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.VERTICAL_FLIP_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.horizontalFlipTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.HORIZONTAL_FLIP_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.popTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.POP_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.fadeOutTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.FADE_OUT_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.cubeOutTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.CUBE_OUT_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.cubeInTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.CUBE_IN_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.cubeOutScalingTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.CUBE_OUT_SCALING_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.hingeTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.HINGE_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.gateTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.GATE_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.tossTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.TOSS_TRANSFORMATION);
                startActivity(intent);
                break;
            case R.id.slowTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.SLOW__TRANSFORMATION);
                startActivity(intent);
                break;
        }
    }
}