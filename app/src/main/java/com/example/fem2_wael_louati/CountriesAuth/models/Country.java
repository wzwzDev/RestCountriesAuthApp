package com.example.fem2_wael_louati.CountriesAuth.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.StringJoiner;

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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<String> getTld() {
        return tld;
    }

    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Maps getMaps() {
        return maps;
    }

    public void setMaps(Maps maps) {
        this.maps = maps;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public CapitalInfo getCapitalInfo() {
        return capitalInfo;
    }

    public void setCapitalInfo(CapitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "Country [", "]");

        joiner.add("name= " + name+"\n")

                .add("capital=" + capital+"\n")

                .add("area=" + area+"\n")
                .add("flag=" + flag+"\n")

                .add("flags=" + flags+"\n")
                .add("capitalInfo=" + capitalInfo+"\n");


        return joiner.toString();
    }


/*
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
    }*/
}
