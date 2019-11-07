package com.night.pattern.strategy.service;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/7 9:28
 */
public interface ShopService {

    /**
     * 创建订单
     */
    void createOrder();

    /**
     * 关闭订单
     */
    void closeOrder();

    /**
     * 支付方式
     */
    void payMethod();
}
