
package com.test.maps.testmapsv2;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Tab1Activity extends Activity {
    private static final String TAG = Tab1Activity.class.getSimpleName();
    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.tab1_layout);
        try {
            MapsInitializer.initialize(this);
        } catch (GooglePlayServicesNotAvailableException impossible) {
            /* Impossible */
        }

        mapView = (MapView)findViewById(R.id.map_tab_1);
        mapView.onCreate(savedInstanceState);

        mapView.getMap().animateCamera(CameraUpdateFactory.newLatLng(new LatLng(51.510078, -0.117717)));

    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume");
        mapView.onResume();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause");
        mapView.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy");
        mapView.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "onSaveInstanceState");
        mapView.onSaveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }
}
