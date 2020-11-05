package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.test.bean.Name;
import com.example.test.bean.Network;
import com.example.test.bean.Person;
import com.example.test.bean.Presenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    Name name;
    @Inject
    Name name2;
    @Inject
    Person person;
    @Inject
    Person person2;
    @Inject
    Presenter presenter1;
    @Inject
    Presenter presenter2;
    @Inject
    Network network;
    @Inject
    Network network1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication)getApplication()).getAppComponent().inject(this);
        Log.d(TAG, "name=" + name.hashCode());
        Log.d(TAG, "name2=" + name2.hashCode());
        Log.d(TAG, "person=" + person.hashCode());
        Log.d(TAG, "person2=" + person2.hashCode());
        Log.d(TAG, "presenter1=" + presenter1.hashCode());
        Log.d(TAG, "presenter2=" + presenter2.hashCode());
        Log.d(TAG, "network=" + network.hashCode());
        Log.d(TAG, "network1=" + network1.hashCode());
    }

    public void second(View view) {
        startActivity(new Intent(MainActivity.this, SecActivity.class));
    }
}