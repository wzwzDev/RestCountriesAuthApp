package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class NativeName {

    @SerializedName("spa")
    @Expose
    private Spa spa;

    public Spa getSpa() {
        return spa;
    }

    public void setSpa(Spa spa) {
        this.spa = spa;
    }

    @Override
    public String toString() {
        return "NativeName{" +
                "spa=" + spa +
                '}';
    }
}
