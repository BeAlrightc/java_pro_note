package IoStream.charStream.example;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class test2 {
    /*
    获取文本上每个字符出现的次数，将结果写在time.txt上
分析：
1,创建带缓冲的输入流对象
2，创建双列集合对象TreeMap
3，将读到的字符存在双列集合中，存储时要进行判断。如果不包含这个键就将键和1存储，如果包含这个键就将
键和值+1存储
4,关闭输入流
5，创建输出流对象
6.遍历集合，将集合中的内容写time.txt中
7.关闭输出流
     */
    public static void main(String[] args) throws IOException {
//1,创建带缓冲的输入流对象
        BufferedReader br = new BufferedReader(new FileReader("zzs.txt"));
//2，创建双列集合对象TreeMap
        TreeMap<Character,Integer> tm=new TreeMap<>();
//3，将读到的字符存在双列集合中，存储时要进行判断。如果不包含这个键就将键和1存储，如果包含这个键就将
//键和值+1存储
        int ch;
        while((ch=br.read())!=-1){
            char c=(char)ch; //向下转型(强制类型转换)


            /*（if-else写法）
            if(!tm.containsKey(c)){//如果集合中不包含该键
                tm.put(c,1);//c作为键，值为1
            }else{
                tm.put(c,tm.get(c)+1);//通过键获取值再加1
            }
            改写成三元运算符之后：
            */

            //往tm中存入值
            tm.put(c,!tm.containsKey(c) ? 1:tm.get(c)+1 );//键不变，值在变
        }
        //4.关闭输入流
        br.close();
        //5，创建输出流对象

        BufferedWriter bw =new BufferedWriter(new FileWriter("time.txt"));

       // 使用keyset进行遍历操作
     for(Character key: tm.keySet()){
         switch(key){
             case '\t':
                 bw.write("\\t"+"="+tm.get(key));
                 break;
             case '\n':
                 bw.write("\\n"+"="+tm.get(key));
                 break;
             case '\r':
                 bw.write("\\r"+"="+tm.get(key));
                 break;
             default:
                 bw.write(key+"="+tm.get(key));//写出键和值
                 break;
         }
          bw.newLine();//进行换行操作
      }

//使用entrySet进行操作
        /*
     for(Map.Entry<Character,Integer> entry: tm.entrySet()){
         bw.write(entry.getKey()+"="+entry.getValue());//写入键和值
         bw.newLine();
     }
     */

      //关闭输出流
        bw.close();
    }
}
