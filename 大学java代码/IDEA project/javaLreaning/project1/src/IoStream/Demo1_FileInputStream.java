package IoStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {
    /*
   1. 概念：
        IO流用于处理设备之间的数据传输
        Java对数据的操作是通过流的方式
        Java用于操作流的类都在IO包中
        流按流向分为两种
          字节流：字节流可以操作任何数据，因为在计算机中任何数据都是以字节的形式存储的
          字符流：字符流只能操作存字符数据，比较方便
   2. IO流常用父类
       字节流的抽象父类
        InputSream
        OutputStream
       字符流的抽象父类
         Reader
         Writer
   3.IO程序书写
       使用前，导入IO包中的类
       使用时，进入IO异常处理（如若出现找不到文件的情况之下就要抛出异常给调用者处理）
       使用后，释放资源(硬盘和内存之间相当于建立了一个管道，让数据进行流通：用完之后就要关闭)
     */
    public static void main(String[] args) throws IOException {
//        demo1();
        FileInputStream fis=new FileInputStream("zzz.txt");//创建流对象
        int b;
        while((b=fis.read()) != -1){
            System.out.println(b);
        }
        fis.close();
/*
read()方法读取的是一个字节，为什么返回一个int而不是byte
    因为字节输入流可以操作任意类型的文件，比如图片音频。这些文件底层都是以二进制形式存储的，如果每
    次读取都返回byte，有可能在读到中间的时候遇到11111111那么这11111111是byte类型的-1我们的程序是遇到
    -1就停止不读了，后面的数据就读不到了，所以在读取的时候用int类型接收，如果11111111会在其前面补上
    24个0凑足一个字节，那么byte类型的-1就变成int类型的255了，这样可以保证整个数据读完，而结束标记的
    -1就是int类型

 */
    }

    private static void demo1() throws IOException {
        FileInputStream fis=new FileInputStream("zzz.txt");//创建流对象
        int x=fis.read();//从硬盘上读取一个字节
        System.out.println(x);
        int y=fis.read();//依次读下一个字节读第二个字节
        System.out.println(y);
        int z=fis.read();//读第三个字节
        System.out.println(z);
        int h=fis.read();//读第四个字节（这里不存在）
        System.out.println(h);
        fis.close();//关流释放资源
    }
}
