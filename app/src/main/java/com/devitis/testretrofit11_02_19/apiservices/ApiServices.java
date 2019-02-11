package com.devitis.testretrofit11_02_19.apiservices;

import com.devitis.testretrofit11_02_19.model.Users;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Diana on 11.02.2019.
 */

public interface ApiServices {

    @FormUrlEncoded
    @POST ("/addsomthURL")
    Call<Users> CreateUsers (@FieldMap Map<String, String> params);

    @GET("/smthURL")
    Call<List<Users>> getAllUsers();
}
