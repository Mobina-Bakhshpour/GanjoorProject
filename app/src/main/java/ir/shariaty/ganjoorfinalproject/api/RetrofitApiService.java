package ir.shariaty.ganjoorfinalproject.api;

import java.util.List;

import ir.shariaty.ganjoorfinalproject.models.Biography;
import ir.shariaty.ganjoorfinalproject.models.Faal;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiService {

    @GET("api/ganjoor/poets")
    Call<List<Biography>> getBiographies();

    @GET("api/ganjoor/hafez/faal")
    Call<Faal> getFaal();

}
