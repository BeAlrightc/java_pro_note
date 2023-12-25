package mapProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test3_entrySet {
    /*
    Map集合的第二种迭代，根据键值对对象，获取键和值
    A：  键值对对象找键和值的思路
    获取所有键值对对象的集合
    遍历键值对对象的集合，获取到每一个键值对对象
    根据键值对对象找键和值
     */
    public static void main(String[] args) {
//        demo_Iterator();
        Map<String,Integer> map =new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
        map.put("邱器",27);
        //通过遍历键值对对象
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            //通过键值对对象获取里面的键和值
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
//通过迭代器的方式遍历Map集合并获取键和值
    private static void demo_Iterator() {
        //使用Iterator迭代器
        Map<String,Integer> map =new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
        map.put("邱器",27);
        //Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set集合中
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        //获取每一个entry对象
        // System.out.println(entrySet);
        Iterator<Map.Entry<String,Integer>> it =entrySet.iterator();
        while(it.hasNext())
        {
            //拿到每一个Entry对象
            Map.Entry<String,Integer>en =it.next();//父类引用指向子类对象
            //Entry<String,Integer> en=it.next();//直接获取的是子类对象
            String key =en.getKey();//获取兼职
            Integer value =en.getValue();//获取值
            //System.out.println("键是："+key+" "+"值是："+value);
            System.out.println(en);
        }
    }
}
