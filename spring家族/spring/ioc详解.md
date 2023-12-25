             大家好，最近小编我深入的对java进行学习。从类，接口，对象到现在接触spring技术。对于spring的理解可谓是一波三折，对于spring的入门思想IOC我也是昨天才开了窍。说到IOC（控制反转）我从字面上理解就是你控制了某个事物然后那个事物又反转过来控制了你。那这种思想的目的是什么？为什么要这样做？我在网上查过各种资料，对于ioc理解大多是晦涩难懂的，像IOC容器对象托管之类的。找到最多的一句话就是：使用ioc技术在写java程序可以不用去new对象而是自动创建对象，然后就是那个本来一个new关键字就可以创建对象的变成了一大串什么ApplicationContext类以及写配置文件的方式创建了一个对象，老实说一开始我很不理解这些操作。直到昨天，我开窍了！当我理解IOC后可谓是兴奋了一个下午。下面我将结合生活中最常见的例子和朴素的语言带你理解IOC妙处！

​           下面我通过代码来讲述IOC，注意这里只是涉及IOC，前期没有用到一丝spring的代码(不会spring也没关系)。由于我是在餐馆吃饭的时候开了窍，就以开餐馆作为一个例子吧。说到开餐馆，赚钱的方式我想就是做出客户想要的菜然后将菜上给客户吧。

基于这个做菜我们来设计一个自动做菜的程序吧。打开IDEA:

​       这里我们建立两个目录，一个专门负责做菜的Dao目录(类似于后厨)，一个负责接待客户的Service目录。在Dao层先建立一个MenuBar接口（菜单接口）,然后编写一个方法就叫出菜。

```java
package Dao;
//建立一个菜单接口
public interface MenuBar {
 //提供一个出菜的方法
    public void outdish();
}

```

然后在Dao层处建立几个菜类，比如我这建立两个菜类（dish1和dish2）并且两个类都继承MenuBar接口

dish1:

```java
package Dao;

public class dish1 implements MenuBar{
   //出菜
    public void outdish() {
        System.out.println("剁椒鱼头这到菜做好了");
    }
}
```

dish2:

```java
package Dao;
//创建第二道菜继承菜单接口
public class dish2 implements MenuBar{
    //出菜
    public void outdish() {
        System.out.println("酸辣土豆丝这道菜做好了");
    }
}

```

这是菜单接口(MenuBar)里就有两个菜类了如果要上到新菜就再编写一个类继承这个菜单接口(MenuBar).

接下来我们在建立一层Service层并建立一个DishService接口并建立一个方法负责将做好的菜送到客户那里就叫上菜吧。

```java
package Service;
//编写一个服务层接口，类似于服务员
public interface DishService {
    //上菜
    public void putdishss();
}
```

在Service层建立一个接口实现类DishServiceImpl用于具体的上菜操作

```java
package Service;
import Dao.MenuBar;
import Dao.dish1;

//编写服务层实现类
public class DishServiceImpl implements DishService{
    //引入MenuBar接口并以他的接口实现类创建一个menu对象
    MenuBar menu = new dish1();
    //继承上菜方法
    public void putdishss() {
        //进行上菜操作,从后厨拿到菜
       menu.outdish();
       System.out.println("菜做好了，请享用");

    }
}
```

