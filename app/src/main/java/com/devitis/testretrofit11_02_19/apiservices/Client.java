package com.devitis.testretrofit11_02_19.apiservices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Diana on 11.02.2019.
 */

public class Client {

    private static Retrofit retrofit;
    private static final String BASE_URL = "http://...";

    public static Retrofit getRetrofit() {
        if (retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
