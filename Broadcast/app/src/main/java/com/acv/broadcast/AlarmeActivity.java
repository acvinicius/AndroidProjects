package com.acv.broadcast;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.acv.broadcast.broadcast.AlarmeReceiver;

public class AlarmeActivity extends AppCompatActivity {

    private EditText etTempo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarme);
        etTempo = (EditText) findViewById(R.id.etTempo);
    }

    public void Configurar (View view) {
        Integer tempo = Integer.parseInt(etTempo.getText().toString());
        if (tempo != 0) {
            Intent intent = new Intent(this, AlarmeReceiver.class);
            PendingIntent pi = PendingIntent.getBroadcast(this.getApplicationContext(), 1234, intent, 0);
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (tempo * 1000), pi);
            Toast.makeText(this, "Configurado para daqui a " + tempo + " segundos.", Toast.LENGTH_SHORT).show();

        }
    }

    public void Notificar (View view) {

    }

}
