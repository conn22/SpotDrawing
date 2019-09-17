package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

import java.util.ArrayList;

public class NewSurfaceView extends SurfaceView implements View.OnTouchListener{

    protected ArrayList<Spot> Spots;

    public NewSurfaceView(Context context, AttributeSet attrs){
        super(context, attrs);
        setWillNotDraw(false);
        Spots = new ArrayList<Spot>();
        setOnTouchListener(this);
        //Spots.add(new Spot(100, 100, 50));
    }

    public boolean onTouch(View v, MotionEvent event){

        Spots.add(new Spot((int) event.getX(), (int) event.getY()));

        invalidate();
        return true;
    }

    public void onDraw(Canvas canvas){
        canvas.drawColor(Color.BLACK);
        for(Spot spot : Spots){
            spot.draw(canvas);
        }
    }

}
