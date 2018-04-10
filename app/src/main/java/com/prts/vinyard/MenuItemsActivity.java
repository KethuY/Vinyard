package com.prts.vinyard;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.prts.vinyard.models.RootObject;
import com.prts.vinyard.restapi.RestClient;
import com.prts.vinyard.restapi.RestService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MenuItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_items);

        RestService restService= RestClient.createRetrofitService(RestService.class);
        Call<RootObject> rootObjectCall=restService.getMenuItems();
        rootObjectCall.enqueue(new Callback<RootObject>() {
            @Override
            public void onResponse(@NonNull Call<RootObject> call, @NonNull Response<RootObject> response) {
                Log.e("TAG","Code"+response.code());
                Log.e("TAG","Body "+new Gson().toJson(response.body()));

                RootObject rootObject=response.body();
            }

            @Override
            public void onFailure(@NonNull Call<RootObject> call, @NonNull Throwable t) {
                Log.e("TAG","Exception "+t.getMessage());
            }
        });

    }
}
