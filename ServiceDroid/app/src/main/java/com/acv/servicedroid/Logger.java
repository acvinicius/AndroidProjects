package com.acv.servicedroid;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class Logger extends Service {
    public Logger() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onCreate() {
        super.onCreate();
        Log.i("Serviço de mensagem", "***Serviço iniciado!");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("Serviço de mensagem", "***Serviço encerrado!");
    }

//    @Override
//    public int onStartCommand (Intent i, int flags, int startid) {
//        Log.i("Alarm service", "Serviço iniciando");
//        return START_STICKY;
//    }
}
