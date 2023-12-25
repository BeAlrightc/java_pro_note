package com.xmcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class productController {
    @RequestMapping("/getProducts")
    public void getProducts(String[] proIds ) {
        for (String proId : proIds) {
            System.out.println("获取到了id为" + proId + "的商品");
        }
    }
}
