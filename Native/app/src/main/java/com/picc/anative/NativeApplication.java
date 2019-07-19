package com.picc.anative;

import android.app.Application;

public class NativeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //FlutterMain.startInitialization(this);
    }
}
