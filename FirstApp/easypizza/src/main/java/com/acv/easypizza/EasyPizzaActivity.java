package com.acv.easypizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EasyPizzaActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup pizzaGroup;
    CheckBox borda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_pizza);
        pizzaGroup = (RadioGroup) findViewById(R.id.pizzaGroup);
        borda = (CheckBox) findViewById(R.id.checkBox);
        pizzaGroup.setOnCheckedChangeListener(this);
    }

    public void solicitar (View view) {
        int pizzaSelected = pizzaGroup.getCheckedRadioButtonId();
        double total = 0;
        if (pizzaSelected == R.id.four_cheese) {
            total = 10;
        } else {
            if (pizzaSelected == R.id.marguerita) {
                total = 15;
            } else {
                total = 20;
            }
            if (borda.isChecked()) {
                total += 5;
            }
        }
        Toast.makeText(this, "Total = R$" + total, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.four_cheese) {
            borda.setChecked(false);
            borda.setEnabled(false);
        } else {
            borda.setEnabled(true);
        }
    }

}
