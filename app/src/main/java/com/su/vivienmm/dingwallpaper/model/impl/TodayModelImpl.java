package com.su.vivienmm.dingwallpaper.model.impl;

import com.su.vivienmm.dingwallpaper.bean.TodayPics;
import com.su.vivienmm.dingwallpaper.model.TodayModel;
import com.su.vivienmm.dingwallpaper.net.PicsRequest;
import com.su.vivienmm.dingwallpaper.presenter.OnTodayListener;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by chinaso on 2017/7/12.
 */

public class TodayModelImpl implements TodayModel {

    @Override
    public void getTodayPics(final OnTodayListener mOnTodatListener) {
        PicsRequest.getTodayPicInstance().getTodayPics()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<TodayPics>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(TodayPics todayPics) {
                        if (todayPics != null) {
                            mOnTodatListener.onSuccess(todayPics);
                        } else {
                            mOnTodatListener.onError();
                        }
                    }
                });
    }
}
