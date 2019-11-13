package com.night.singleton;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/13 11:01
 * 懒汉模式 只有在需要的时候才进行实例化
 */
public class LazyPattern {

    private static LazyPattern lazy = null;

    public synchronized  static LazyPattern getInstance(){
        if(lazy == null){
            lazy = new LazyPattern();
        }
        return lazy;
    }
}
