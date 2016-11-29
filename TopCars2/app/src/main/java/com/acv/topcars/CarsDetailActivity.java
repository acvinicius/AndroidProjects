package com.acv.topcars;

import android.graphics.drawable.Drawable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.acv.topcars.model.Car;

import java.io.IOException;
import java.io.InputStream;

public class CarsDetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView desc;
    private CollapsingToolbarLayout collapsingToolbar;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars_detail);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_detail);
        imageView = (ImageView)findViewById(R.id.iv_car_detail);
        desc = (TextView)findViewById(R.id.tv_description_detail);

        if(getIntent() != null) {
            try{
                Car car = getIntent().getParcelableExtra("carro");
                InputStream ims = getAssets().open(car.getPhoto());
                Drawable d = Drawable.createFromStream(ims, null);
                imageView.setImageDrawable(d);
                collapsingToolbar.setTitle(car.getName().toString());
                desc.setText(car.getDescription().toString());
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

        }
    }
}
