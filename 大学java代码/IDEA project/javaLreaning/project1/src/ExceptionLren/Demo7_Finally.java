package ExceptionLren;

public class Demo7_Finally {
    /*
    A.finally的特点
        被Finally控制的语句体一定会执行
        特殊情况，在执行到finally之前jvm退出了(比如说system.exit(0))
    B.finally的作用
       用于释放资源，在IO流操作和数据操作时会见到
    C。案例演示：
        finally关键字的特点及作用
        return 语句相当于方法的最后一口气，那么在他将死之前会看看有没有finally帮其完成意愿
         如果有就将finally执行后返回
     */
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("除数为0");
            System.exit(0);//退出java虚拟机
            return;
        } finally {
            System.out.println("看看我执行了吗");
        }
    }
}
