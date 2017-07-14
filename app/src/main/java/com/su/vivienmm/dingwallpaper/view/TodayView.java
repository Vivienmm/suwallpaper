package com.su.vivienmm.dingwallpaper.view;

import com.su.vivienmm.dingwallpaper.bean.TodayPics;

/**
 * Created by chinaso on 2017/7/12.
 */

public interface TodayView {
    void showLoading();
    void hideLoading();
    void showError();
    void setTodayPics(TodayPics pics);
}
