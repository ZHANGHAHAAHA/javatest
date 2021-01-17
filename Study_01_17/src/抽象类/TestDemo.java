package 抽象类;
/**
 * 抽象类：包含抽象方法的类  抽象类
 * 1、抽象类不能进行实例化 也就是：Shape shape = new Shape();
 * 2、在抽象类当中，可以拥有和普通类一样的数据成员和方法
 *    public int age;
 *    public static int count;
 *    public void func() {
 *
 *     }
 * 3、抽象类是可以被继承的，可以发生向上转型。。。。
 * 4、当一个普通类继承了一个抽象类，那么注意，当前这个普通类，一定要
 * 重写抽象类当中的抽象方法。
 * 5、当普通类A继承了抽象类，且不想实现抽象类当中的抽象方法的时候
 * 那么这个普通类可以被修改为抽象类A，此时就不需要进行实现了，当然你也可以实现。
 *   如果一个普通类B,继承了这个抽象类A，此时就要实现这个抽象方法了
 *   出来混  迟早要还的。
 * 6、抽象方法不能是private修饰的，因为抽象方法就是用来被重写的
 *
 * 7、抽象类的出现   其实最大的意义就是为了被继承
 */
abstract class Shape{//抽象类：包含抽象方法的类  抽象类
    public abstract void draw();//抽象方法不能有内容 也就是{}
    //在抽象类当中，可以拥有和普通类一样的数据成员和方法
    public int age;
    public static int count;
    public void func(){

    }
    //6、抽象方法不能是private修饰的，因为抽象方法就是用来被重写的
    /*private abstract void func() {

    }*/

}
//抽象类是可以被继承的，可以发生向上转型。。。。
class Circle extends Shape{
    //当一个普通类继承了一个抽象类，那么注意，当前这个普通类，一定要重写抽象类当中的抽象方法。
    @Override
    public void draw() {

    }
}
//5、当普通类Flower继承了抽象类，且不想实现抽象类当中的抽象方法的时候那么这个普通类可以被修改为抽象类Flower，此时就不需要进行实现了，当然你也可以实现。
abstract class Flower extends Shape{

}
 class redFlower extends Flower{
     //如果一个普通类redFlower,继承了这个抽象类Flower，此时就要实现这个抽象方法了 出来混  迟早要还的。
     @Override
     public void draw() {

     }
 }

public class TestDemo {

}
