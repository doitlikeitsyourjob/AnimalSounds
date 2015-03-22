/*
 * Copyright 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.animalsounds.doitlikeitsyourjob.animalsounds;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;


/**
 * A fragment representing a single step in a wizard. The fragment shows a dummy title indicating
 * the page number, along with some dummy text.
 * <p/>
 * <p>This class is used by the  {@link ScreenSlideActivity} sample.</p>
 */

public class ScreenSlidePageFragment extends Fragment {

    String[] SoundTextArray;
    String[] AnimalTextArray;

    int[] ImageArray = new int[]
            {
                    R.drawable.bat,
                    R.drawable.bear,
                    R.drawable.bee,
                    R.drawable.bird,
                    R.drawable.bull,
                    R.drawable.bunny,
                    R.drawable.camel,
                    R.drawable.cat,
                    R.drawable.caterpillar,
                    R.drawable.chick,
                    R.drawable.chicken,
                    R.drawable.cow,
                    R.drawable.cricket,
                    R.drawable.crow,
                    R.drawable.deer,
                    R.drawable.dinosaur,
                    R.drawable.dog,
                    R.drawable.dolphin,
                    R.drawable.donkey,
                    R.drawable.duck,
                    R.drawable.elephant,
                    R.drawable.fly,
                    R.drawable.fox,
                    R.drawable.frog,
                    R.drawable.giraffe,
                    R.drawable.goat,
                    R.drawable.guineapig,
                    R.drawable.hippo,
                    R.drawable.hoopoe,
                    R.drawable.horse,
                    R.drawable.hyena,
                    R.drawable.lion,
                    R.drawable.monkey,
                    R.drawable.mosquito,
                    R.drawable.mouse,
                    R.drawable.owl,
                    R.drawable.parrot,
                    R.drawable.penguin,
                    R.drawable.pig,
                    R.drawable.pigeon,
                    R.drawable.puppy,
                    R.drawable.rat,
                    R.drawable.rhino,
                    R.drawable.rooster,
                    R.drawable.seagull,
                    R.drawable.seal,
                    R.drawable.sheep,
                    R.drawable.snake,
                    R.drawable.turkey,
                    R.drawable.walrus,
                    R.drawable.whale,
                    R.drawable.wolf

};

    int[] SoundArray = new int[]
            {
                    R.raw.bat,
                    R.raw.bear,
                    R.raw.bee,
                    R.raw.bird,
                    R.raw.bull,
                    R.raw.bunny,
                    R.raw.camel,
                    R.raw.cat,
                    R.raw.caterpillar,
                    R.raw.chick,
                    R.raw.chicken,
                    R.raw.cow,
                    R.raw.cricket,
                    R.raw.crow,
                    R.raw.deer,
                    R.raw.dinosaur,
                    R.raw.dog,
                    R.raw.dolphin,
                    R.raw.donkey,
                    R.raw.duck,
                    R.raw.elephant,
                    R.raw.fly,
                    R.raw.fox,
                    R.raw.frog,
                    R.raw.giraffe,
                    R.raw.goat,
                    R.raw.guineapig,
                    R.raw.hippo,
                    R.raw.hoopoe,
                    R.raw.horse,
                    R.raw.hyena,
                    R.raw.lion,
                    R.raw.monkey,
                    R.raw.mosquito,
                    R.raw.mouse,
                    R.raw.owl,
                    R.raw.parrot,
                    R.raw.penguin,
                    R.raw.pig,
                    R.raw.pigeon,
                    R.raw.puppy,
                    R.raw.rat,
                    R.raw.rhino,
                    R.raw.rooster,
                    R.raw.seagull,
                    R.raw.seal,
                    R.raw.sheep,
                    R.raw.snake,
                    R.raw.turkey,
                    R.raw.walrus,
                    R.raw.whale,
                    R.raw.wolf
};

    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE**
     */
    private int mPageNumber;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlidePageFragment create(int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlidePageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int min = 0;
        int max = 51;

        Random r = new Random();
        final int i1 = r.nextInt(max - min + 1) + min;

        // Inflate the layout containing a title and body text and picture
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_page, container, false);


        //Get SoundText Instructions via Array
        SoundTextArray = getResources().getStringArray(R.array.soundtext);
        AnimalTextArray = getResources().getStringArray(R.array.animaltext);

        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                 getString(R.string.title_template_step, AnimalTextArray[i1] ) );

        TextView tv2 = (TextView) rootView.findViewById(android.R.id.text2);
        tv2.setText(AnimalTextArray[i1] + " " + getString(R.string.make));

        //Assign TextView to Array
        final TextView tv = (TextView) rootView.findViewById(R.id.tv_recipe_desc);
        tv.setText(getString(R.string.tapinfo));

        ImageView iv = (ImageView) rootView.findViewById(R.id.iv_recipe_image);
        iv.setImageResource(ImageArray[i1]);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //play sound
                final MediaPlayer mp = MediaPlayer.create(getActivity(), SoundArray[i1] );
                mp.start();
                tv.setText(SoundTextArray[i1]);
            }
        });



        //Advert
        AdView adView = (AdView) rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)        // All emulators
                .addTestDevice("3244EEFC41AB498C0365FD48218D1D96")  // My HTC One X test phone
                .build();
        adView.loadAd(adRequest);

        return rootView;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }

/**@Override public void onClick(View view) {
Toast toast = Toast.makeText(getActivity(), "Test1", Toast.LENGTH_SHORT);
toast.show();
}
 */


}



