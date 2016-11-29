package com.acv.topcars.api;

import com.acv.topcars.model.Car;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by vinicius.castro on 11/19/2016.
 */

public interface CarsAPI {

    @GET("/carros/tipo/{tipo}")
    Call<List<Car>> findBy(@Path("tipo") String tipo);

}
