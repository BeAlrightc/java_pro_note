package IoStream.charStream.exces;

public class Demo6_Wrap {
    /*
装饰设计模式的好处是：
耦合性不强，被装饰的类的变化与装饰类的变化无关

     */
    public static void main(String[] args) {
   HeimaStudent hms=new HeimaStudent(new Student());
   hms.code();
   //用接口直接进行调用
   Coder.codeq();
    }
}
//定义一个接口定义方法
interface Coder{
    public void code();

    public static void codeq() {
        System.out.println("我有更强的方法让你解脱！");

    }
}
class Student implements Coder{

    @Override
    public void code() {
        System.out.println("javase");
        System.out.println("javaweb");
    }
}
class HeimaStudent implements Coder{//优点：进行解耦操作
    //1.获取被装饰类的引用
  private Student s;  //获取学生应用
    //2.在构造方法中传入被装饰类的对象
    public HeimaStudent(Student s){
        this.s=s;
    }
    //对原有的功能进行升级

    @Override
    public void code() {
      s.code();
        System.out.println("ssh");
        System.out.println("mysql");
        System.out.println("hadoop");
        System.out.println("......");
    }
}