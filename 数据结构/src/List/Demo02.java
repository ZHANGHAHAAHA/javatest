package List;
/**
 * 装箱拆箱
 * 包装类作用：
 * */
public class Demo02 {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        System.out.println(a==b);
    }
    public static void main2(String[] args) {
        Integer i= 10;
        int a = i;//自动拆箱
        System.out.println(a);
        int a2 = i.intValue();//显示拆箱
        double a3 = i.doubleValue();//拆成不同类型
    }
    public static void main1(String[] args) {
        int a = 10;
        Integer integer1 = new Integer(10);//显示装箱1
        Integer integer2 = Integer.valueOf(10);//显示装箱2
        Integer integer3 = a;//隐式装箱

        /* **********************/


    }
}
