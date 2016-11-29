package com.acv.broadcast.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by vinicius.castro on 11/21/2016.
 */

public class MyFirstReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Receiver 1", Toast.LENGTH_SHORT).show();
    }
}
