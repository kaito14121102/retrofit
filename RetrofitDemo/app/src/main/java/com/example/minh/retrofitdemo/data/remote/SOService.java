package com.example.minh.retrofitdemo.data.remote;

import com.example.minh.retrofitdemo.data.model.SOAnswersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Minh on 9/20/2018.
 */

public interface SOService {
    @GET("/answers")
    Call<SOAnswersResponse> getAnswers(@Query("order") String tags, @Query("sort") String sort, @Query("site") String site);
}
