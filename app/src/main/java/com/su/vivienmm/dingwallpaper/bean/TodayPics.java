package com.su.vivienmm.dingwallpaper.bean;

import java.util.List;

/**
 * Created by chinaso on 2017/7/12.
 */

public class TodayPics {

    /**
     * gtoday : http://image.nationalgeographic.com.cn/2017/0706/20170706031700372.jpg
     * recommends : ["https://vivienmm.github.io/today1.jpg","https://vivienmm.github.io/today3.jpg"]
     */

    private String gtoday;
    private List<String> recommends;

    public String getGtoday() {
        return gtoday;
    }

    public void setGtoday(String gtoday) {
        this.gtoday = gtoday;
    }

    public List<String> getRecommends() {
        return recommends;
    }

    public void setRecommends(List<String> recommends) {
        this.recommends = recommends;
    }
}
