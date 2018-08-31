package com.example.chirag.retrofit;

import com.example.chirag.retrofit.model.RetroPhoto;

import java.util.List;

/**
 * RetroFit
 * Created by Chirag on 22/08/18.
 */
public interface MainContract {
    interface View {
        void onResult(List<RetroPhoto> data);

        void onError(String errorMessage);
    }

    interface Presenter {
        void getData();

        void attachView(MainContract.View view);
    }
}
