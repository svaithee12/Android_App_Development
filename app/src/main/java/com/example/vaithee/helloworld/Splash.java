package com.example.vaithee.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by vaithee on 28/4/15.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){

            @Override
            public void run() {
                try{
                    sleep(7000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent openMainActivity = new Intent("com.example.vaithee.helloworld.MAINACTIVITY");
                    startActivity(openMainActivity);
                }
            }
        };

        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }
}
