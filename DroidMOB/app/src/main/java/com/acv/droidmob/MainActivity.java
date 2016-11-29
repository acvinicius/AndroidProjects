package com.acv.droidmob;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.acv.droidmob.utils.Constants;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout title_username;
    private TextInputLayout title_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title_username = (TextInputLayout) findViewById(R.id.title_username);
        title_password = (TextInputLayout) findViewById(R.id.title_password);

    }

    public void fazerLogin(View view) {
        String username = title_username.getEditText().getText().toString();
        String password = title_password.getEditText().getText().toString();
        if (username.equals("admin") && password.equals("12345")) {
            title_username.setErrorEnabled(false);
            title_password.setErrorEnabled(false);
            Intent formIntent = new Intent(MainActivity.this, FormActivity.class);
            formIntent.putExtra(Constants.KEY_USER, username);
            startActivity(formIntent);
        } else {
            title_username.setError(" ");
            title_password.setError("Usuário ou senha inválido.");
        }
    }
}
