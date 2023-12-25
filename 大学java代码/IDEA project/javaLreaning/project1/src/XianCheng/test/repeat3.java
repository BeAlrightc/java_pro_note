package XianCheng.test;

public class repeat3 {
    //匿名内部类创建线程的方式
    public static void main(String[] args) {
        //使用线程对象的方法
        new Thread(){
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("...aaa");
                }
            }
        }.start();

        //使用runnable接口的方法
        new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("...bb");
                }
            }
        }).start();

    }
}
