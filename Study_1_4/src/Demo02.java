import java.util.ArrayList;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        myArrayList1.add1(9);
        myArrayList1.add1(19);
        myArrayList1.add1(29);
        myArrayList1.add(3,8888);
        myArrayList1.display();
        myArrayList1.add1(39);
        myArrayList1.display();
        myArrayList1.add1(999);
        myArrayList1.display();
        int c = myArrayList1.size();
        System.out.println("顺序表长度为"+c);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的元素m");
        int x = sc.nextInt();
        boolean a = myArrayList1.contains(x);
        System.out.println(a+"有这个元素");

        System.out.println("请输入你要查询的元素m");
        int m = sc.nextInt();
        int b = myArrayList1.search(m);
        System.out.println(m+"的位置的下标为"+b);

        System.out.println("请输入你要查询的位置");
        int n = sc.nextInt();
        int d = myArrayList1.getPos(n);
        System.out.println(n+"号位置的元素为"+d);
    }
}
