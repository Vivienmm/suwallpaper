package com.su.vivienmm.dingwallpaper.presenter.impl;

import com.su.vivienmm.dingwallpaper.bean.TodayPics;
import com.su.vivienmm.dingwallpaper.model.TodayModel;
import com.su.vivienmm.dingwallpaper.model.impl.TodayModelImpl;
import com.su.vivienmm.dingwallpaper.presenter.OnTodayListener;
import com.su.vivienmm.dingwallpaper.presenter.TodayPresenter;
import com.su.vivienmm.dingwallpaper.view.TodayView;

/**
 * Created by chinaso on 2017/7/12.
 */

public class TodayPresenterImpl implements TodayPresenter,OnTodayListener {
    // P层作为M层和V层的衔接者，需要持有JokeView和JokeModel的引用

    private TodayModel mTodatModel = new TodayModelImpl();

    private TodayView mTodayView;

    public TodayPresenterImpl(TodayView todayView){
        mTodayView=todayView;
    }
    @Override
    public void getTodayPics() {
        mTodayView.showLoading();
        mTodatModel.getTodayPics(this);
    }

    @Override
    public void onSuccess(TodayPics todayPics) {
        mTodayView.setTodayPics(todayPics);
    }

    @Override
    public void onError() {
        mTodayView.showError();
    }
}
