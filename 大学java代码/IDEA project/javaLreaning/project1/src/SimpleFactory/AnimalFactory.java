package SimpleFactory;

public class AnimalFactory {//用来创建对象
    /*
    //第一种方法
    public static Dog createDog(){//创建够对象
        return new Dog();
    }
    public static Cat CreateCat(){//创建猫对象
       return new Cat();
    }
    //发现会很定义很多，复用性太差
     */
    //改进(使用if-else)：
    public static Animal CreateAnimal(String name) {
      if("dog".equals(name)){
          return new Dog();
      }else if("cat".equals(name)){
          return new Cat();
      }else{
          return null;
      }
    }

    //使用switch语句进行升级改造

    public static Animal CreateAnimals(String name){
        switch(name){
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
        }
        return null;
    }
}
