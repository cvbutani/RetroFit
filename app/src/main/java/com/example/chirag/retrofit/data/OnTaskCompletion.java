package com.example.chirag.retrofit.data;

import com.example.chirag.retrofit.model.RetroPhoto;

import java.util.List;

/**
 * RetroFit
 * Created by Chirag on 22/08/18.
 */
public interface OnTaskCompletion {
    void onSuccess(List<RetroPhoto> data);

    void onError(String errorMessage);
}
