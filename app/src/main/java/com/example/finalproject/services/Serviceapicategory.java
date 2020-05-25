package com.example.finalproject.services;

import com.example.finalproject.model.Cakelist;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Serviceapicategory {

    @GET("cake.php")
    abstract public Call<Cakelist> getCake();


}

