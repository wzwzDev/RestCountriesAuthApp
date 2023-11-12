package com.example.fem2_wael_louati;

import java.util.List;

import com.example.fem2_wael_louati.CountriesAuth.models.Country;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CountryRESTAPIService {

    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    // https://restcountries.com/v3.1/name/España
    @GET("v3.1/name/{countryName}")
    Call<List<Country>> getCountryByName(@Path("countryName") String countryName);

    // https://restcountries.com/v3.1/alpha/ESP
    @GET("v3.1/alpha/{countryCode}")
    Call<Country> getCountryByCode(@Path("countryCode") String countryCode);

}
