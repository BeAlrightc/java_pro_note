package SimpleFactory;

public class modeofFactory {
     /*
 A.简单工厂模式
  又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例
 B，优点
  客户端不需要在负责对象的创建，从而明确了各个类的职责
  C，缺点：
    这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不断的修改工厂类
    不利于后期的维护
 D。案例演示：
  动物抽象类：public abstract Animal{
  public abstract void eat();}
  具体抽象类：public class Dog extends Animal{}
  具体猫类：public class extends Animal{}
  开始在测试类中每个具体的内容自己创建对象，但是，创建对象的工作如果比较麻烦，就需要有人专门做这个事情，所以就知道了
  一个专门的类来创建对象
     */
}
