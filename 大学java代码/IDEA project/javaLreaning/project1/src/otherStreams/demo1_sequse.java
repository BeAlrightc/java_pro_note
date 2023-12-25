package otherStreams;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class demo1_sequse {
    //1.序列流
     /*
     序列流可以把多个字节输入流整合成一个，从序列流中读取数据时，将从被整合
     的第一个流开始读，读完之后继续读第二个，以此类推
     1.整合两个输入流
     SequenceInputStream(InputStream s1,InputStream s2);//传入两个流
     2整合多个输入流
     SequenceInputStream(Enumeration<? extends InputStream> e)
      */
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
        //采用定义集合对象将流传入Sequence当中

        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2=new FileInputStream("b.txt");
        FileInputStream fis3=new FileInputStream("c.txt");

        Vector<FileInputStream >v=new Vector<>();//创建集合对象
         v.add(fis1);//将流对象存储进来
         v.add(fis2);
         v.add(fis3);
            //创建一个枚举类型变量限定类型为FileInputStream，获取枚举引用！
       //调用集合中的方法v.elements()用于将值传入
        Enumeration<FileInputStream>en =v.elements();
        //将流整合在一起。
        SequenceInputStream sis =new SequenceInputStream(en);//将是三个流整合在一起
        FileOutputStream fos =new FileOutputStream("d.txt");
        int b;
        while((b=sis.read())!=-1){
            fos.write(b);
        }
        sis.close();
        fos.close();
    }

    private static void demo2() throws IOException {
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2=new FileInputStream("b.txt");
        //对两个流进行包装
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        // SequenceInputStream sis2=new SequenceInputStream(sis,fis3);
        FileOutputStream fos=new FileOutputStream("c.txt");
        int b;
        while((b=sis.read())!=-1){
            fos.write(b);
        }
        sis.close();//sis在关闭时会将构造方法传入的对象进行关闭
        fos.close();//关闭输出流
    }

    private static void demo1() throws IOException {
        //创建字节输入流关联a.txt
        FileInputStream fis1 = new FileInputStream("a.txt");
//创建字节输出流，关联c.txt
        FileOutputStream fos = new FileOutputStream("c.txt");

        int b1;
        while((b1=fis1.read())!=-1){//不断在a.txt上读取字节
            fos.write(b1);  //将读取到的字节写到c.txt当中
        }
        fis1.close();//关闭输入流
        //创建字节输入流关联b.txt
        FileInputStream fis2 = new FileInputStream("b.txt");
        int b2;
        while((b2=fis2.read())!=-1){
            fos.write(b2);

        }
        fis2.close();
        fos.close();
    }
}
