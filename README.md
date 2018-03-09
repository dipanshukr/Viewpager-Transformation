# ViewPagerTransformations

<a href="">
  <img alt="Android app on Google Play" src="https://developer.android.com/images/brand/en_app_rgb_wo_45.png" />
</a>

* Simple Transformation
<img src="Extras/Simple.gif" width="145" height="250"/>

* [Depth Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Depth-Transformation)
<img src="Extras/Depth.gif" width="145" height="250"/>

```java
@Override
    public void transformPage(View page, float position) {
        if (position < -1){    // [-Infinity,-1)
            page.setAlpha(0);
        } else if (position <= 0){    // [-1,0]
            page.setAlpha(1);
            page.setTranslationX(0);
            page.setScaleX(1);
            page.setScaleY(1);
        } else if (position <= 1){    // (0,1]
            page.setTranslationX(-position*page.getWidth());
            page.setAlpha(1-Math.abs(position));
            page.setScaleX(1-Math.abs(position));
            page.setScaleY(1-Math.abs(position));
        } else {    // (1,+Infinity]
            page.setAlpha(0);
        }
    }
```

* [Zoom Out Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Zoom-Out-Transformation)
<img src="Extras/Zoom Out.gif" width="145" height="250"/>

```java
@Override
    public void transformPage(View page, float position) {
        if (position <-1){  // [-Infinity,-1)
            page.setAlpha(0);
        } else if (position <=1){ // [-1,1]
            page.setScaleX(Math.max(0.65f,1-Math.abs(position)));
            page.setScaleY(Math.max(0.65f,1-Math.abs(position)));
            page.setAlpha(Math.max(0.3f,1-Math.abs(position)));
        } else {  // (1,+Infinity]
            page.setAlpha(0);
        }
    }
```

### 
### [Clock Spin Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Clock-Spin-Transformation)
<img src="Extras/Clock Spin.gif" width="145" height="250"/>

### [AntiClock Spin Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/AntiClock-Spin-Transformation)
<img src="Extras/AntiClock Spin.gif" width="145" height="250"/>

### [Fidget Spin Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Fidget-Spin-Transformation)
<img src="Extras/Fidget Spin.gif" width="145" height="250"/>

### [Vertical Flip Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Vertical-Flip-Transformation)
<img src="Extras/Vertical Flip.gif" width="145" height="250"/>

### [Horizontal Flip Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Horizontal-Flip-Transformation)
<img src="Extras/Horizontal Flip.gif" width="145" height="250"/>

### [Pop Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Pop-Transformation)
<img src="Extras/Pop.gif" width="145" height="250"/>

### [Fade Out Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Fade-Out-Transformation)
<img src="Extras/Fade Out.gif" width="145" height="250"/>

### [Cube Out Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Cube-Out-Transformation)
<img src="Extras/Cube Out.gif" width="145" height="250"/>

### [Cube In Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Cube-In-Transformation)
<img src="Extras/Cube In.gif" width="145" height="250"/>

### [Cube Out Scaling Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Cube-Out-Scaling-Transformation)
<img src="Extras/Cube Out Scaling.gif" width="145" height="250"/>

### [Cube In Scaling Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Cube-In-Scaling-Transformation)
<img src="Extras/Cube In Scaling.gif" width="145" height="250"/>

### [Cube Out Depth Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Cube-Out-Depth-Transformation)
<img src="Extras/Cube Out Depth.gif" width="145" height="250"/>

### [Cube In Depth Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Cube-In-Depth-Transformation)
<img src="Extras/Cube In Depth.gif" width="145" height="250"/>

### [Hinge Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Hinge-Transformation)
<img src="Extras/Hinge.gif" width="145" height="250"/>

### [Gate Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Gate-Transformation)
<img src="Extras/Gate.gif" width="145" height="250"/>

### [Toss Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Toss-Transformation)


### [Fan Transformation](https://github.com/dipanshukr/ViewPagerTransformations/wiki/Fan-Transformation)
<img src="Extras/Fan.gif" width="145" height="250"/>
