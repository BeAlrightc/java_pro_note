package mapProject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
A、Map接口概述
    查看API接口可知：
      将键映射到值的对象
      一个映射不能包含重复的键
      每个键最多只能映射到一个值
B：Map接口与collection 接口的不同
  Map是双列的，Collection 是单列的
  Map 的键是唯一的，collection的子体系Set 是唯一的
  Map集合的数据结构值针对键有效，限值无关；collection 集合的数据结构是针对元素有效的

 */
/*
A:Map集合的功能概述
a:添加功能
 V put(K key,V value)；添加元素
    如果键是第一次存储，就会直接存储元素，返回null
    如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
 b；删除功能
   void clear():移除所有的键值对元素
   V remove (Object key):根据键值对元素，并把值返回
 C：判断功能：
  boolean containskey(Object key):判断集合是否包含指定的键
  boolean containsValue(Object value):判断集合是否包含指定的值
  boolean isEmpty() :判断集合是否为空
 d:获取功能
  Set<Map.Entry<K,V>> entrySet() ;
  v get (Object key):根据键获取值
  set<k> KeySet();获取集合中所有键的集合
  Collection<v> Values();获取集合中所有值的集合
e :长度功能
   int size();返回集合中所有键值对的个数
 */
public class tests1 {
    public static void main(String[] args) {
//        demo1();
//        demo2();
       //demo3();
        Map<String,Integer> map =new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
      Collection<Integer> c=  map.values();
        System.out.println(c);//[24, 23, 25, 26]
        System.out.println(map.size());//map元素的个数为4个
        //看到第03集
    }

    private static void demo3() {
        Map<String,Integer> map =new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
//        Integer value=map.remove("张三");//根据键删除元素返回对应的值
//        System.out.println(value);//23
        //判断是否包含传入的键
        System.out.println(map.containsKey("张三"));//true
        //判断是否包含传入的值
        System.out.println(map.containsValue(100));//false
        System.out.println(map);//{李四=24, 王五=25, 赵六=26}
    }

    private static void demo2() {
        Map<String,Integer> map =new HashMap<>();
        Integer i1= map.put("张三",23);
        Integer i2= map.put("李四",24);
        Integer i3= map.put("王五",25);
        Integer i4= map.put("赵六",26);
        Integer i5= map.put("张三",26);
        System.out.println(map);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);//四个都是null
        System.out.println(i5);//23 把被覆盖的值返回（相同的键不存储直接覆盖）
    }

    private static void demo1() {
        Map<String,Integer> map =new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
        System.out.println(map);//{李四=24, 张三=23, 王五=25, 赵六=26}
    }
}
