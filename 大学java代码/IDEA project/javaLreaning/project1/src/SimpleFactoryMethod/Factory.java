package SimpleFactoryMethod;
/*
A。工厂方法模式概述
 工厂方法模式中抽象工厂类负责定义创建对象的接口，具体对象的创建工作由
 继承抽象工厂的具体实现
B。优点：
客户端不需要负责对象的创建，从而明确了各个类的职责，如果有新的对象增加，只需要增加一个具体的类和
一个具体的工厂即可，不影响已有代码，后期维护容易，增强了系统的拓展性
C。缺点：
需要额外的编写代码，增加了工作量
 */
public interface Factory {
    public Animal createAnimal();
}
