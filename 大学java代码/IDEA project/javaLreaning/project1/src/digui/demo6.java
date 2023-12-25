package digui;

import java.math.BigInteger;

public class demo6 {
    //求出1000的阶乘所有0和尾部0的个数，不用递归做
    //传统方法中的累乘，由与于1000的阶乘会导致超过过int类型的范围，所以不适用
    public static void main(String[] args) {
//        demo1();
//        demo2();

    }

    private static void demo2() {//获取1000的阶乘尾部有多少个0
        BigInteger bi1=new BigInteger("1");
        for(int i=1;i<=1000;i++){
            BigInteger bi2=new BigInteger(i+"");
            bi1=bi1.multiply(bi2);//将bi1与bi2相乘的结果赋值给bi1;
        }
        String str=bi1.toString();//获取字符串表现形式
        StringBuilder sb=new StringBuilder(str);
        str=sb.reverse().toString();//链式编程

        int count=0;//定义计数器
        for(int i=0;i<str.length();i++){//对字符串进行遍历操作
            if( '0' !=str.charAt(i)){//将0字符与字符串的每一个字符进行比较，到了某个字符不为0的时候就跳出
                break;
            }else{//否则计数器count+1
                count++;
            }
        }
        System.out.println("该数尾部的0的个数为："+count+"个");
    }

    private static void demo1() {//求1000的阶乘的尾部有多少个零
        BigInteger bi1=new BigInteger("1");
        for(int i=1;i<=1000;i++){
            BigInteger bi2=new BigInteger(i+"");
            bi1=bi1.multiply(bi2);//将bi1与bi2相乘的结果赋值给bi1;
        }
        String str =bi1.toString();//获取字符串表现形式
        int count=0;
        for(int i=0;i<str.length();i++){
            if('0'==str.charAt(i)){//如果字符串中出现了0字符，计数器就加1
                count++;
            }
        }
        System.out.println("该数0的个数为："+count+"个");
    }
}
