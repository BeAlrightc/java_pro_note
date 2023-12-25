package otherStreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class demo_randomStream {
    /*
    随机访问流概述
      RadomAccessFile概述
      RadomAcessFile类不属于流，是Object类的子类，
      但他包含了InputStream和OutputStream的功能
      支持对随机访问文件的读取写入。
      read(),write(),seek()
**"r" : ** 以只读方式打开。调用结果对象的任何 write 方法都将导致抛出 IOException。
"rw": 打开以便读取和写入。}}
"rws": 打开以便读取和写入。相对于 "rw"，"rws" 还要求对“文件的内容”或“元数据”的每个更新都同步写入到基础存储设备。
"rwd" : 打开以便读取和写入，相对于 "rw"，"rwd" 还要求对“文件的内容”的每个更新都同步写入到基础存储设备。
     */
    public static void main(String[] args) throws IOException {
RandomAccessFile raf =new RandomAccessFile("g.txt","rw");
   //raf.write(97);
//        int x=raf.read();
//        System.out.println(x);
        raf.seek(11);//设置位置
        raf.write(98);
raf.close();
    }
    //看完第5集下次看第六集
}
