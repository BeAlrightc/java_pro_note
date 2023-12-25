package Excise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test_Exception {
    /*
    键盘录入一个int的整数，求其二进制的形式
    如果录入的整数过大时，给予提示，录入的整数过大请重新录入一个整数BigInteger
    如果录入的是小数，给予提示，录入的是小数，请重新录入一个整数
    如果录入的是其他的字符，，给予提示，录入的是非法字符，请重新让录入一个整数

    分析：
    1.创建键盘录入对象，
    2.将键盘录入的结果存储在，String类型的字符串，存储在int类型中的时候如果有不符合条件的
    直接报错，无法进行后续判断
    3.键盘录入的结果转换int类型的数据，是正确的还是错误的
    4.正确的直接转换，错误的对应判断
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数：");
        while(true) {
            String line =sc.nextLine();//将键盘录入的结果存储在line中
            try {
                int num = Integer.parseInt(line);//将字符串转换为整数
                System.out.println(Integer.toBinaryString(num));//将整数转换为二进制
                break;//跳出循环
            } catch (NumberFormatException e) {
                try {
                    //用构造方法装数
                    new BigInteger(line);
                    System.out.println("录入错误，您录入的是一个过大的整数，请重新输入一个整数；");
                } catch (Exception e2) {
                    try {
                        new BigDecimal(line);
                        System.out.println("录入错误,您录入的是一个小数,请重新输入一个整数");
                    } catch (Exception e1) {
                        System.out.println("录入错误,您录入的是一个非法字符,请重新输入一个整数");
                    }

                }
            }

        }

    }
}
