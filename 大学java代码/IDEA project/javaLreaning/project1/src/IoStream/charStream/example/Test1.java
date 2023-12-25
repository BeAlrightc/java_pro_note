package IoStream.charStream.example;

import java.io.*;
import java.util.ArrayList;

public class Test1 {
    /*
       将一个文本文档进行反转操作，第一行和倒数第一行交换，第二行和导数第二行交换

       分析：
         1，创建输入输出流对象，需要bufferedReader
         2,创建集合对象
         3，将读到的数据写到文件上
         5，关流
         注意事项;
           流对象晚开早开。
        */
    public static void main(String[] args) throws IOException {
       BufferedReader br =new BufferedReader(new FileReader("zzs.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("ssd.txt"));
         //2创建集合对象
        ArrayList<String> list =new ArrayList<>();
        String line;
        while((line=br.readLine()) != null){
            list.add(line);//将数据存入集合
        }
        //读完之后就关流
        br.close();
        //4.倒着遍历集合
        for(int i=list.size()-1;i>=0;i--){
            bw.write(list.get(i));
            bw.newLine();//回车换行操作
        }
        //5,关流
        bw.close();
    }
}
