package IoStream.charStream.example;

import java.io.*;

public class Test3 {
    /*
当我们下载一个试用版软件，没有购买正版的时候，每执行一次就会提前提醒我们还有多少次机会用
学过的IO知识，模拟试用版软件使用10次机会，执行一次就提示一次还有几次机会。如果次数到了就
请购买正版

分析：
1，创建带缓冲的输入流对象，因为要使用readline方法保证数据的原样性；
2.将读到的字符串转换为int数
3.对int数进行判断，如果大于0，将其减减写回去，如果不大于0就提示请购买正版
4，在if判断中药=要将减减的结果打印，并将结果输出流写到文件上

 */
    public static void main(String[] args) throws IOException {
        //1，创建带缓冲的输入流对象，因为要使用readline方法保证数据的原样性；
    BufferedReader br = new BufferedReader(new FileReader("config.txt"));
//2.将读到的字符串转换为int数
    String line=br.readLine();
       int times=Integer.parseInt(line);//将数字字符串转化为数字
        //判断
        if(times>0){
            System.out.println("您还有"+times--+"次机会");
            FileWriter fw =new FileWriter("config.txt");
            fw.write(times+"");//将次数进行文件写入
            fw.close();//一定要关流操作
        }else{
            System.out.println("您的使用次数已到，请购买正版软件继续使用");
        }
        //关闭流
        br.close();


    }
}
