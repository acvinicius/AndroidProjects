package com.acv.broadcast.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by vinicius.castro on 11/21/2016.
 */

public class MySecondReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Receiver 2", Toast.LENGTH_SHORT).show();
    }
}
