package com.example.chirag.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.chirag.retrofit.model.RetroPhoto;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainPresenter presenter = new MainPresenter();
        presenter.attachView(this);
    }

    @Override
    public void onResult(List<RetroPhoto> data) {
        Log.i("MAIN ACTIVITY", "RESPONSE: " + data.get(1).getTitle());
    }

    @Override
    public void onError(String errorMessage) {

    }
}
