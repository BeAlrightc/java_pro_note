package XianCheng.Thread2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_timer {
    public static void main(String[] args) throws InterruptedException {
        Timer t =new Timer();
        //在指定时间安排指定任务
        //第一个参数，是安排的任务。第二个参数是执行时间，第三个参数是执行任务的间隔时间
        t.schedule(new myTimerTask(),new Date(188,6,1,14,20,20),3000);

        while(true){
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }
}
class myTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("起床背英语单词。");
    }
    //看完线程下的第三集（Timer）
}
