package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_collection {
    /*
    Collections中的常见方法
    public static <T>void sort(List<T>list)//排序
    public static <T> int binarySearch(List<?> list,T key)//二分法查找元素
    public static <T> T max (Collection<?> coll)//根据默认排序获取集合中的最大值
    public static void reverse(List<?> list)//翻转集合中元素的顺序
    public static void shuffle(List<?> list)
     */
    public static void main(String[] args) {
//        demo1();
//        demo2();
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("f");
        list.add("g");
      //  System.out.println(Collections.max(list));//获取最大值
//        Collections.reverse(list);//翻转集合中元素的顺序
//        System.out.println(list);
        Collections.shuffle(list);  //随机置换集合中的元素，可以用来洗牌
        System.out.println(list);

    }

    private static void demo2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("f");
        list.add("g");

        System.out.println(Collections.binarySearch(list,"c"));
        System.out.println(Collections.binarySearch(list,"b"));
    }

    private static void demo1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("d");

        System.out.println(list);
        Collections.sort(list);//将集合排序
        System.out.println(list);
    }
}
