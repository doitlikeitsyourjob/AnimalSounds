package com.animalsounds.doitlikeitsyourjob.animalsounds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
//import com.jirbo.adcolony.AdColony;
//import com.jirbo.adcolony.AdColonyVideoAd;
//import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by ndRandall on 07/10/13.
 */
public class MainMenu extends Activity {

    //private InterstitialAd interstitial;

    public void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.home);
        super.onCreate(savedInstanceState);

        //setupAdvert();
        //setupAdColony();
        setupUIEvents();

    }

    //private void setupAdColony() {
    //    AdColony.configure(this, "version:1.3,store:google", "app5ca64a9c0956446b89", "vzb7284253eca949fbbc");
    //    AdColonyVideoAd ad = new AdColonyVideoAd();
    //    ad.show();
    //}

    //private void setupAdvert() {
    //    // Look up the AdView as a resource and load a request.
    //    AdView adView = (AdView) this.findViewById(R.id.adView);
    //    AdRequest adRequest = new AdRequest.Builder()
    //            .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)        // All emulators
    //            .addTestDevice("3244EEFC41AB498C0365FD48218D1D96")  // My HTC One X test phone
    //            .build();
    //    adView.loadAd(adRequest);
    //    }

    void setupUIEvents() {

        ImageView thebutton = (ImageView) findViewById(R.id.imageView);
        thebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleButtonPlayClick();
            }
        });

    }

    void handleButtonPlayClick() {
        Intent intent = new Intent(this, ScreenSlideActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Boolean handled = true;

        int id = item.getItemId();

        switch (id) {
            case R.id.actionExit:
                onClickMenuExit(item);
                break;
            default:
                handled = super.onOptionsItemSelected(item);
        }
        return handled;
    }

    public void onClickMenuExit(MenuItem item) {
        finish();
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
