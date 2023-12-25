package otherStreams;

import java.util.Enumeration;
import java.util.Properties;

public class demo10_propertises {
    /*
    A.Properties的概述
      Properties类展示了一个持久的属性集
      Properties可保存流中或从流中加载
      属性列表中每个键及其对应值都是一个字符串
    案例演示：
       Properties作为Map集合的使用
       Properties是Hashtable的子类
     */

    public static void main(String[] args) {
//        demo1();
        Properties prop = new Properties();
        prop.setProperty("name","张三");
        prop.setProperty("tel","18912345678");
//        System.out.println(prop);
        //获取键
        Enumeration<String> en=(Enumeration<String>)prop.propertyNames();
        //遍历操作
       while(en.hasMoreElements()){
           String k=en.nextElement();//获取Properties每一个键
           String value =prop.getProperty(k);//根据键获取值
           System.out.println(k+"="+value);
       }
    }

    private static void demo1() {
        Properties prop = new Properties();
        prop.put("abc",123);
        System.out.println(prop);
    }
}
