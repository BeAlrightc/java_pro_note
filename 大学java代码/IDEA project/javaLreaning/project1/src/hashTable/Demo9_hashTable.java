package hashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo9_hashTable {
    /*
    面试题
    HashMap和HashTable的区别
    共同点：
    底层都是双列集合，都是哈希算法
    区别：
    1.HashMap是线程不安全的，效率高JDK1.2版本；
     Hashtable是线程安全的，效率低JDK1.0版本；
    2.HashMap可以存储null键和null值
    Hashtable不可以存储null键和null值
     */
    public static  void main(String[] args) {
        /*
      HashMap<String,Integer> hm=new HashMap<>();
      hm.put(null,23);
      hm.put("李四",null);
        System.out.println(hm);
        */
         Hashtable<String,Integer> tt=new Hashtable<>();
         //tt.put("李四",23);
         //tt.put(null,23);//会报错
        System.out.println(tt);
    }
}
