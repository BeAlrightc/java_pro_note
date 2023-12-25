package ExceptionLren;

public class Demo8_exception {


    /*
        A.为什么需要自定义异常
        通过名字区分什么异常，有针对的解决办法
        让我们更快的检索出我们所犯的错误
           举例：人的年龄
        B。自定义异常的概述
            继承自Exception
            继承自RuntimeException
        C。案例演示
            自定义异常的基本使用
异常注意事项：
A。异常注意事项
    a.子类重写父类时，子类的方法必须抛出相同的异常或父类异常的子类（父亲坏了，儿子不能比父亲更坏）
    b.如果父类抛出了多个异常，子类重写父类时，只能抛出相同的异常或者是它的子集，子类不能抛出父类没有的异常
    c如果被重写的方法没有异常抛出，那么子类的方法绝对不可以抛出异常，如果子类方法内有异常发生，那么子类只能try不能throws
B.如何使用异常处理
  原则：如果该功能内部可以将问题处理，用/try，如果处理不了，交由调用者处理，这时用throws
  区别：
    后续程序需要运行就用try
    后续程序不需要运行就用throws
    如果jdk没有提供对应的异常，就需要自定义异常

         */
    public static void main(String[] args) {

    }
}

class AgeOutofBoundsException extends Exception {
    public AgeOutofBoundsException() {
    }

    public AgeOutofBoundsException(String message) {
        super(message);
    }
}