package IoStream;

import java.io.*;

public class Demo5_BufferCopy {
    /*
    A.缓冲思想
        字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
        这是加入了数组这样的缓冲区效果，java本身在设计的时候，
        也考虑到了这样的设计思想。所以提供了字节缓冲区
    B。BufferedInputStream
          BufferedInputStream内置了一个缓冲区数组
          从BufferedInputStream中读取一个字节时
          BufferedInputStream会一次性从文件中读取8192个，存在缓冲区中，返回给程序一个
          程序再次读取时就不用找文件了，直接从缓冲区读取
          直到缓冲区中所有的都被使用过了，重新从文件中读取8192个
    C.BufferedOutputStream
           BufferedOutputStream也内置了一个缓冲区（数组）
           程序向流中写出字节时，不会直接写到文件，先写到缓冲区中
           直到缓冲区写满，BufferedOutputStream才会把缓冲区中的数据一次性写到文件里

   D。小数组的读写和带Buffered的读取那个更快？
     定义小数组如果是8192个字节大小和Buffered比较的话
     定义小数组会略胜一筹。因为读和写都在同一个数组
     而Buffered操作的是两个数组
     close()方法
       具备刷新的功能，在关闭流之前，就会先刷新一次缓冲区，将缓冲区的字节全部刷新到文件上，再关闭。close方法刷完之后就不能继续写了
     flush()方法
        具备刷新功能，刷完之后还可以继续写.
     */
    public static void main(String[] args) throws IOException {
//        demo1();
        //flush()和close()的区别
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Johnas.mp3"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("coppy.mp3"));
        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }
       // bos.flush();//可刷新缓冲区
        bis.close();
        bos.close();//不加close文件会变小
    }

    private static void demo1() throws IOException {
        //创建输入流对象关联Johnas.mp3
        FileInputStream fis =new FileInputStream("Johnas.mp3");
        //创建输入流对象关联Johnas.mp3
        FileOutputStream fos =new FileOutputStream("copy.mp3");
        //创建缓冲区对象，对输入流进行包装让其变得更加强大
        BufferedInputStream bis =new BufferedInputStream(fis);
        //创建缓冲区对象，对输出流进行包装让其变得更加强大
        BufferedOutputStream bos =new BufferedOutputStream(fos);

        //copy步骤
        int b;
        while((b=bis.read()) != -1){
            bos.write(b);
        }
        //只需关闭包装后的流
        bis.close();
        bos.close();
    }
}
