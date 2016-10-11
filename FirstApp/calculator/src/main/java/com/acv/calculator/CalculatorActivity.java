package com.acv.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText edtNumero1;
    EditText edtNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        edtNumero1 = (EditText) findViewById(R.id.edtNumero1);
        edtNumero2 = (EditText) findViewById(R.id.edtNumero2);
    }

    public void somar (View view) {
        int numero1 = Integer.parseInt(edtNumero1.getText().toString());
        int numero2 = Integer.parseInt(edtNumero2.getText().toString());
        int resultado = numero1 + numero2;
        Toast.makeText(this, getString(R.string.result)+ resultado, Toast.LENGTH_LONG).show();
    }

    public void dividir (View view) {
        int numero1 = Integer.parseInt(edtNumero1.getText().toString());
        int numero2 = Integer.parseInt(edtNumero2.getText().toString());
        int resultado = numero1 / numero2;
        Toast.makeText(this, getString(R.string.result)+ resultado, Toast.LENGTH_LONG).show();
    }

    public void multiplicar (View view) {
        int numero1 = Integer.parseInt(edtNumero1.getText().toString());
        int numero2 = Integer.parseInt(edtNumero2.getText().toString());
        int resultado = numero1 * numero2;
        Toast.makeText(this, getString(R.string.result)+ resultado, Toast.LENGTH_LONG).show();
    }

    public void subtrair (View view) {
        int numero1 = Integer.parseInt(edtNumero1.getText().toString());
        int numero2 = Integer.parseInt(edtNumero2.getText().toString());
        int resultado = numero1 - numero2;
        Toast.makeText(this, getString(R.string.result)+ resultado, Toast.LENGTH_LONG).show();
    }
}
