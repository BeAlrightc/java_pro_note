package SimpleFactoryMethod;

public class Test {
    public static void main(String[] args) {
        DogFactory df =new DogFactory();//创建狗工厂的
        Dog d=(Dog)df.createAnimal();//创建狗对象
        d.eat();//调用eat()方法
    }
}
