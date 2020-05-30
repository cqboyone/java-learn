package com.vv.learn.observer;

import java.util.Observable;

/**
 * 一个被观察/监听的数据源
 */
public class WeatherDate extends Observable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // 注意这里一定要设置状态
        setChanged();
        notifyObservers(name);
    }
}
