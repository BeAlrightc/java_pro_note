package IoStream.charStream.exces;

public class Demo8_DiGui {
    /*
    递归：方法自己调用自己
弊端：不能调用次数过多，容易导致栈内存溢出
好处：不知道循环次数时
构造方法不能使用递归调用
     */
    public static void main(String[] args) {
     int m=  digui(20);
        System.out.println(m);

    }
    public static int digui(int i){
        if(i==1){
            return 1;
        }else {
            return i * digui(i - 1);
        }
    }
}

class Person{
    public Person(){

    }
}
