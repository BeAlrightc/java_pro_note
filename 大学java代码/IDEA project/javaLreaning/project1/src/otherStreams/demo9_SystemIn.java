package otherStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class demo9_SystemIn {
    /*
    两个键盘录入的方法
     */
    public static void main(String[] args) throws IOException {
        //InputStreamReader转换流

       /*
       第一种
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line =br.readLine();
        System.out.println(line);
        br.close();
        */
        //第二种
        Scanner sc =new Scanner(System.in);//创建键盘录入对象
        String line =sc.nextLine();
        System.out.println(line);
        sc.close();

    }

}
