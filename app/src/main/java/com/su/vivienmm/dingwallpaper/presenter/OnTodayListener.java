package com.su.vivienmm.dingwallpaper.presenter;

import com.su.vivienmm.dingwallpaper.bean.TodayPics;

/**
 * Created by chinaso on 2017/7/12.
 */

public interface OnTodayListener {
    /**
     * 成功的时候回调
     * @param todayPics joke
     */
    void  onSuccess(TodayPics todayPics);

    /**
     * 失败的时候回调
     */
    void  onError();
}
