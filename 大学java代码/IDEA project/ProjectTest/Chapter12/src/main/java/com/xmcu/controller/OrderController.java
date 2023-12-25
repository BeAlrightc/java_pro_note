package com.xmcu.controller;

import com.xmcu.pojo.Order;
import com.xmcu.pojo.Product;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Set;

@Controller
public class OrderController {
    public void getOrderInfo(Order order){
        String orderId = order.getOrderId();
        HashMap<String, Product> orderInfo = order.getProductInfo();
        Set<String> keys = orderInfo.keySet();
        System.out.println("订单Id: "+orderId);
        System.out.println("订单商品信息：");
        for(String key : keys){
            Product product = orderInfo.get(key);
            String proId =product.getProId();
            String proName = product.getProName();
            System.out.println(key+"类"+"商品ID:"+proId+",商品名称:"+proName);


        }
    }

}
