package com.night.pattern.strategy;

import com.night.pattern.strategy.service.PayService;
import com.night.pattern.strategy.service.ShopService;
import com.night.pattern.strategy.service.impl.AliayPayService;
import com.night.pattern.strategy.service.impl.ShopServiceImpl;
import com.night.pattern.strategy.service.impl.UnionPayService;
import com.night.pattern.strategy.service.impl.WechatPayService;
import org.junit.Test;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/7 9:45
 */
public class TestShop {

    @Test
    public void testShop(){

        //微信支付
        PayService pay = new WechatPayService();
        //支付宝支付
//        PayService pay = new AliayPayService();
        //银联支付
//        PayService pay = new UnionPayService();
        ShopService shop = new ShopServiceImpl(pay);
        shop.createOrder();
        shop.payMethod();
        shop.createOrder();

    }
}
