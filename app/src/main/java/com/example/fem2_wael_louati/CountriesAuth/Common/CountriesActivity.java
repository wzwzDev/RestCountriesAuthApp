package com.example.fem2_wael_louati.CountriesAuth.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fem2_wael_louati.CountryRESTAPIService;
import com.example.fem2_wael_louati.R;

import java.util.List;
import com.example.fem2_wael_louati.CountriesAuth.models.Country;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CountriesActivity extends AppCompatActivity {

    private static final String API_BASE_URL = "https://restcountries.com/";

    private static final String LOG_TAG = "MiW";

    private TextView tvRespuesta;
    private EditText etCountryName;

    private CountryRESTAPIService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tvRespuesta = findViewById(R.id.tvRespuesta);
        etCountryName = findViewById(R.id.countryName);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(CountryRESTAPIService.class);
    }

    public void obtenerInfoPais(View v) {
        String countryName = etCountryName.getText().toString();
        Log.i(LOG_TAG, "obtenerInfoPais => país: " + countryName);
        tvRespuesta.setText(null);

        Call<List<Country>> call_async = apiService.getCountryByName(countryName);

        // Asíncrona
        call_async.enqueue(new Callback<List<Country>>() {

            /**
             * Invoked for a received HTTP response.
             * <p>
             * Note: An HTTP response may still indicate an application-level failure such as a 404 or 500.
             * Call {@link Response#isSuccessful()} to determine if the response indicates success.
             */
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
                List<Country> countryList = response.body();
                if (null != countryList) {
                    Log.i(LOG_TAG, "Lista: " + countryList);
                    for (Country country : countryList) {
                        tvRespuesta.append(country.toString() + "\n\n");
                                           }
                    Log.i(LOG_TAG, "obtenerInfoPais => respuesta=" + countryList);
                } else {
                    tvRespuesta.setText(getString(R.string.strError));
                    Log.i(LOG_TAG, getString(R.string.strError));
                }
            }

            /**
             * Invoked when a network exception occurred talking to the server or when an unexpected
             * exception occurred creating the request or processing the response.
             */
            @Override
            public void onFailure(Call<List<Country>> call, Throwable t) {
                Toast.makeText(
                        getApplicationContext(),
                        "ERROR: " + t.getMessage(),
                        Toast.LENGTH_LONG
                ).show();
                Log.e(LOG_TAG, t.getMessage());
            }
        });

        // Síncrona... no aquí => NetworkOnMainThreadException
//        Call<Country> call_sync = apiService.getCountryByName("spain");
//        try {
//            Country country = call_sync.execute().body();
//            Log.i(LOG_TAG, "SYNC => " + country.toString());
//        } catch (IOException e) {
//            Log.e(LOG_TAG, e.getMessage());
//        }
    }
}