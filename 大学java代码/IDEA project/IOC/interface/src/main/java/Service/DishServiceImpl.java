package Service;
import Dao.MenuBar;
//编写服务层实现类
public class DishServiceImpl implements DishService{
    //引入菜单接口
  private MenuBar menu;
//添加一个set方法
    public void setMenu(MenuBar menu) {
        this.menu = menu;
    }
    //继承上菜方法
    public void putdishss() {
        //进行上菜操作
       menu.outdish();
       System.out.println("菜做好了，请享用");

    }
}
