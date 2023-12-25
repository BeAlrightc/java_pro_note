package ExceptionLren;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo4_exception {
    /*
    A. 编译期异常和运行期异常的区别
    java中的异常分为两大类：编译时异常和运行时异常
    所有的RuntimeException类及其子类的实例被称为运行时异常。其他的都是编译时异常

    编译时异常：
    java程序必须显示处理，否则就会发生错误，无法通过编译
    运行时异常：程序员自己犯的代码错误！！
    无需显示处理，可以和编译时异常一起处理，大部分是程序员自己的错误8
    编译时异常也叫未雨绸缪异常(做某些事情的时候，要做某些准备)，在编译某个程序的时候，有可能有一些事情发生
    比如文件找不到，路径写错的时候
     */
    public static void main(String[] args) {
        //输入流
        try {
            FileInputStream fls = new FileInputStream("dddd.txt");
        }catch(Exception e){

        }
    }
}
