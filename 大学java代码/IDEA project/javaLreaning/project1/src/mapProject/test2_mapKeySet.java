package mapProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//Map集合的遍历之键找值18.03
public class test2_mapKeySet {
    /*
    使用keySet获取所有的键
    通过查看Map集合的API发现没有iterator,那么双列集合如何迭代呢？
    获取所有的键，通过键找值
     */
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
//        demokeyfindva();
        //使用增强for循环进行遍历操作
        for(String key : map.keySet()) {   //map.keySet（）是所有键的集合
            System.out.println(key+"="+map.get(key));
        }
    }

    private static void demokeyfindva() {
        //通过键找值iterator迭代器方法遍历操作
        Map<String,Integer> map =new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);

        //Integer i=map.get("张三");//根据键获取值
        //System.out.println(i);

        //获取所有的键，并把获取的键都存放在一个Set集合中
        Set<String> keySet =map.keySet();
        Iterator<String> it =keySet.iterator();//获取迭代器
        while(it.hasNext()){//判断集合中是否有元素
            String key =it.next();  //获取每一个键
            Integer value=map.get(key);//通过键获取值
            System.out.print(key+"="+value+" ");
        }
    }

}
