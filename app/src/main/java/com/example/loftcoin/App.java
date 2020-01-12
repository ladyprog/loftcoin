package com.example.loftcoin;

import android.app.Application;
import android.content.SharedPreferences;

import com.example.loftcoin.prefs.Prefs;
import com.example.loftcoin.prefs.PrefsImpl;

public class App extends Application {

    private Prefs prefs;

    @Override
    public void onCreate() {
        super.onCreate();

        prefs = new PrefsImpl(this);
    }

    public Prefs getPrefs() {
        return prefs;
    }
}
