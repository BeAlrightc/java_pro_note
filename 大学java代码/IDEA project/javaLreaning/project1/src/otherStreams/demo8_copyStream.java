package otherStreams;

import java.io.*;

public class demo8_copyStream {
    /*
    修改标准输入输出流用于拷贝图片
     */
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("copy3.jpg"));//改变标准输入流
        System.setOut(new PrintStream("copy4.jpg"));//改变标准输出流

        InputStream is=System.in;//获取标准输入流
        PrintStream ps=System.out;
        byte[] arr =new byte[1024];//定义一个字节数组
        int len;

        while((len = is.read(arr)) != -1){
            ps.write(arr,0,len);//从0开始写
        }
        is.close();//关流操作
        ps.close();


    }
}
