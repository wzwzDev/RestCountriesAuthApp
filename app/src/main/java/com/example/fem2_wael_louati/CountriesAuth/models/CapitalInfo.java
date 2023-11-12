package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CapitalInfo {

    @SerializedName("latlng")
    @Expose
    private List<Double> latlng;

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    @Override
    public String toString() {
        return "CapitalInfo{" +
                "latlng=" + latlng +
                '}';
    }
}
