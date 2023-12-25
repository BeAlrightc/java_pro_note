package Reflection.Poxy;
/*
A:动态代理概述：
   代理：本来应该自己做的事情，请了别人来做，被请的人就是代理对象
   举例：春节回家买票让人代买
   动态代理：在程序运行过程中产生的这个对象，而程序运行过程中产生对象其实就是我们刚才反射讲解的内容，
   所以，动态代理其实就是通过反射来生成一个代理

   在java.lang.reflect包下提供了一个Proxy类和一个InvocationHandler接口，
   通过使用这个类和接口就可以生成代理对象，JDK提供的代理对象只能针对接口做代理，我们有更强大的代理
   cglib,Proxy类中的方法创建动态代理对象
  public static Object newProxyInstance(ClassLoader loader,class<?>[] interface,InvocationHandler h)
  最终会调用InvocationHandler的方法
  InvocationHandler Object invoke(Object proxy,Method,Object [] args)
 */
public class UserImpl implements User{

    @Override
    public void add() {
        //System.out.println("权限校验");
        System.out.println("添加功能");
      //  System.out.println("日志记录");
    }

    @Override
    public void delete() {
       // System.out.println("权限校验");
        System.out.println("删除功能");
       // System.out.println("日志记录");
    }
}
