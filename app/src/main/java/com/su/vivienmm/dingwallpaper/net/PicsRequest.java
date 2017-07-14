package com.su.vivienmm.dingwallpaper.net;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chinaso on 2017/7/12.
 */

public class PicsRequest {
    static PicsAPI todayInstance;
    static PicsAPI welfareInstance;

    static String todayBase="https://Vivienmm.github.io";
    static String welfareBase="http://gank.io";

    static public PicsAPI getTodayPicInstance() {
        if (todayInstance != null)
            return todayInstance;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(todayBase)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        todayInstance = retrofit.create(PicsAPI.class);

        return todayInstance;
    }

    static public PicsAPI getNewsDetailInstance() {
        if (welfareInstance != null)
            return welfareInstance;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(welfareBase)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        welfareInstance = retrofit.create(PicsAPI.class);

        return welfareInstance;
    }
}
