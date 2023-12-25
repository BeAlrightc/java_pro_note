package otherStreams;

import java.io.*;

public class demo7_stanrdStream {
    /*
   1。什么是标准输入输出流
    System.in是InputStream，标准输入流，默认可以从键盘输入读取数据字节数据
    System.out是PrintStream 标准输出流，默认可以向Console中输出字符和字节数据
   2.修改标准输入输出流
    修改输入流：System.setIn(InputStream)
    修改输出流：System.setOut(PrintStream)
     */
    public static void main(String[] arogs) throws IOException {
//        demo1();
        System.setIn(new FileInputStream("a.txt"));//改变标准输入流
        System.setOut(new PrintStream("b.txt"));//改变标准输出流
       InputStream is = System.in;//获取标准的键盘输入流，默认指向键盘改变后指向文件
        PrintStream ps =System.out;//获取标准输出流.默认指向的是控制台，改变后指向文件
        int b;
        while((b=is.read())!=-1){
           ps.write(b);
        }
         is.close();
        ps.close();//如果没有针对某个文件进行操作就不需要进行关流的操作
    }

    private static void demo1() throws IOException {
        InputStream is =System.in;
        int x=is.read();//读第一个字节无论40还是48都取4码表值
        System.out.println(x);
        is.close();  //关闭流，输入流只有一个，下面的代码没有用
        InputStream is2=System.in;
        int y= is2.read();
        System.out.println(y);
    }
}
