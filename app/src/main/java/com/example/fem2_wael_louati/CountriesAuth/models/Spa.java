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
        StringBuilder sb = new StringBuilder();
        sb.append(Spa.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("official");
        sb.append('=');
        sb.append(((this.official == null)?"<null>":this.official));
        sb.append(',');
        sb.append("common");
        sb.append('=');
        sb.append(((this.common == null)?"<null>":this.common));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
