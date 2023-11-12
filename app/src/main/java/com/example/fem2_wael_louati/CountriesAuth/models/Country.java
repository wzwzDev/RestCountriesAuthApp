package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Country {

    @SerializedName("name")
    @Expose
    private Name name;

    @SerializedName("tld")
    @Expose
    private List<String> tld;

    @SerializedName("cca2")
    @Expose
    private String cca2;

    @SerializedName("capital")
    @Expose
    private List<String> capital;

    @SerializedName("altSpellings")
    @Expose
    private List<String> altSpellings;

    @SerializedName("region")
    @Expose
    private String region;

    @SerializedName("subregion")
    @Expose
    private String subregion;

    @SerializedName("languages")
    @Expose
    private Languages languages;

    @SerializedName("borders")
    @Expose
    private List<String> borders;

    @SerializedName("area")
    @Expose
    private Double area;

    @SerializedName("flag")
    @Expose
    private String flag;

    @SerializedName("maps")
    @Expose
    private Maps maps;

    @SerializedName("population")
    @Expose
    private Integer population;

    @SerializedName("timezones")
    @Expose
    private List<String> timezones;

    @SerializedName("flags")
    @Expose
    private Flags flags;

    @SerializedName("capitalInfo")
    @Expose
    private CapitalInfo capitalInfo;

    @SerializedName("postalCode")
    @Expose
    private PostalCode postalCode;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Country.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("tld");
        sb.append('=');
        sb.append(((this.tld == null)?"<null>":this.tld));
        sb.append(',');
        sb.append("cca2");
        sb.append('=');
        sb.append(((this.cca2 == null)?"<null>":this.cca2));
        sb.append(',');
        sb.append("capital");
        sb.append('=');
        sb.append(((this.capital == null)?"<null>":this.capital));
        sb.append(',');
        sb.append("altSpellings");
        sb.append('=');
        sb.append(((this.altSpellings == null)?"<null>":this.altSpellings));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("subregion");
        sb.append('=');
        sb.append(((this.subregion == null)?"<null>":this.subregion));
        sb.append(',');
        sb.append("borders");
        sb.append('=');
        sb.append(((this.borders == null)?"<null>":this.borders));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("flag");
        sb.append('=');
        sb.append(((this.flag == null)?"<null>":this.flag));
        sb.append(',');
        sb.append("maps");
        sb.append('=');
        sb.append(((this.maps == null)?"<null>":this.maps));
        sb.append(',');
        sb.append("population");
        sb.append('=');
        sb.append(((this.population == null)?"<null>":this.population));
        sb.append(',');
        sb.append("timezones");
        sb.append('=');
        sb.append(((this.timezones == null)?"<null>":this.timezones));
        sb.append(',');
        sb.append("flags");
        sb.append('=');
        sb.append(((this.flags == null)?"<null>":this.flags));
        sb.append(',');
        sb.append("capitalInfo");
        sb.append('=');
        sb.append(((this.capitalInfo == null)?"<null>":this.capitalInfo));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
