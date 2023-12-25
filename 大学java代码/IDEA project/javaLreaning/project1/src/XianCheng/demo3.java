package XianCheng;
/*
1.实现Runnable的原理
  查看源码：
    1.看Thread类的构造方法，传递了Runnable接口的引用
    2.通过init()方法找到传递target给成员变量的target赋值
    3.查看init()方法，发现run方法中有判断，如果target不为null就会调用Runnable接口子类对象的run方法
2.查看源码的区别
  a,继承thread: 由于子类重写了Thread类的run()，当调用start()时直接找子类的run()方法
  b,实现Runnable:构造函数中传入了Runnable的引用，成员变量记住了他，start()调用run()
  方法时内部判断成员变量Runnable的引用是否为空，
  不为空编译时看Runnable的run()，运行时执行的是子类的run()方法

  继承Thread
  好处是：可以直接使用Thread类中的方法，代码简单
  弊端是：如果已经有了父类，就不能使用这种方法
  实现Runnable接口
    好处是：即使自己定义的线程类有了父类也没关系，因为有了父类也可以实现接口，而且接口是可以实现的
    弊端是：不能直接使用Thread中的方法需要先获取到线程对象后，才能得到Thread的方法，代码复杂
 */
public class demo3 {
    public static void main(String[] args) {
      MyRunnable mr=new MyRunnable();//4.创建Runnable的子类对象
      //Ruuabble target=mr;//父类引用指向子类对象
     Thread t =new Thread(mr);//5.将其当作参数传递给Thread的构造方法
     t.start();//6.开启线程（调用了MyRunnable的run方法）

        for(int i=0;i<1000;i++){
            System.out.println("bbbbbbbbbb");
        }
    }
}
class MyRunnable implements Runnable {//1.定义一个类，实现runable接口
    //2重写run方法
    @Override
    public void run() {
        for(int i=0;i<1000;i++){//3.将要执行的方法放到run()方法当中去
            System.out.println("aaaaaaaaaaa");
        }

    }
}
