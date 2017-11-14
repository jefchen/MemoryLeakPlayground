package com.jeffrey.memoryleakplayground;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jefchen on 9/19/17.
 */

public class MainFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        Log.d(MainFragment.class.getName(), "onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(MainFragment.class.getName(), "onViewCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(MainFragment.class.getName(), "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(MainFragment.class.getName(), "onResume()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(MainFragment.class.getName(), "onStop()");
    }
}
