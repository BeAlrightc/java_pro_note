package Frame;

public class Demo2_Adapter {
    /*
    适配器设计模式

     */
    public static void main(String[] args) {

    }
}
interface heshang{
    public void sitting();
    public void reading();
    public void hitClock();
    public void Gongfu();
    public static void wo(){
        System.out.println("滚");
    };
}
//以下这个类就相当于适配器类
abstract class Tiangangixn implements heshang{//声明成抽象的原因是不想让其他类创建本类对象，way都是空的

    @Override
    public void sitting() {

    }

    @Override
    public void reading() {

    }

    @Override
    public void hitClock() {

    }

    @Override
    public void Gongfu() {

    }

}
class lu extends Tiangangixn{
    public void Gongfu() {
        System.out.println("倒拔垂向柳");
        System.out.println("拳打镇关西");
        System.out.println("大闹野猪林");
    }

}
