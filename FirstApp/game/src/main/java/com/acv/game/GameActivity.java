package com.acv.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private ImageView imageOponente;
    private ImageView imageComputador;
    private TextView resultado;
    private int [] imagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        imageOponente = (ImageView) findViewById(R.id.imageViewOponente);
        imageComputador = (ImageView) findViewById(R.id.imageViewComputador);
        resultado = (TextView) findViewById(R.id.resultado);
        imagens = new int[6];
        imagens[0] = R.drawable.dado1;
        imagens[1] = R.drawable.dado2;
        imagens[2] = R.drawable.dado3;
        imagens[3] = R.drawable.dado4;
        imagens[4] = R.drawable.dado5;
        imagens[5] = R.drawable.dado6;
    }

    public void play (View view) {
        Random randomOponente = new Random();
        Random randomComputador = new Random();
        int oponente = randomOponente.nextInt(5);
        int computador = randomComputador.nextInt(5);
        TextView resultado = (TextView) findViewById(R.id.resultado);
        imageOponente.setImageResource(imagens[oponente]);
        imageComputador.setImageResource(imagens[computador]);
        if (oponente > computador) {
            resultado.setText(R.string.oponente_wins);
        } else if (oponente < computador) {
            resultado.setText(R.string.computador_wins);
        } else {
            resultado.setText(R.string.empate);
        }
    }
}
