package com.acv.servicedroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startButton (View view) {
        Intent intent = new Intent(this, Logger.class);
        startService(intent);
    }

    public void stopButton (View view) {
        Intent intent = new Intent(this, Logger.class);
        stopService(intent);
    }

}
