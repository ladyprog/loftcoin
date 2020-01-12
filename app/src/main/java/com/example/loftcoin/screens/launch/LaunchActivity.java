package com.example.loftcoin.screens.launch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.loftcoin.App;
import com.example.loftcoin.R;
import com.example.loftcoin.prefs.Prefs;
import com.example.loftcoin.screens.welcome.WelcomeActivity;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        Prefs prefs = ((App)getApplication()).getPrefs();

        if (prefs.isFirstLaunch()) {
            WelcomeActivity.start(this);
        } else {
            //TODO launch rate screen
        }
    }

}
