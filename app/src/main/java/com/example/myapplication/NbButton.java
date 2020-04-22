package com.example.myapplication;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

import androidx.appcompat.widget.AppCompatButton;

import static android.content.ContentValues.TAG;

/**
 * @author ifans.wen
 * @date 2020/3/3
 * @description
 */

public class NbButton extends AppCompatButton {

    private int width;
    private int heigh;
    int viewWidth;
    int viewheight;
    Rect bounds;
    Drawable drawable;
    private GradientDrawable backDrawable;

    private boolean isMorphing;
    private int startAngle;

    private Paint paint;

    private ValueAnimator arcValueAnimator;

    public NbButton(Context context) {
        super(context);
        init(context);
    }


    public NbButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public NbButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        isMorphing = false;

        backDrawable = new GradientDrawable();
        int colorDrawable = getResources().getColor(R.color.colorPrimary);
        backDrawable.setColor(colorDrawable);
        backDrawable.setCornerRadius(120);
        setBackground(backDrawable);

        setText("登陆");
        drawable = getResources().getDrawable(R.drawable.consol);

        bounds = new Rect(0, 0, 64, 64);
        drawable.setBounds(bounds);

        setCompoundDrawables(drawable, null, null, null);
        paint = new Paint();
//        paint.setColor(getResources().getColor(R.color.colorPrimary));
//        paint.setStrokeWidth(4);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setTextSize(2);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heighMode = MeasureSpec.getMode(heightMeasureSpec);
        int heighSize = MeasureSpec.getSize(heightMeasureSpec);
        if (widthMode == MeasureSpec.EXACTLY) {
            width = widthSize;
            viewWidth = width;
        }
        if (heighMode == MeasureSpec.EXACTLY) {
            heigh = heighSize;
            viewheight = heigh;
        }
    }

    public void startAnim() {
        isMorphing = true;

        setText("");
        ValueAnimator valueAnimator = ValueAnimator.ofInt(width, heigh);
        Log.e("Button", "+================= " + width + "   " + heigh);


        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animation.getAnimatedValue();
//                Log.e("Button", "----------------------------------------retrideAnim " + value);
                int leftOffset = (width - value) / 2;
                int rightOffset = width - leftOffset;
                Log.e("Button", "----------------------------------------retrideAnim " + leftOffset + " " + rightOffset);
                viewWidth = width - leftOffset * 2;
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = viewWidth;
                setLayoutParams(layoutParams);
//                backDrawable.setBounds(leftOffset, 0, rightOffset, heigh);
//                drawable.setBounds(leftOffset, bounds.top, bounds.right, bounds.bottom);
//                Rect bound = drawable.getBounds();
//                Log.e("Button", "----------------------------------------retrideAnim " +
//                        " l:" + bound.left + " t:" + bound.top + " r:" + bound.right + " b:" + bound.bottom);

            }
        });
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(backDrawable, "cornerRadius", 120, heigh / 2);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500);
        animatorSet.playTogether(valueAnimator, objectAnimator);
        animatorSet.start();

        //画中间的白色圆圈

//        showArc();
    }

    public void retrideAnim() {
        isMorphing = false;

        setText("登录");
        ValueAnimator valueAnimator = ValueAnimator.ofInt(width, heigh);

        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animation.getAnimatedValue();
//                Log.e("Button", "----------------------------------------retrideAnim " + value);
                int leftOffset = value / 2 - 75;
                int rightOffset = width - leftOffset;
                Log.e("Button", "----------------------------------------retrideAnim " + leftOffset + " " + rightOffset);
//                backDrawable.setBounds(leftOffset, 0, rightOffset, heigh);
//                drawable.setBounds(leftOffset, bounds.top, bounds.right, bounds.bottom);
                viewWidth = width - leftOffset;
                Log.e("Button", "----------------------------------------retrideAnim " +  value);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = viewWidth;
                setLayoutParams(layoutParams);

            }
        });
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(backDrawable, "cornerRadius", 120, heigh / 2);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500);
        animatorSet.playTogether(valueAnimator, objectAnimator);
        animatorSet.start();
        Log.e(TAG, "retrideAnim: " + getCompoundDrawables().toString());
        //画中间的白色圆圈

//        showArc();
    }


    public void gotoNew() {
        isMorphing = false;

        arcValueAnimator.cancel();
//        setVisibility(GONE);

    }

    private boolean isExpand = true;

    public void toggle() {
        if (isExpand) {
            startAnim();
            isExpand = false;
        } else {
            retrideAnim();
            isExpand = true;
        }

        Log.e("Nbbutton", "-------------" + isExpand);
    }

    public boolean getExpand() {
        return isExpand;
    }


    public void regainBackground() {
        backDrawable.setBounds(0, 0, width, heigh);
        backDrawable.setCornerRadius(24);
        setBackground(backDrawable);
        setText("登陆");
        isMorphing = false;
    }

    private void showArc() {
        arcValueAnimator = ValueAnimator.ofInt(0, 1080);
        arcValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                startAngle = (int) animation.getAnimatedValue();
                invalidate();
            }
        });
        arcValueAnimator.setInterpolator(new LinearInterpolator());
        arcValueAnimator.setRepeatCount(ValueAnimator.INFINITE);
        arcValueAnimator.setDuration(3000);
        arcValueAnimator.start();


    }


}
