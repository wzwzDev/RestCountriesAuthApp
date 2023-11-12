package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Flags {

    @SerializedName("png")
    @Expose
    private String png;

    @SerializedName("svg")
    @Expose
    private String svg;

    @SerializedName("alt")
    @Expose
    private String alt;

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "Flags{" +
                "png='" + png + '\'' +
                ", svg='" + svg + '\'' +
                ", alt='" + alt + '\'' +
                '}';
    }
}
