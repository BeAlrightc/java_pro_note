package ExceptionLren;

public class Demo6_Exception {
    /*
    A. throws的方式处理异常
       定义功能方法时，需要把出现的问题暴露出来让调用者去处理
       那么就通过throws在方法上进行标识
    B.案例演示;
       举例分别演示编译时异常和运行时异常
       编译时异常的抛出，必须对其进行处理
       运行时异常可以进行处理也可以不处理
    C.throw的用法
     在功能上内部出现某种情况，程序不能继续运行，需要跳转时，就用法throw把异常抛出。
     D：
     throws和throw的区别
       a.throws
          用在方法声明后面，跟的是异常类名
          可以跟多个异常类名，用逗号隔开
          表示抛出异常，该方法的调用者处理
       b.throw
            用在方法体内，跟的是异常对象名
            只能抛出一个异常对象名
            表示抛出异常，由方法体内的语句处理

     */
    public static void main(String[] args) throws Exception {
     Persona p =new Persona();
    // p.setName("");
     p.setAge(-17);
        System.out.println(p.getAge());
    }
}
  class Persona{
    private String name;
    private int age;

      public Persona() {
      }

      public Persona(String name, int age) {
          this.name = name;
          this.age = age;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public int getAge() {
          return age;
      }
//方法中如果抛出一个运行时异常，那么在方法上就不用做任何声明
//如果在抛出一个编译时异常，那么在方法上就必须要进行处理，否则报错
      public void setAge(int age)  throws AgeOutofBoundsException{
          if(age>0 && age<=150) {
              this.age = age;
          }else{
//              Exception e=new Exception("年龄非法");
//              throw e;
              throw new AgeOutofBoundsException("年龄非法");
          }

      }
      /*
       public void setAge(int age) throws Exception {
          if(age>0 && age<=150) {
              this.age = age;
          }else{
              throw new Exception("年龄非法");
          }
      }
       */

      @Override
      public String toString() {
          return "Persona{" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                  '}';
      }
  }
