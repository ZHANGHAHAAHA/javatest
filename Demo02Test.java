package Demo01;

public class Demo02Test {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 0;
        System.out.println(a/b);//  Artithmet exception 数字异常
        //在运行时候发生异常 叫做运行时期异常  非受查异常
        //
                             编译时期异常   受查异常
         */
        System.out.println(5/2);//2
        System.out.println(5/2.0);//2.5
        System.out.println((float)5/2);//;2 ??2.5
        System.out.println(5/(float)2);//2.5
        System.out.println((float)(5/2));//2
        /* java中的%运算都可以采用这个公式   a%b = a - (a/b)*b   */
        System.out.println(10%3);//1
        System.out.println(10%-3);//?? 1
        System.out.println(-10%3);//?? --1
        System.out.println(-10%-3);//?? -1
        System.out.println(10.5%2.0);//0.5
        /* c语言中是11 java中是10 */
//          int i =10;
////        i=i++;
////        System.out.println(i);
        /*逻辑运算符*/
        int a =10;
        int b =20;
        System.out.println(a==b);//没有1或者0之说 只有true或者false
//        System.out.println(!a);Java中是错误的 ！只能用于true或者false的布尔表达式
        System.out.println(!true);

        /*位运算符  注意每一个运算符的特性*/ 


    }
}
