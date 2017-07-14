package com.su.vivienmm.dingwallpaper.net;

import com.su.vivienmm.dingwallpaper.bean.TodayPics;
import com.su.vivienmm.dingwallpaper.bean.WelfarePics;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by chinaso on 2017/7/12.
 */

public interface PicsAPI {
    @GET("/wallpaper.json")
    Observable<TodayPics> getTodayPics();

    @GET("/api/data/福利/10/1")
    Observable<WelfarePics> getWelfarePics();
}
