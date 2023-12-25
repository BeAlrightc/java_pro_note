package Reflection.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

//通过反射越过泛型检查
//案例演示：ArrayList<Integer>的一个对象，在这个集合当中添加一个字符串数据，如何实现
//泛型只在编译期有效，在运行期会被擦除掉,在编译器获取字节码对象将他改掉就可以了
public class test01 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(111);
        list.add(222);
        //泛型擦除/泛型反射
        Class clazz=Class.forName("java.util.ArrayList");//获取字节码对象
        Method m=clazz.getMethod("add",Object.class);//获取add方法
        m.invoke(list,"abc");//调用add方法将abc添加进去。
        System.out.println(list);

    }
}
