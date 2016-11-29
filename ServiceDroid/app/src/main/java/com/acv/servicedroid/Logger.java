package com.acv.servicedroid;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.TimerTask;

public class Logger extends TimerTask {
    public Logger() {
        Log.i("LOGGER", "Logger iniciando...");
    }

    private long count = 0;

    @Override
    public void run() {
        count++;
        Log.i("LOGGER", "Logger " + count);
    }

}
