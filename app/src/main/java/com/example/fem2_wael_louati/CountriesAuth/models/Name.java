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
        StringBuilder sb = new StringBuilder();
        sb.append(Name.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("common");
        sb.append('=');
        sb.append(((this.common == null)?"<null>":this.common));
        sb.append(',');
        sb.append("official");
        sb.append('=');
        sb.append(((this.official == null)?"<null>":this.official));
        sb.append(',');
        sb.append("nativeName");
        sb.append('=');
        sb.append(((this.nativeName == null)?"<null>":this.nativeName));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
