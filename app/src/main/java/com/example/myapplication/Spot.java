package com.example.myapplication;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Spot {

    protected int xCoord, yCoord, rad;
    protected Paint pain;

    public Spot(int x, int y){
        xCoord = x;
        yCoord = y;
        rad = (int) (50*Math.random() +25);
        pain = new Paint();
        int red = (int) (256*Math.random());
        int green = (int) (256*Math.random());
        int blue = (int) (256*Math.random());
        float[] hsv = new float[3];
        Color.RGBToHSV(red, green, blue, hsv);
        int color = Color.HSVToColor(255, hsv);
        pain.setColor(color);
        //pain.setColor(Color.RED);
    }

    public void draw(Canvas canvas){
        canvas.drawCircle(xCoord, yCoord, rad, pain);
    }

}
