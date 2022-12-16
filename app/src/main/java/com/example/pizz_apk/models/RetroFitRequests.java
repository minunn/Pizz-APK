package com.example.pizz_apk.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;

public interface RetroFitRequests {
    @GET("/api/produit/getall")
    Call<RetroFitResponse<ArrayList<PlatPropose>>> getPlats();
    @POST("/api/user/login")
    Call<LoginResult> executeLogin(@Body HashMap<String, String> map);
    @POST("/api/user/signup")
    Call<Void> executeSignup(@Body HashMap<String, String> map);
    @POST("/api/user/signup")
    Call<Void> executeGuest(@Body HashMap<String, String> map);
    @POST("/api/adresse/add_adresse")
    Call<Void> executeAddAdresse(@Body HashMap<String, String> map);

}
