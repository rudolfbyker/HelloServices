package com.example.dolf.helloservices;

import android.app.Application;
import android.content.Intent;
import android.widget.Toast;

public class HelloApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        startService(new Intent(this, HelloService.class));
    }

}
