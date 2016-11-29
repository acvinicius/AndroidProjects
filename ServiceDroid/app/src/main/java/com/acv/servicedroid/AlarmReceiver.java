package com.acv.servicedroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    public AlarmReceiver() {
    }

    MediaPlayer mediaPlayer = null;

    @Override
    public void onReceive(Context context, Intent intent) {

        mediaPlayer = MediaPlayer.create(context, R.raw.eh);
//        mediaPlayer = MediaPlayer.create(context, R.raw.bh);
//        mediaPlayer = MediaPlayer.create(context, R.raw.ch);
//        mediaPlayer = MediaPlayer.create(context, R.raw.dh);
        mediaPlayer.start();

        Toast.makeText(context, "Alarm ....", Toast.LENGTH_LONG).show();
    }


}
