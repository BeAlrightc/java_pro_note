package Reflection.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

/*
榨汁机
分别有水果(Fruit)苹果(Apple)香蕉(banana)橘子(orange)榨汁(Squeeze)

 */
public class Demo2_reflect {
    public static void main(String[] args) throws Exception {
        //没有用反射，只在说多态
        /*
        Juicer j=new Juicer();//相当于购买榨汁机
        j.run(new Apple());//向榨汁机中放入苹果
        j.run(new Orange());//父类引用指向子类对象//Fruit f=new Orange();
        //在榨汁机类中添加run()方法可以榨出橘子
        */

        //用反射和配置文件
        BufferedReader br = new BufferedReader(new FileReader("configr1.properties"));
        Class clazz=Class.forName(br.readLine());//使用流对象读一行配置文件,class从配置文件获取类名创建一个对象
        Fruit f= (Fruit) clazz.newInstance();//相当于父类引用指向指向对象，水果的引用指向了苹果对象
        Juicer j=new Juicer();
        j.run(f);
    }
}

//定义一个水果接口
interface Fruit{
    public  void Squeeze();
}
class Apple implements Fruit{


    @Override
    public void Squeeze() {
        System.out.println("榨出一杯苹果汁");
    }
}
class Orange implements Fruit{

    @Override
    public void Squeeze() {
        System.out.println("榨出一杯橘子汁");
    }
}
class Juicer{
    /*
    //重载run方法
    public void run(Apple a){
        a.squeeze();
    }
    public void run(Orange o){
        o.squeeze();
    }
     */
    public void run(Fruit f){
        f.Squeeze();
    }
}
