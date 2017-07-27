package com.kimjinhwan.android.airbnbsearch;

/**
 * Created by XPS on 2017-07-27.
 */

public class Search {

    public static final int TYPE_ONE = 100;
    public static final int TYPE_TWO = 200;
    public static final int TYPE_ENTIRE = 300;

    public static final String AM_WIFI = "Wifi";
    public static final String AM_AIRCON = "Air Conditioner";
    public static final String AM_REFRIGE = "Refrigerator";
    public static final String AM_ELEVATOR = "Elevator";
    public static final String AM_PARKING = "Parking";


    public String checkinDate = null;
    public String checkoutDate = null;
    public int guest = 1;
    public int type;
    public int price_min;
    public int price_max;

    public int amenity[];
}
