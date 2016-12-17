package com.acv.times.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.acv.times.fragments.TimesFragment;

/**
 * Created by vinicius.castro on 11/19/2016.
 */

public class TabAdapter extends FragmentStatePagerAdapter {

    public TabAdapter(FragmentManager fm) {

        super(fm);
    }

    public static final int TOTAL_TABS = 2 ;

    @Override
    public Fragment getItem(int position) {
        Bundle args = new Bundle();
        if (position == 0) {
            args.putString("tipo","classicos");
        } else if (position == 1) {
            args.putString("tipo","esportivos");
        }
        Fragment f = new TimesFragment();
        f.setArguments(args);
        return f;
    }

    @Override
    public int getCount() {
        return TOTAL_TABS;
    }


}
