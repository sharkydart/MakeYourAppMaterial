package com.example.xyzreader.remote;

import android.util.Log;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json" );
        } catch (MalformedURLException ignored) {
            // TO DO: throw a real error
            Log.e(TAG, "Please check your internet connection.");
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BASE_URL = url;
    }
}
