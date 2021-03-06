package com.su.vivienmm.dingwallpaper.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by chinaso on 2017/7/12.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariables();
        initView();
        loaderData();
    }

    /**
     * 做初始化方面的工作,比如接收上一个界面的Intent
     */
    public abstract void initVariables();

    /**
     * 初始化控件
     */
    public abstract void initView();

    /**
     * 加载数据
     */
    public abstract void loaderData();

}
