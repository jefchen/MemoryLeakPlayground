package com.jeffrey.memoryleakplayground;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private static final String TAG_RETAINED_FRAGMENT = "RetainedFragment";

    public static final List<WeakReference<Context>> contextList = new ArrayList<>();
    MainFragment fragment = new MainFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            fragment = new MainFragment();
            getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment, TAG_RETAINED_FRAGMENT)
                .commit();
        } else {
            getSupportFragmentManager()
                .findFragmentByTag(TAG_RETAINED_FRAGMENT);
        }
        Log.d(TAG, "main fragment = " + fragment);

        contextList.add(new WeakReference<Context>(this));
        Iterator<WeakReference<Context>> i = contextList.iterator();
        while (i.hasNext()) {
            WeakReference<Context> w = i.next();
            if (w.get() == null) {

            }
            if (weakReference.get() == null) {
                continue;
            }
        }
        Log.d(TAG, "context count = " + contextList.size());
    }
}
