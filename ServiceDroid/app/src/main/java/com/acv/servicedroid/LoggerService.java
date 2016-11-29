package com.acv.servicedroid;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.Timer;

public class LoggerService extends Service {
    public LoggerService() {
    }

    private Timer timer;
    private Logger logger;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        timer = new Timer();
        logger = new Logger();
        timer.schedule(logger, 1000, 2000);
    }

    public void onDestroy () {
        logger.cancel();
        timer.cancel();
        super.onDestroy();
    }
}
