package com.liu.Anntations;

import java.util.ArrayList;
import java.util.List;

public class Test01 extends Object{

        @Override//加上次注解就必须要重写父类的方法
        public String toString () {
            return super.toString();
        }


        //Deprecated不推荐使用,已过时
        @Deprecated
         public static void test(){
            System.out.println("Deprecasted");
        }
       @SuppressWarnings("all")//镇压警告
        public void test02(){
            List list =new ArrayList<>();
        }

    public static void main(String[] args) {
            test();
    }
}
