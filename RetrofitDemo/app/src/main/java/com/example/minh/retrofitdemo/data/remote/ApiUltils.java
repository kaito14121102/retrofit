package com.example.minh.retrofitdemo.data.remote;

/**
 * Created by Minh on 9/21/2018.
 */

public class ApiUltils {
    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
