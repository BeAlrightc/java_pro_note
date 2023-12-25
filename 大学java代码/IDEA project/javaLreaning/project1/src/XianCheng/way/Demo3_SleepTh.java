package XianCheng.way;
/*
休眠线程
Thread。sleep（毫秒，纳秒）控制当前线程休眠若干毫秒 1秒=1000毫秒
1秒=1000*1000*1000 纳秒（windows不支持）

 */
public class Demo3_SleepTh {
    public static void main(String[] args) throws InterruptedException {
//        demo1();
        new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    try {
                        Thread.sleep(1000);//线程休眠1秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"...aaaaaaaaa");
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"...bbbbbb");
                }
            }
        }.start();
    }

    private static void demo1() throws InterruptedException {
        for(int i=1000;i>=0;i--){
            Thread.sleep(1);
            System.out.println("倒计时"+i+"秒");
        }
    }
}
