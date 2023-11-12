package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Name {

    @SerializedName("common")
    @Expose
    private String common;

    @SerializedName("official")
    @Expose
    private String official;

    @SerializedName("nativeName")
    @Expose
    private NativeName nativeName;

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public NativeName getNativeName() {
        return nativeName;
    }

    public void setNativeName(NativeName nativeName) {
        this.nativeName = nativeName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "common='" + common + '\'' +
                ", official='" + official + '\'' +
                ", nativeName=" + nativeName +
                '}';
    }
}
