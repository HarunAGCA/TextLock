package com.agca.annuncements.textlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {


    private int SLEEP_TIME = 3000; // millisecond

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        ActivityLaucher activityLaucher = new ActivityLaucher();
        activityLaucher.start();
    }


    private class ActivityLaucher extends Thread {

        @Override
        public void run() {

            try {

                Thread.sleep(SLEEP_TIME);

            } catch (InterruptedException e) {

            } finally {

                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();

            }
        }


    }
}
