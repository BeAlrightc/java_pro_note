package XianCheng.way;
//通过两种方式对Thread线程设置名字
/*
1.直接通过构造方阿飞
2.通过setNmae()的方式设置线程名字。
 */
public class Demo_Name1 {
    public static void main(String[] args) {
//        demo1();
       Thread t1= new Thread(){
            public void run(){
                //this.setName("张三");
                System.out.println(this.getName()+"......aaaaaaa");
            }
        };

      Thread t2= new Thread(){
            public void run(){
                //this.setName("李四");
                System.out.println(this.getName()+"......bb");
            }
        };
      t1.setName("张三");
      t2.setName("李四");
      t1.start();
      t2.start();
    }

    private static void demo1() {
        //开启第一个线程
        new Thread("芙蓉姐姐"){//通过构造方法给name赋值
            public void run(){
                System.out.println(this.getName()+"......aaaaaaa");
            }
        }.start();
        //开启第二个线程
        new Thread("凤姐"){
            public void run(){
                System.out.println(this.getName()+".......bbbbbb");
            }
        }.start();
    }
}
