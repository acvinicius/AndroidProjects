package com.acv.times.api;

import com.acv.times.model.Times;
import com.acv.topcars.model.Car;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by vinicius.castro on 11/19/2016.
 */

public interface TimesAPI {

    @GET("/carros/tipo/{tipo}")
    Call<List<Times>> findBy(@Path("tipo") String tipo);

}
