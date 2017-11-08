package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        RectF rectF = new RectF(200,200,400,400);
        canvas.drawArc(rectF,-180,150,true,paint);

        paint.setColor(Color.YELLOW);
        RectF rectF2 = new RectF(210,210,410,410);
        canvas.drawArc(rectF2,-30,30,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF2,5,5,true,paint);

        paint.setColor(Color.BLACK);
        canvas.drawArc(rectF2,20,15,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF2,38,60,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF2,105,75,true,paint);


    }
}
