package com.acv.a12mob_project;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CanvasActivity extends AppCompatActivity {

    private ImageView imgRosto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        imgRosto = (ImageView) findViewById(R.id.imgRosto);
        desenharNormal();
    }

    public void desenharNormal () {
        Bitmap bitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bitmap);
        Paint p = new Paint();
        p.setColor(Color.YELLOW);
        Paint p2 = new Paint();
        p2.setColor(Color.BLACK);

        c.drawCircle(100, 100, 50, p);
        c.drawLine(75, 125, 125, 125, p2);

        c.drawCircle(75,75,10,p2);
        c.drawCircle(125,75,10,p2);

        imgRosto.setImageBitmap(bitmap);
    }

    public void piscar (View view) {
        Bitmap bitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bitmap);
        Paint p = new Paint();
        p.setColor(Color.YELLOW);
        Paint p2 = new Paint();
        p2.setColor(Color.BLACK);

        c.drawCircle(100, 100, 50, p);
        c.drawLine(75, 125, 125, 125, p2);

        c.drawCircle(75,75,10,p2);
        c.drawLine(125, 75, 135, 75, p2);

        imgRosto.setImageBitmap(bitmap);
        try {
            this.wait(30);
            desenharNormal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void piscarVoltar (View view) {
        desenharNormal();
    }
}
