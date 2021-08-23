package com.example.feednews;

import android.app.Application;

import com.onesignal.OneSignal;

public class NotifClass extends Application {
    private static final String ONESIGNAL_APP_ID = "5d0e9889-7703-4f17-bcee-8e293fbe6a96";

    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
