package IoStream.charStream.exces;

import java.io.*;

public class Demo7_TransTo {
    public static void main(String[] args) throws IOException {
        //demo1();
//        demo2();
        //更高效的读
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("gbk.txt"),"gbk"));
       //更高效的写
        BufferedWriter ir =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("utf-8.txt"),"utf-8"));
         int c;
         while((c=br.read()) != -1){
             ir.write(c);
         }
         br.close();
         ir.close();
    }

    private static void demo2() throws IOException {
        //先将字符按照指定的字符编码转换为字节数组，指定码表读字符
        InputStreamReader isr= new InputStreamReader(new FileInputStream("gbk.txt"),"gbk");
        //将字节数组按照指定的字符编码转换为字符，指定码表写字符
        OutputStreamWriter osr =new OutputStreamWriter(new FileOutputStream("utf-8.txt"),"utf-8");
        int c;
        while((c=isr.read())!=-1){
            osr.write(c);
        }
        isr.close();
        osr.close();
    }

    private static void demo1() throws IOException {
        //用默认编码表读写出现了乱码
        FileReader fr =new FileReader("gbk.txt");
        FileWriter fw =new FileWriter("utf-8.txt");
        int c;
        while((c=fr.read())!=-1){
            fw.write(c);
        }
        fr.close();
        fw.close();
    }
}
