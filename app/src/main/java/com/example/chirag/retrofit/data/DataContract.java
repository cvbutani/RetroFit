package com.example.chirag.retrofit.data;

/**
 * RetroFit
 * Created by Chirag on 22/08/18.
 */
public interface DataContract {
    void getNewBatchOfData(final OnTaskCompletion callback);
}
