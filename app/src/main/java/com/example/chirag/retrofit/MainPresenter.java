package com.example.chirag.retrofit;

import com.example.chirag.retrofit.data.DataManager;
import com.example.chirag.retrofit.data.OnTaskCompletion;
import com.example.chirag.retrofit.model.RetroPhoto;

import java.util.List;

/**
 * RetroFit
 * Created by Chirag on 22/08/18.
 */
public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mCallback;
    private DataManager mDataManager;

    MainPresenter() {
        mDataManager = DataManager.getInstace();
    }

    @Override
    public void getData() {
        mDataManager.getNewBatchOfData(new OnTaskCompletion() {
            @Override
            public void onSuccess(List<RetroPhoto> data) {
                mCallback.onResult(data);
            }

            @Override
            public void onError(String errorMessage) {
                mCallback.onError(errorMessage);
            }
        });
    }

    @Override
    public void attachView(MainContract.View view) {
        mCallback = view;
        getData();
    }
}
