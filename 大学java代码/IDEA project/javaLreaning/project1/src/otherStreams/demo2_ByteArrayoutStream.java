package otherStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo2_ByteArrayoutStream{
    /*
    什么是内存输出流
     该输出流可以向内存中写数据，把内存当作一个缓冲区，写出之后可以一次性获取出所有数据
     使用方式
     创建对象 new ByteArrayOutStream();
     写出数据 write(int) ,write(byte[])
     获取数据toByArray()

     ByteArrayoutputStream
     内存输出流

     FileInputStream读取中文的时候出现了乱码
     解决方案：
     1.字符流读取
     */
    public static void main(String[] args) throws IOException {
//        demo1();
        FileInputStream fis =new FileInputStream("e.txt");
        //ByteArrayOutStream没有构造参数，在内存中创建了一个个可以增长的字节数组
        ByteArrayOutputStream bos =new ByteArrayOutputStream();
       int b;
       while((b=fis.read()) != -1){
           bos.write(b);//将读取的数据逐个写到内存中。
       }
      // byte[] arr =bos.toByteArray();//将缓冲区的数据全部获取出来，并赋值给arr数组
       // System.out.println(new String(arr));//可以指定码表
        System.out.println(bos.toString());//使用平台默认编码表，将缓冲区的内容转换为了字符串，在输出语句中可以省略调用toString()方法
        fis.close();

    }

    private static void demo1() throws IOException {
        //创建字节数组将文件的内容读入到内存当中
        FileInputStream fis =new FileInputStream("e.txt");
        byte[] arr=new byte[1];
        int len ;
        while((len=fis.read(arr))!=-1){
            System.out.println(new String(arr,0,len));
        }
        fis.close();
    }
}
