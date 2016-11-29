package com.acv.a12mob_project;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vinicius.castro on 10/31/2016.
 */

@SuppressLint("NewApi")
public class PortraitFragment extends Fragment {

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        return inflater.inflate(R.layout.p_fragment, container, false);
    }
}
