package XianCheng;

public class demo4 {
    public static void main(String[] args) {
        //匿名内部类的方法继承Thread
        new Thread() {           //1.继承Thread类
            public void run() {  //2.重写run方法
                for(int i=0;i<1000;i++){  //3，将要执行的代码写在run方法中
                    System.out.println("aaaaaaaaaa");
                }

            }
        }.start();//开启线程

        //Runnable匿名内部类的方法

        new Thread (new Runnable(){//1,将runnable的子类对象传递给Thread的构造方法
            @Override
            public void run() {  //2.重写run方法
                for(int i=0;i<1000;i++){  //将要执行的代码写在run方法中
                    System.out.println("bbb");
                }
            }
        }).start();  //4.开启线程
    }
}
