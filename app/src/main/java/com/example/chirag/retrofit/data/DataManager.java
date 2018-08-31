package com.example.chirag.retrofit.data;

/**
 * RetroFit
 * Created by Chirag on 22/08/18.
 */
public class DataManager implements DataContract {
    private static DataManager sDataManager;
    private static ExampleUseCase mExampleUseCase;

    private DataManager() {
    }

    public static DataManager getInstace() {
        if (sDataManager == null) {
            sDataManager = new DataManager();
            mExampleUseCase = new ExampleUseCase();
        }
        return sDataManager;
    }

    @Override
    public void getNewBatchOfData(final OnTaskCompletion callback) {
        mExampleUseCase.getData(callback);
    }
}
