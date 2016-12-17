package com.acv.persistence;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        estaConectado();
    }

    public void logar(View view) {
        String usuario = ((EditText) findViewById(R.id.et_login)).getText().toString();
        String senha = ((EditText) findViewById(R.id.et_password)).getText().toString();
        CheckBox cbkManterconectado = ((CheckBox) findViewById(R.id.ckb_conectado));

        if (usuario.equals("admin") && senha.equals("123")) {
            salvarPreferencias(usuario, cbkManterconectado.isChecked());
            abrirTela();
        }
    }

    private void estaConectado() {
        SharedPreferences settings = getSharedPreferences("PREFERENCIAS", MODE_PRIVATE);
        if (settings.getBoolean("manterconectado", false)) {
            abrirTela();
        }
    }

    private void abrirTela() {
        //cria um novo intent passando o atual e iniciando a nova activity
        startActivity(new Intent(this, LivrosActivity.class));
        finish();
    }

    private void salvarPreferencias(String usuario, Boolean manterconectado) {
        SharedPreferences preferences = getSharedPreferences("PREFERENCIAS", MODE_PRIVATE);
        SharedPreferences.Editor e = preferences.edit();
        e.putString("usuario", "rubim");
        e.putBoolean("manterconectado", manterconectado);

        e.commit();
    }
}
