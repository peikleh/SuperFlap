package com.nevin.superflap.framework.game;

/**
 * Created by nevin on 9/15/2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.util.Log;


import com.nevin.superflap.R;
import com.nevin.superflap.framework.Screen;
import com.nevin.superflap.framework.implementation.AndroidGame;

public class SuperFlap extends AndroidGame {
    public static String map;
    boolean firstTimeCreate = true;

    /************************************************************
     Get the loading screen
     **************************************************************/
    public Screen getInitScreen() {
        if (firstTimeCreate) {
            firstTimeCreate = false;
        }
        InputStream is = getResources().openRawResource(R.raw.map1);
        map = convertStreamToString(is);
        return new SplashLoadingScreen(this);
    }

    @Override
    public void onBackPressed() {
        getCurrentScreen().backButton();
    }

    @Override
    public void onResume() {
        super.onResume();

        //Assets.theme.play();

    }

    @Override
    public void onPause() {
        super.onPause();
        //Assets.theme.pause();

    }

    private static String convertStreamToString(InputStream is) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append((line + "\n"));
            }
        } catch (IOException e) {
            Log.w("LOG", e.getMessage());
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                Log.w("LOG", e.getMessage());
            }
        }
        return sb.toString();
    }

}
