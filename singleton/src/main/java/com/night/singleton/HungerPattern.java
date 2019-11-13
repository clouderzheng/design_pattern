package com.night.singleton;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/13 10:58
 * 饿汉单例模式 在自己加载时就被示例话 资源浪费 但是 效率高
 */

public class HungerPattern {

    private final static HungerPattern hunger = new HungerPattern();


    public static  HungerPattern getInstance(){
        return hunger;
    }
}
