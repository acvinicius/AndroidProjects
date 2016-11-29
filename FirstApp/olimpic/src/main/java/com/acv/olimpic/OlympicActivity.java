package com.acv.olimpic;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class OlympicActivity extends AppCompatActivity {

    private EditText name;
    private EditText age;
    private RadioGroup radioGroup;
    private RadioButton rd;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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

    public void reserve(View view) {
        StringBuilder confirmMsg = new StringBuilder();
        confirmMsg.append(this.getString(R.string.home_name))
                .append(name.getText().toString());
        confirmMsg.append("\n");
        confirmMsg.append(this.getString(R.string.home_age))
                .append(age.getText().toString());
        confirmMsg.append("\n");
        confirmMsg.append(this.getString(R.string.home_type))
                .append((String)spinner.getSelectedItem());
        confirmMsg.append("\n");
        confirmMsg.append(this.getString(R.string.home_period))
                .append(rd.getText());
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(R.string.confirmation);
        alert.setMessage(confirmMsg.toString());
        alert.setPositiveButton(R.string.home_btn_confirm, onClickConfirm(view));
        alert.show();
    }

    public DialogInterface.OnClickListener onClickConfirm(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(R.string.confirmation);
        alert.setPositiveButton(R.string.home_btn_ok, onClickClean(view));
        alert.show();
        return null;
    }
    public DialogInterface.OnClickListener onClickClean(View view) {
        name.setText("");
        age.setText("");
        rd = (RadioButton) findViewById(R.id.radioButton);
        spinner.setSelection(0);
        return null;
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
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
