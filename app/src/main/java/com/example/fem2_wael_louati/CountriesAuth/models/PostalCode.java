package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class PostalCode {

    @SerializedName("format")
    @Expose
    private String format;

    @SerializedName("regex")
    @Expose
    private String regex;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public String toString() {
        return "PostalCode{" +
                "format='" + format + '\'' +
                ", regex='" + regex + '\'' +
                '}';
    }
}
