package Reflection.reflect;

import Reflection.beans.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//通过反射获取方法并使用
public class Demo5_Method {

    /*
	 * Class.getMethod(String, Class...) 和 Class.getDeclaredMethod(String,
	 * Class...)方法可以获取类中的指定方法,调用invoke(Object,
	 * Object...)可以调用该方法,Class.getMethod("eat") invoke(obj)
	 * Class.getMethod("eat",int.class) invoke(obj,10)
	 * @throws Exception
	 */

    public static void main(String[] args) throws Exception{
        Class clazz =Class.forName("Reflection.beans.Person");
        Constructor c=clazz.getConstructor(String.class,int.class);//获取有参构造
        Person p = (Person) c.newInstance("张三",23);//使用有参构造创建一个对象
        Method m=clazz.getMethod("eat");//获取eat方法
        m.invoke(p);//调用方法
        Method m2=clazz.getMethod("eat",int.class);//获取有参的eat()方法
        m2.invoke(p,2);//传入参数调用方法


    }
}
