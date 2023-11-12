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
        StringBuilder sb = new StringBuilder();
        sb.append(Maps.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("googleMaps");
        sb.append("=\"");
        sb.append(((this.googleMaps == null)?"<null>":this.googleMaps));
        sb.append("\",");
        sb.append("openStreetMaps");
        sb.append("=\"");
        sb.append(((this.openStreetMaps == null)?"<null>":this.openStreetMaps));
        sb.append("\",");
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
