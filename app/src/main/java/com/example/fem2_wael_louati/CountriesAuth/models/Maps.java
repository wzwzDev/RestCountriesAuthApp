package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Maps {

    @SerializedName("googleMaps")
    @Expose
    private String googleMaps;

    @SerializedName("openStreetMaps")
    @Expose
    private String openStreetMaps;

    public String getGoogleMaps() {
        return googleMaps;
    }

    public void setGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
    }

    public String getOpenStreetMaps() {
        return openStreetMaps;
    }

    public void setOpenStreetMaps(String openStreetMaps) {
        this.openStreetMaps = openStreetMaps;
    }

    @Override
    public String toString() {
        return "Maps{" +
                "googleMaps='" + googleMaps + '\'' +
                ", openStreetMaps='" + openStreetMaps + '\'' +
                '}';
    }
}
