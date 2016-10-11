package com.acv.firstapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public void showMessage (View view) {
        //Toast.makeText(this, R.string.hello_message, Toast.LENGTH_SHORT).show();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(R.string.app_title);
        alert.setMessage(R.string.hello_message);
        alert.setPositiveButton(R.string.ok, null);
        alert.show();
    }
}
