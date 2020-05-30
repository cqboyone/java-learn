package com.vv.learn.observer;

/**
 * 这是观察者模式案例
 */
public class TestClass {
    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();

        new CurrentBoard(weatherDate);
        // 改变参数后,CurrentBoard对象会运行内部的update方法
        weatherDate.setName("卧槽");

    }
}
