package com.example.bakugo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_timeout= 4000;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set darwablwe and action bar, start action bar.[grantUriPermission(handler;home page.
        Log.i(TAG, "onCreate: splash screen and void "););]

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run (){
                Intent homeIntent = new Intent(MainActivity.this, OnboardingActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_timeout);

        @Override
                private void
    }

}
