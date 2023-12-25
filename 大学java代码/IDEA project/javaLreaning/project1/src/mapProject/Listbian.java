package mapProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listbian {
    public static void main(String[] args) {
//        adfor();
//        strFor();
//        Inte1();
        List<String> list1=new ArrayList<String>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        list1.add("赵六");

list1.forEach(number -> System.out.println(number));


//    private static void adfor() {
//        List<String> list1 =new ArrayList<String>();
//        list1.add("张三");
//        list1.add("李四");
//        list1.add("王五");
//        list1.add("赵六");
//        for(int i=0;i<list1.size();i++) {
//            String list=list1.get(i);
//            System.out.println(list);
//        }
    }

    private static void Inte1() {
        List<String> list1=new ArrayList<String>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        list1.add("赵六");
        Iterator<String> eno =list1.iterator();
        while(eno.hasNext()) {
            String eo=eno.next();
            System.out.println(eo);
        }
    }

    private static void strFor() {
        List<String> list1=new ArrayList<String>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        list1.add("赵六");
        for (String s: list1) {
            System.out.println(s);
        }
    }
}