对于上菜的操作服务员肯定是要从后厨拿到菜，所以我在这个是类中将Dao层的菜类引入，然后用MenuBar接口实现类创建的对象调用outdish(）实现拿到这道菜。这样就可以在服务层DishService接口实现类中调用上菜方法拿到这道菜了.

最后我们编写一个测试类在控制台上输出这道菜：

```java
import Service.DishService;
import Service.DishServiceImpl;
//编写一个测试类进行上菜操作(面向用户的)
public class DishTest {
    public static void main(String[] args) {
        //使用DishService接口实现类创建一个对象
        DishService dser = new DishServiceImpl();
        //使用该对象调用上菜的方法
        dser.putdishss();
    }
}
```

然后我们运行一下

![](C:\Users\CHUAN GE PALY\Desktop\file\后端\spring\success.jpg)

  我们通过这种层层调用的方法实现了上菜剁椒鱼头这道菜，大工告成。但是看完以上这种方式写代码，有没有看出什么问题。

​          答案就是代码之间写死了不易改动。以上这种方法看懂的可以发现虽然可以上菜但是只能上一道菜那就是剁椒鱼头，当然不是所有的客户像我一样喜欢剁椒鱼头。比如如果客户说：“我不要剁椒鱼头我要酸辣土豆丝”。算了，改代码怎么改呢？当然是在服务层去改：

接下来我们修改DishServiceImpl类：

```java
package Service;
import Dao.MenuBar;
import Dao.dish1;
import Dao.dish2;

//编写服务层实现类
public class DishServiceImpl implements DishService{
    //用MenuBar的接口实现类ddish2()去创建对象
    MenuBar menu = new dish2();
    //MenuBar menu = new dish1();
    //继承上菜方法
    public void putdishss() {
        //进行上菜操作
       menu.outdish();
       System.out.println("菜做好了，请享用");

    }
}

```

其他代码不变再运行一下：

![](C:\Users\CHUAN GE PALY\Desktop\file\后端\spring\su2.jpg)

修改一下DishServiceImpl类，因为dish1类提供的是剁椒鱼头这道菜，而提供酸辣土豆丝这道菜的方法在dish2类中。就用dish2创建一个对象。如图改好了！结合实际，客户需求可是经常改变的，点菜之后再换菜的这种例子在现实生活中屡见不鲜。这种方式对于这种只有一两个类的代码还好，顶多就是换一个单词的事。但是对于一个大型项目动不动就是几十个上百个类，难道你还要一个一个去改吗？很显然，这种设计不好!耦合性太强，那么我们就在改一下吧（注意，重要的部分来了）。

既然耦合性太强我们就尝试另一中方法，把接口的优势好好利用起来改动DishServiceImpl类;

```java
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

```

然后再将测试类改一下：

```java
import Dao.dish1;
import Service.DishService;
import Service.DishServiceImpl;
//编写一个测试类进行上菜操作(面向用户的)
public class DishTest {
    public static void main(String[] args) {
        //使用DishService接口实现类创建一个对象
        DishService dser = new DishServiceImpl();
        //经过强转的接口类对象调动set方法进行注入
       ((DishServiceImpl)dser).setMenu(new dish1());
        //使用该对象调用上菜的方法
        dser.putdishss();
    }
}

```

大家看好这个时候我们如果要换一道菜，比如改成酸辣土豆丝。就只需要在这个测试类里改动一行代码，

```java
  ((DishServiceImpl)dser).setMenu(new dish2());
```

在运行一下：

![](C:\Users\CHUAN GE PALY\Desktop\file\后端\spring\su4.jpg)

​              这种方式与上一种方式相比有什么不同？相信各位都懂了吧，上一种方法改变的是服务层里的代码，而这一次只是修改测试类里面的方法测试类与服务层里面的类我想不用我说大家就应该知道了吧：服务层里面的代码属于源码级别的，而测试类是我们随便写并且不作为源码进行封装的。而测试类的改变是随着用户的改变而改变的，这里就体现了我们的IOC思想，控制反转。由用户去根据需求去控制程序（源码可以不用动）。

回到开头，我们经常在网上搜到ioc容器，对象托管的spring技术。那这个spring技术到底是干嘛的呢？

答案就在这个测试类：

```java
import Dao.dish1;
import Service.DishService;
import Service.DishServiceImpl;
//编写一个测试类进行上菜操作(面向用户的)
public class DishTest {
    public static void main(String[] args) {
        //使用DishService接口实现类创建一个对象
        DishService dser = new DishServiceImpl();//这些new操作可以让spring容器去做
        //经过强转的接口类对象调动set方法进行注入
       ((DishServiceImpl)dser).setMenu(new dish1());//这些new操作可以让spring容器去做
        //使用该对象调用上菜的方法
        dser.putdishss();
    }
}
```

​                 使用spring技术可以去除这些人为new对象的操作，虽然上述的升级改变，是在测试类改变。但是本质上还是在new的操作上改变。虽然不动源码但是还是动了代码。我们在这里仔细想想，我们究竟为什么而改变？是怎么样的思想去获得另一道菜"酸辣土豆丝"。说白了就是需要不同的对象，有了dish1的对象我们就可以调用出菜的方法成功输出“剁椒鱼头”，同理，有了dish2的对象就可以调用出菜的方法做出"酸辣土豆丝"。所以我们需要获得这些对象去调用相应的方法去迎合客户的需求。而创建对象的活如果使用spring技术就可以不用人为的创建对象了，spring提供的IOC容器自动帮我们创建这些对象。

​      这就是IOC(控制反转)技术的奇妙之处！！不用去修改源码而让用户根据不同的需求拓展程序（这就是控制反转中的反转吧）。对于spring框架的两大技术IOC容器，和AOP。使用过后你会发现两者的共同之处:在不改变源码的情况下拓展程序迎合客户的需求！这就是spring自从诞生以来一直活跃在java市场的原因吧。

​      希望这边博文可以帮助你理解IOC思想,真的很有趣。先别走，关注我。下期教你如何使用spring技术去修改上述代码做到用户改变需求不用修改任何代码（包括测试类）！！！

