package com.example.dolf.helloservices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This Activity needs to exist because Broadcasts are not received by the app until the user has
 * started it at least once.
 */
public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }
}
