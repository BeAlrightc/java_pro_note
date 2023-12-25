package com.xmcu.controller;

import com.xmcu.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
//200250217 黎小凤
@Controller
public class ProductController {
    @RequestMapping("/getProducts")
    public void getProducts(String[] proIds ){
        for(String proId:proIds){
            System.out.println("17号黎小凤获取到了id为"+proId+"的商品");
        }
    }

//    @RequestMapping("/getProducts")
//    public void getProducts(@RequestParam("proIds") List<String> proIds){
//        for(String proId:proIds){
//            System.out.println("获取到了id为"+proId+"的商品");
//        }
//    }


//200250217黎小凤
//    @RequestMapping("getProduct")
//    public void getProduct(@RequestBody Product product){
//        String proId = product.getProId();
//        String proName=product.getProName();
//        System.out.println("获取到了为"+proId+"名称"+proName+
//                "的商品");
//    }
//
//    @RequestMapping("/getProductList")
//    public void getProductList(@RequestBody List<Product> products){
//        for(Product product : products){
//            String proId = product.getProId();
//            String proName=product.getProName();
//            System.out.println("获取到了为"+proId+"名称"+proName+
//                    "的商品");
//        }
//    }
}
