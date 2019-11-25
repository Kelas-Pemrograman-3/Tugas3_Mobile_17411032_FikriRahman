package com.fikri.belajarmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, "pk.eyJ1IjoiZmlrcmlyMTIiLCJhIjoiY2szOWl4NHF3MDN0MjNubzI5YjJsaG5oaSJ9.cITvdfgaI8gOTfn_PV3ekg");
        setContentView(R.layout.activity_main);
        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull MapboxMap mapboxMap) {
                mapboxMap.setStyle(Style.MAPBOX_STREETS, new Style.OnStyleLoaded() {
                    @Override
                    public void onStyleLoaded(@NonNull Style style) {

                        // Map is set up and the style has loaded. Now you can add data or make other map adjustments.


                    }
                });
                bandarlampung ( -5.446357,105.263334,mapboxMap);
                bekasi( -6.235622, 106.994534,mapboxMap);
                serang (-6.119807, 106.154113,mapboxMap);
                bogor (-6.605184, 106.798388,mapboxMap);
                bandung(-6.936268, 107.606052,mapboxMap);
            }
        });
    }

    public void bandarlampung (double lat,double lon, MapboxMap mapboxMap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("Ini Posisi Bandar Lampung");
        options.position(new LatLng(lat, lon));
        mapboxMap.addMarker(options);
    }
    public void bekasi (double lat,double lon, MapboxMap mapboxMap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("Ini Posisi Bekasi");
        options.position(new LatLng(lat, lon));
        mapboxMap.addMarker(options);
    }
    public void serang (double lat,double lon, MapboxMap mapboxMap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("Ini Posisi Serang");
        options.position(new LatLng(lat, lon));
        mapboxMap.addMarker(options);
    }
    public void bogor (double lat,double lon, MapboxMap mapboxMap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("Ini Posisi Bogor");
        options.position(new LatLng(lat, lon));
        mapboxMap.addMarker(options);
    }
    public void bandung (double lat,double lon, MapboxMap mapboxMap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("Ini Posisi Bandung");
        options.position(new LatLng(lat, lon));
        mapboxMap.addMarker(options);
    }


    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }
}