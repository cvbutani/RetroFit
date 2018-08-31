package com.example.chirag.retrofit;

import com.example.chirag.retrofit.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * RetroFit
 * Created by Chirag on 22/08/18.
 */
public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
