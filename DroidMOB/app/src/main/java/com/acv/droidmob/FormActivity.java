package com.acv.droidmob;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.acv.droidmob.model.User;
import com.acv.droidmob.utils.Constants;

public class FormActivity extends AppCompatActivity {

    private TextView loguser;

    private TextInputLayout name;
    private TextInputLayout site;
    private TextInputLayout email;
    private TextInputLayout mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        loguser = (TextView) findViewById(R.id.loguser);
        if (getIntent() != null) {
            loguser.setText(this.getIntent().getStringExtra(Constants.KEY_USER));
        }
    }

    public void register(View view) {
        name = (TextInputLayout) findViewById(R.id.name);
        site = (TextInputLayout) findViewById(R.id.site);
        email = (TextInputLayout) findViewById(R.id.email);
        mobile = (TextInputLayout) findViewById(R.id.mobile);
        Intent formIntent = new Intent(FormActivity.this, ConfirmationActivity.class);
        User u = new User();
        u.setName(name.getEditText().getText().toString());
        u.setSite(site.getEditText().getText().toString());
        u.setEmail(email.getEditText().getText().toString());
        u.setMobile(mobile.getEditText().getText().toString());
        formIntent.putExtra(Constants.KEY_USER_DATA, u);
        startActivity(formIntent);
    }
}
