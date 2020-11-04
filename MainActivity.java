package com.example.ejemploretrofid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://formadorestic.com/pasapalabra/").addConverterFactory(GsonConverterFactory.create())
                .build();
        ServicioPeticion service = retrofit.create(ServicioPeticion.class);
        Call<JSONPartida> llamada_servicio=service.listaPartida();
        llamada_servicio.enqueue(new Callback<JSONPartida>() {
            @Override
            public void onResponse(Call<JSONPartida> call, Response<JSONPartida> response) {
                JSONPartida p=response.body();
                Log.d("Llamada", p.toString());
            }

            @Override
            public void onFailure(Call<JSONPartida> call, Throwable t) {
                Log.d("Llamada", t.getMessage());
            }
        });
    }
}