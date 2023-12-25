package ExceptionLren;

public class Demo2_exception {
    /*
      A.异常处理的两种方式
       a.try ...catch ..finally
             try catch
             try catch finaly
             try finally
      B.try.....catch处理异常的基本格式
         try....catch ....finally
      C.案例演示
       try...catch的方式处理一个异常

       try是用来检测异常的
       catch：用来捕获异常的
       finally:释放资源（IO流）
       世界对真情的相依，就是你在try我在catch，无论你在发什么脾气，我都静静接受，默默处理
       当通过try catch将问题处理了，程序会继续处理
     */
    public static void main(String[] args) {
        try {
            Demoo demo2 =new Demoo();
            int x=demo2.div(10,0);
            System.out.println(x);
        } catch (ArithmeticException a) {//捕获算数异常
            System.out.println("除法运算错误,除数为0了");
        }
        //程序会继续执行
        System.out.println("9999");
    }
}
class Demoo{
    //除法运算
    public int div(int a,int b){ //a=4,b=0;
        return a/b;              //a/0 被除数为0，违背了算数运算法则，抛出异常
    }                       //new ArithmeticException("/by zero")
}
