package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();

        canvas.drawLine(100,100,100,500,paint);
        canvas.drawLine(100,500,700,500,paint);

        paint.setColor(Color.GREEN);
        RectF rectF1 = new RectF(120,500,150,480);
        RectF rectF2 = new RectF(170,500,200,460);
        RectF rectF3 = new RectF(230,500,260,470);
        RectF rectF4 = new RectF(290,500,320,400);
        RectF rectF5 = new RectF(350,500,380,200);
        canvas.drawRect(rectF1,paint);
        canvas.drawRect(rectF2,paint);
        canvas.drawRect(rectF3,paint);
        canvas.drawRect(rectF4,paint);
        canvas.drawRect(rectF5,paint);

    }
}
