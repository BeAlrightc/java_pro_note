package SimpleFactory;

public class Test {
    public static void main(String[] args) {
        Dog d=(Dog)AnimalFactory.CreateAnimal("dog");
        d.eat();
        Cat c=(Cat)AnimalFactory.CreateAnimals("cat");
        c.eat();
    }
}
