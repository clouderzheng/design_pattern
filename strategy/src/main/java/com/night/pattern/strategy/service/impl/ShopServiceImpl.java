package com.night.pattern.strategy.service.impl;


import com.night.pattern.strategy.service.PayService;
import com.night.pattern.strategy.service.ShopService;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/7 9:31
 */
public class ShopServiceImpl implements ShopService {


    private PayService payService;

    public ShopServiceImpl(PayService payService) {
        this.payService = payService;
    }

    @Override
    public void createOrder() {
        System.out.println("创建订单");
    }

    @java.lang.Override
    public void closeOrder() {
        System.out.println("关闭订单");
    }

    @Override
    public void payMethod() {
        payService.payMethod();
    }
}
