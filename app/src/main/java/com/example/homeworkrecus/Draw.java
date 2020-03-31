package com.example.homeworkrecus;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Draw extends View {
    Paint paint;
    int w, h;
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawCircles(canvas,canvas.getWidth()/2,canvas.getHeight()/2,200);

    }
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.w = w;
        this.h = h;
    }

    public Draw(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);

    }
    public void drawCircles(Canvas canvas, int x, int y, int r){
        canvas.drawCircle(x, y, r, paint);

        if(r > 25) {
            drawCircles(canvas, x, y - r, r / 2);
            drawCircles(canvas, x + r, y, r / 2);
            drawCircles(canvas, x, y + r, r / 2);
            drawCircles(canvas, x - r, y, r / 2);
        }
    }
}
