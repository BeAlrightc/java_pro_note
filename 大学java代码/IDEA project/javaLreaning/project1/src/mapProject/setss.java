package mapProject;
/*
集合的遍历
 */
import java.util.*;

public class setss<set> {
    public static void main(String[] args) {
        Set<String >set = new HashSet<>();
        set.add("小红");
        set.add("晓明");
        set.add("小军");
        set.add("小王");
       // System.out.println("以下是使用for循环遍历");
//        for(int i=0;i<set.size();i++) {
//            String elements=set.get(i);
//            System.out.print(elements+" ");
//        }
        System.out.println(" ");

        System.out.println("以下是使用增强for循环遍历");
        for(String se:set){
            System.out.print(se+" ");
        }

        System.out.println(" ");
        System.out.println("以下是使用迭代器遍历");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String els=iterator.next();
           System.out.print(els+" ");
        }
        System.out.println(" ");

        System.out.println("以下是使用foreach进行遍历");
        set.forEach(num-> System.out.print(num+" "));

    }


}
