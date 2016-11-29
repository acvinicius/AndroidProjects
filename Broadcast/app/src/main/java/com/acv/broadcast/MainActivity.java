package com.acv.broadcast;

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

    public void logar(View  view) {
        Intent intent = new Intent();
        intent.setAction("android.app.action.ACTION_PASSWORD_SUCCEEDED");
        sendBroadcast(intent);
    }

    public void logarDois (View  view) {
        Intent intent = new Intent();
        intent.setAction("orderedbroadcast");
        sendBroadcast(intent);
    }
}
