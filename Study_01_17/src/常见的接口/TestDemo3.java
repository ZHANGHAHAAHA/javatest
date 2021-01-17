package 常见的接口;

/**
 * 1、如何拷贝对象？？
 *
 */
class Money implements Cloneable{
    public double money = 12.8;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public String name;

    public Money m = new Money();

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person2 = (Person)super.clone();
        person2.m = (Money) this.m.clone();
        return person2;
        //return super.clone();
    }
}
public class TestDemo3 {


    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("bit");
        Person person2 = (Person)person1.clone();

        System.out.println(person1.m.money);
        System.out.println(person2.m.money);

        System.out.println("============修改name============");
        person2.m.money = 99.99;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }



    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("bit");
        Person person2 = (Person)person1.clone();
        System.out.println(person1.name);//bit
        System.out.println(person2.name);//bit

        System.out.println("============修改name============");
        person2.name = "gaobo";
        System.out.println(person1.name);//bit
        System.out.println(person2.name);//gaobo

    }
}
