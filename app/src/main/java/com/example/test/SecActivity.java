package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.test.bean.Name;

import javax.inject.Inject;

public class SecActivity extends AppCompatActivity {
    private static final String TAG = "secActivity";
    @Inject
    Name name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        ((MyApplication)getApplication()).getAppComponent().inject(this);
        Log.d(TAG, "name=" + name.hashCode());
    }
}