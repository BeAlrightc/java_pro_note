package ExceptionLren;

public class Demo3_Exception {
    /*
    A.案例演示
    try...catch的方法处理多个异常
    JDK7以后处理多个异常的方式和注意事项

    try后面如果跟多个Catch,那么小的异常往前放，大的异常往后放。根据多态的原理。如果大的放前面
    ，就会将所有的子类对象接受，后面的catch就没有意义了

     */
    public static void main(String[] args) {
//        demo1();
        int a=10;
        int b=0;
        int[] arr ={11,22,33,44,55};
//JDK7如何处理多个异常可以用 | （或）
        try {
            System.out.println(a/b);
            System.out.println(arr[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("出错了");
        }
        System.out.println("over");
    }

    private static void demo1() {
        int a=10;
        int b=0;
        int[] arr ={11,22,33,44,55};

        try {
            System.out.println(a/b);
            arr=null;
            System.out.println(arr[10]);

        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
        }catch(Exception e) {//Exception e=new nullPointerException();
            System.out.println("出错了");
        }
        System.out.println("over");
    }
}
