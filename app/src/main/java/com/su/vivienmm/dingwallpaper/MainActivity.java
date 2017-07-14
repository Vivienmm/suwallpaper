package com.su.vivienmm.dingwallpaper;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.su.vivienmm.dingwallpaper.base.BaseActivity;
import com.su.vivienmm.dingwallpaper.bean.TodayPics;
import com.su.vivienmm.dingwallpaper.presenter.TodayPresenter;
import com.su.vivienmm.dingwallpaper.presenter.impl.TodayPresenterImpl;
import com.su.vivienmm.dingwallpaper.view.TodayView;
import com.su.vivienmm.dingwallpaper.view.adapter.MyRecyclerAdapter;
import com.su.vivienmm.dingwallpaper.view.recycler.DividerItemDecoration;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements TodayView {


    @Bind(R.id.picRecycler)
    RecyclerView picRecycler;

    private TodayPresenter mTodayPresenter = null;
    private MyRecyclerAdapter mAdapter;
    private ArrayList<String> picUrls = null;
    @Override
    public void initVariables() {
        picUrls=new ArrayList<>();
        mTodayPresenter = new TodayPresenterImpl(this);
    }

    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initRecycler();

    }

    private void initRecycler() {
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        picRecycler.setLayoutManager(mLayoutManager);
        //设置分隔线
        //  picRecycler .addItemDecoration(new DividerItemDecoration(MainActivity.this,LinearLayoutManager.VERTICAL));
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        picRecycler.setHasFixedSize(true);
        //创建并设置Adapter
        mAdapter = new MyRecyclerAdapter(this,picUrls);
        picRecycler.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new MyRecyclerAdapter.OnItemClickListener() {

            @Override
            public void onLongClick(int position) {
                Toast.makeText(MainActivity.this,"onLongClick事件       您点击了第："+position+"个Item",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClick(int position) {
                Toast.makeText(MainActivity.this,"onClick事件       您点击了第："+position+"个Item",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void loaderData() {
        mTodayPresenter.getTodayPics();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void setTodayPics(TodayPics pics) {
        picUrls.add(pics.getGtoday());
        picUrls.addAll(pics.getRecommends());
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
