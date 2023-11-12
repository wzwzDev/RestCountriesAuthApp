package com.example.fem2_wael_louati.CountriesAuth.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fem2_wael_louati.CountriesAuth.Country.CountryAdapter;
import com.example.fem2_wael_louati.CountriesAuth.Country.CountryRepository;
import com.example.fem2_wael_louati.CountriesAuth.Country.CountryViewModel;
import com.example.fem2_wael_louati.R;

public class CountryActivity extends AppCompatActivity {

    CountryViewModel countryViewModel;
    CountryRepository countryRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        CountryAdapter adapter = new CountryAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        countryViewModel = new ViewModelProvider(this).get(CountryViewModel.class);
        countryRepository = countryViewModel.getCountryRepository();
        countryRepository.refreshCountries();

        countryViewModel.getAllCountries().observe(this, countries -> {
            adapter.setCountries(countries);
        });

    }
}