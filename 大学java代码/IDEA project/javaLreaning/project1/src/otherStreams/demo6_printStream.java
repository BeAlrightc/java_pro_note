package otherStreams;

import bean.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class demo6_printStream {
    /*
    打印流
      该流可以很方便的将对象的toString()结果输出，并且自动加上换行，而且可以使用自动刷出的模式
      System.out就是一PrintStream,其默认向控制台输出信息

      打印：print();println();
      自动刷出： PrintWriter(outputStream out,boolean autoFlush,String encoding)
      打印流只操作数据目的
      PrintStream和PrintWriter分别打印的是字节流和字符流。
      只操作数据目的
     */
    public static void main(String[] args) throws FileNotFoundException {
//        demo1();
       PrintWriter pw = new PrintWriter(new FileOutputStream("f.txt"),true);
        // pw.println(97);  //自动刷出功能，只针对的是println()方法
        // pw.write(97);//此时数据已经写在了缓冲区里面
        pw.print(97);
        pw.println(97);//因为针对println()的刷新功能生效，写在缓冲区里的东西都可以被刷新出来
        // pw.close();

    }

    private static void demo1() {
        System.out.println("aaa");
        PrintStream ps = System.out;//获取标准输出流
        ps.println(97);//通过Integer.toString()将97转换为字符串并打印
        ps.write(97);//查找码表找到对应的a并打印
        Person p1=new Person("张三",23);
        ps.println(p1);//默认调用p1的toString()方法
        Person p2=null;
        ps.println(p2);//打印引用数据类型，如果是null就打印null，
        // 如果不是null就打印对象的toString()方法
        ps.close();//关闭流
    }
}
