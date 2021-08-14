package com.lana.purwakartaku.model;

import com.google.android.gms.maps.model.LatLng;

/**
 * Lana Septiana
 * IF10
 * 10118416
 * 14/08/2021
 */

public class ModelMapLocation {

    public String name;
    public LatLng center;

    public ModelMapLocation() {}

    public ModelMapLocation(String name, double lat, double lng) {
        this.name = name;
        this.center = new LatLng(lat, lng);
    }
}
