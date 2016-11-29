package com.acv.olimpiadas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText age;
    private RadioGroup radioGroup;
    private RadioButton rd;
    private Spinner spinner;

    private TextView nameD;
    private TextView ageD;
    private TextView rdD;
    private TextView spinnerD;
    private Dialog d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.home_type_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        radioGroup = (RadioGroup) findViewById(R.id.radioButtonSelected);
        int i = radioGroup.getCheckedRadioButtonId();
        rd = (RadioButton) findViewById(i);

        name = (EditText) findViewById(R.id.editText);

        age = (EditText) findViewById(R.id.editText2);
    }

    public void reserveDialog (View view) {
        d = new Dialog(this);
        d.setTitle(R.string.confirmation);
        d.setContentView(R.layout.dialog_personalizado);
        nameD = (TextView) d.findViewById(R.id.edtNameD);
        nameD.setText(name.getText().toString());
        ageD = (TextView) d.findViewById(R.id.edtAgeD);
        ageD.setText(age.getText().toString());
        rdD = (TextView) d.findViewById(R.id.edtPeriodD);
        rdD.setText(rd.getText().toString());
        spinnerD = (TextView) d.findViewById(R.id.edtTypeD);
        spinnerD.setText((String)spinner.getSelectedItem());
        d.show();
    }

    public void onClickConfirmD(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(R.string.confirmation);
        alert.setPositiveButton(R.string.home_btn_ok, onClickClean(view));
        alert.show();
    }

    public DialogInterface.OnClickListener onClickClean(View view) {
        name.setText("");
        age.setText("");
        spinner.setSelection(0);
        radioGroup.clearCheck();
        rd = (RadioButton) findViewById(R.id.radioButton);
        d.dismiss();
        return null;
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    rd = (RadioButton) findViewById(R.id.radioButton);
                break;
            case R.id.radioButton2:
                if (checked)
                    rd = (RadioButton) findViewById(R.id.radioButton2);
                break;
            case R.id.radioButton3:
                if (checked)
                    rd = (RadioButton) findViewById(R.id.radioButton3);
                break;
        }
    }
}
