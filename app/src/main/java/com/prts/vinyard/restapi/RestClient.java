package com.prts.vinyard.restapi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.prts.vinyard.restapi.RestConstants.BASE_URL;

public class RestClient {

    public static <T> T createRetrofitService(final Class<T> clazz) {

       /* OkHttpClient okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();*/
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
               /* .client(okHttpClient)*/
                .addConverterFactory(GsonConverterFactory.create())
               /* .addCallAdapterFactory(RxJava2CallAdapterFactory.create())*/
                .build();

        return retrofit.create(clazz);

    }
}
