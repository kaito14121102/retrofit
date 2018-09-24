package com.example.minh.retrofitdemo.data.remote;

import android.text.TextUtils;

import com.example.minh.retrofitdemo.Constant;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Minh on 9/20/2018.
 */

public class RetrofitClient {
    public static Retrofit getClient(String baseUrl) {
        System.setProperty("http.keepAlive", "false");
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit;

        if (baseUrl != null && !TextUtils.isEmpty(baseUrl)) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        } else {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.HOME_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
