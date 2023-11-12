package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Languages {

    @SerializedName("spa")
    @Expose
    private String spa;

    public String getSpa() {
        return spa;
    }

    public void setSpa(String spa) {
        this.spa = spa;
    }

    @Override
    public String toString() {
        return "Languages{" +
                "spa='" + spa + '\'' +
                '}';
    }
}
