import Dao.dish1;
import Dao.dish2;
import Service.DishService;
import Service.DishServiceImpl;
//编写一个测试类进行上菜操作(面向用户的)
public class DishTest {
    public static void main(String[] args) {
        //使用DishService接口实现类创建一个对象
        DishService dser = new DishServiceImpl();
      // ((DishServiceImpl)dser).setMenu(new dish1());
       ((DishServiceImpl) dser).setMenu(new dish2());
        //使用该对象调用上菜的方法
        dser.putdishss();
    }
}
