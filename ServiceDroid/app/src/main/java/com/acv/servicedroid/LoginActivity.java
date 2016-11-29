package com.acv.servicedroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText etEmail = null;
    private EditText etSenha = null;
    private DatePicker dtDataNascimento = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.et_email);
        etSenha = (EditText) findViewById(R.id.et_senha);
//        dtDataNascimento = (DatePicker) findViewById(R.id.dp_data_nascimento);
    }

    public void validarLogin(View view){

        

    }
}
