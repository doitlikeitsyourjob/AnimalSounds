package com.animalsounds.doitlikeitsyourjob.animalsounds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by ndRandall on 07/10/13.
 */
public class SplashScreen extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        final int SPLASH_DISPLAY_LENGTH = 1000;

        // New Handler to start the Menu-Activity and close this Splash-Screen after some seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent that will start the Menu-Activity.


                Intent mainIntent = new Intent(SplashScreen.this, MainMenu.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }


}