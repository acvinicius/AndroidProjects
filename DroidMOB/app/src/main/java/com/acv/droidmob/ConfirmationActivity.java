package com.acv.droidmob;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.acv.droidmob.model.User;
import com.acv.droidmob.utils.Constants;

public class ConfirmationActivity extends AppCompatActivity {

    private TextView email;
    private TextView mobile;
    private TextView site;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = (TextView) findViewById(R.id.tvEmail);
        mobile = (TextView) findViewById(R.id.tvCelular);
        site = (TextView) findViewById(R.id.tvSite);

        if (this.getIntent() != null) {
            User u = this.getIntent().getParcelableExtra(Constants.KEY_USER_DATA);
            email.setText(u.getEmail());
            mobile.setText(u.getMobile());
            site.setText(u.getSite());
        }
    }
}
