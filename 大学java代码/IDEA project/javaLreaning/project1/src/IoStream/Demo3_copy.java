package IoStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_copy {
    /*
     输入流：硬盘输入到内存，有read()方法
     输出流：由内存输出到硬盘 有 write()方法
     */
    //拷贝文件操作
    public static void main(String[] args) throws IOException {
        //demo();
        //第二种拷贝不推荐使用，因为有可能导致内存溢出
        FileInputStream fis =new FileInputStream("Johnas.mp3");//创建输入流对象
        FileOutputStream fos= new FileOutputStream("tyus.mp3");//创建输出流对象
//        int len=fis.available();
//        System.out.println(len);
        byte[] arr=new byte[fis.available()];//创建与源文件一样的字节大小数据
        fis.read(arr);   //将文件上的字节读取到内存中
        fos.write(arr);//将内存中的字节读取到文件中
        fis.close();
        fos.close();
    }

    private static void demo() throws IOException {
        //copy files 效率好低
        FileInputStream fis =new FileInputStream("Johnas.mp3");//创建输入流对象
        FileOutputStream fos= new FileOutputStream("tyus.mp3");//创建输出流对象

        int b;
        while((b=fis.read()) != -1){//不断的读取每一个字节
            fos.write(b);//将每一个字节写入到文件当中
        }
        fis.close();//关闭输入流
        fos.close();//关闭输出流
    }
}
