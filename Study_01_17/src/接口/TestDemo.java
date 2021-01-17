package 接口;

/**
 *
 * 接口：使用关键字 interface修饰
 * 1、接口当中的方法 ，不能有具体实现。
 *    接口当中的方法，默认是：public abstract
 * 2、接口当中的成员变量，默认是 public static final
 * 3、JDK1.8引入的新特性。default修饰的方法，默认方法，
 *    可以有具体的实现
 * 4、接口不可以进行实例化：IShape iShape = new IShape();
 * 5、类和接口之间的关系是，implements
 * 6、一个类可以实现多个接口class Test implements A,B,C{
 * 7、一个类可以继承类，同时实现多个接口
 *    class Test extends TestAbstract implements A,B,C{
 * 8、接口可以扩展多个接口：interface D extends A,B,C {
 *    所以 接口的出现 就是为了解决java多继承的问题
 */
interface IShape {
    //public static final int age = 100;
    /*default void func() {
        System.out.println("faaafa!");
    }*/
    void draw();
}
class Rect implements IShape{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

public class TestDemo {

    public static void drawMap(IShape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        /*IShape shape = new Rect();
        drawMap(shape);*/
        drawMap(new Rect());
        drawMap(new Circle());

    }
}

