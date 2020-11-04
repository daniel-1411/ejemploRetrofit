package com.example.ejemploretrofid;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicioPeticion {
    @GET("carga_json.php?IDpartida=22578")
    Call<JSONPartida> listaPartida();
}
