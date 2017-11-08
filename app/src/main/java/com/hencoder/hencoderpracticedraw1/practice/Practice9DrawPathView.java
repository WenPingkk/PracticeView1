package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

//        Paint paint = new Paint();
//        paint.setAntiAlias(true);
//        Path path =  new Path();
//        path.addArc(200,200,400,400,-225,225);
//        path.arcTo(400,200,600,400,-180,225,false);
//        path.lineTo(400,542);
//
//        canvas.drawPath(path,paint);

        Paint paint=new Paint();
        paint.setAntiAlias(true);
        Path path = new Path();

//        path.addArc(200,200,400,400,-225,225);
        path.arcTo(200,200,400,400,-225,225,true);
        //上面两句的效果是一样的?无论上一句的forceMove为true还是false
        path.arcTo(400,200,600,400,-180,225,false);
        path.lineTo(400,542);
        canvas.drawPath(path,paint);
    }
}
