package ExceptionLren;

public class Demo5_Exception {
    /*
    A.Throwable的几个常见的处理方法
     a:getMessage()
       获取异常信息，返回字符串
     b:toString()
        获取异常类名和异常信息，返回字符串
     c:printStackTrace()
        获取异常类名和异常信息，以及异常出现在程序中的位置，返回值为void
   案例演示：Throwable基本使用方法我们平时出现错误就是这样打印的

     */
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (Exception e) {//相当于 Exception e =new ArithmeticException("/ by zero");
           // System.out.println(e.getMessage());//获取异常信息// by zero
          //  System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
           // System.out.println(e);//调用tostring方法，打印异常类名和异常信息
            e.printStackTrace();//异常类名，异常信息，异常出现的位置 ，这是jvm默认处理方式
        }
    }
}
