package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Spa {

    @SerializedName("official")
    @Expose
    private String official;

    @SerializedName("common")
    @Expose
    private String common;

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    @Override
    public String toString() {
        return "Spa{" +
                "official='" + official + '\'' +
                ", common='" + common + '\'' +
                '}';
    }
}
