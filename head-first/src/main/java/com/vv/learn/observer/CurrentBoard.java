package com.vv.learn.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 监听者
 */
public class CurrentBoard implements Observer {

    private Observable observable;

    public CurrentBoard(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        WeatherDate weatherDate = (WeatherDate) o;
        System.out.println("接收到了数据:"+weatherDate.getName());
    }
}
