package com.example.chirag.retrofit.data;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.chirag.retrofit.GetDataService;
import com.example.chirag.retrofit.model.RetroPhoto;
import com.example.chirag.retrofit.network.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * RetroFit
 * Created by Chirag on 22/08/18.
 */
class ExampleUseCase {

    ExampleUseCase() {

    }

    void getData(final OnTaskCompletion callback) {
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);

        Call<List<RetroPhoto>> call = service.getAllPhotos();
        call.enqueue(new Callback<List<RetroPhoto>>() {
            @Override
            public void onResponse(@NonNull Call<List<RetroPhoto>> call, @NonNull Response<List<RetroPhoto>> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<List<RetroPhoto>> call, @NonNull Throwable t) {
                callback.onError(t.getMessage());
            }
        });
    }
}
