package IoStream.charStream.exces;

import java.io.*;

public class Demo4_Buffered {
    /*
    带缓冲区的流中的特殊方法
    readLine();
    newLine();

    newLine与\r\n的区别
    newLine()是跨平台的方法
    \r\n只支持的是windows系统（！没办法跨平台操作）
     */
    public static void main(String[] args) throws IOException {
//        demo1();
        BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
        BufferedWriter bw =new BufferedWriter(new FileWriter("zzs.txt"));
        String line;
        while((line=br.readLine()) != null){
            bw.write(line);
            bw.newLine();  //写出回车换行符自动进行换行操作
           // System.out.println(line);//一定要加ln否则内容就不会换行操作。
           // bw.write("\r\n");
        }
        br.close();
        bw.close();
    }

    private static void demo1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
        //BufferedWriter bw =new BufferedWriter(new FileWriter("zzs.txt"));
        String line;
        while((line=br.readLine()) != null){
            System.out.println(line);//一定要加ln否则内容就不会换行操作。
        }
        br.close();
    }
}
