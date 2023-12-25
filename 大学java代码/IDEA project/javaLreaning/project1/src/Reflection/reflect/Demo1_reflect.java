package Reflection.reflect;

import Reflection.beans.Person;

public class Demo1_reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1=Class.forName("Reflection.beans.Person");//获取字节码对象
        Class clazz2= Person.class;//在

        Person p=new Person("张三",20);
        Class clazz3=p.getClass();///获取字节码对象


        System.out.println(clazz1==clazz2);//true
        System.out.println(clazz2==clazz3);//true//说明他们是同一个字节码文件
    }
}
