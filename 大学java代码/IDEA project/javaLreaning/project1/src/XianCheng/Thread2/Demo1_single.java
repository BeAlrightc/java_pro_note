package XianCheng.Thread2;
/*
单例设计模式：保证类在内存中只有一个对象.

如何保证类在内存中只有一个对象呢？
   1.控制类的创建，不让其他类来创建本类的对象.private
   2.在本类中定义一个本来对象。Singleton s;
   3.提供公共的访问方式：pubic static Singleton getInstance(){
   return s};
单例模式有两种写法
（1）饿汉式
（1）懒汉式
饿汉式和懒汉式的区别：
1.饿汉式是以时间换空间的方法
2.懒汉式是时间换空间，比较慢
3.在多线程访问时，饿汉式不会创建多个对象，但是懒汉式有可能会创建多个对象。
 */
public class Demo1_single {
    //单例设计模式
    public static void main(String[] args) {
//   Singleton s1 =new Singleton();
        /*Singleton s1 =Singleton.s; //成员变量被私有，不能通过类名.进行调用
        Singleton.s=null;
        Singleton s2 =Singleton.s;
        System.out.println(s1==s2);//结果是true(在Singleton.s！=null的前提之下)
         */
//饿汉式与懒汉式共用测试方法
        //饿汉式：比较着急，上来就创建对象
        /*
        Singleton s1 =Singleton.getInstance();
        Singleton s2 =Singleton.getInstance();
        System.out.println(s1==s2);//结果是true
         */

        Singleton s1 =Singleton.s; //成员变量被私有，不能通过类名.进行调用
        Singleton s2 =Singleton.s;
        System.out.println(s1==s2);//结果是true



    }
}
/*
//饿汉式
class Singleton {
    //1.私有构造方法,其他类不能使用该构造方法
    private Singleton(){
    }
    //2.创建本类对象,加上static
    private static Singleton s=new Singleton();
   //3.对外提供公共的访问方法,获取对象实例
    public static Singleton getInstance(){
        return s;
    }
}
 */
/*
//懒汉式,声明引用，开始不创建对象，给他一个判断方法。（面试的时候用）单例的延迟加载模式
class Singleton{
    //1.私有构造方法
    private Singleton(){

    }
    //2.声明一个本类的引用
    private static Singleton s;
    //3.对外提供公共的访问方法
    public static Singleton getInstance(){//刚开始先不创建对象
        if(s==null) {//条件，满足在多线程访问时会创建多个对象
            //线程1等待，线程2返回（弊端的时候）
            s = new Singleton();
        }
            return s;
    }
}
 */
//第三种模式
class Singleton{
    //1.私有构造方法
    private Singleton(){

    }
    //2.声明一个本类的引用
    public  static final Singleton s=new Singleton();//被final修饰方式

}
