package com.template.project.core.request.http.retrofit;

import com.template.project.core.request.mime.TypeJsonString;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface RetroHttpService {

    @POST("/users")
    public void userRegister(@Body TypeJsonString playerJson, Callback<Response> callback);

    @GET("/users/{userId}")
    public void userGetDetails(@Path("userId") String userId, Callback<Response> callback);

    @POST("/users/{userId}")
    public void userUpdateDetails(@Path("userId") String userId, @Body TypeJsonString playerJson,
                                  Callback<Response> callback);

}