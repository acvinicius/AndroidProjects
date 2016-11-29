package com.acv.broadcast.broadcast;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import com.acv.broadcast.AlarmeActivity;
import com.acv.broadcast.R;

/**
 * Created by vinicius.castro on 11/21/2016.
 */

public class AlarmeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "trimmmm", Toast.LENGTH_LONG).show();
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(5 * 1000);

        enviarNotificacao(context);

        Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        Ringtone ringtone = RingtoneManager.getRingtone(context, notification);
        ringtone.play();
        try {
            ringtone.wait(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ringtone.stop();
    }

    private void enviarNotificacao(Context context) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentIntent(
                PendingIntent.getActivity(
                        context,
                        1234,
                        new Intent(
                                context, AlarmeActivity.class),
                        PendingIntent.FLAG_UPDATE_CURRENT)
        );

        builder.setContentTitle("Alarme disparado");
        builder.setContentText("Alarme disparado com sucesso");
        builder.setTicker("Nova mensagem");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setAutoCancel(true);

        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(100, builder.build());

    }
}
