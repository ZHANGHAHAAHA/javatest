package Demo01;

public class Demo01Test {
    public static void main(String[] args) {
        /*int a =10;
        String str = a+"";
        System.out.println(str);
         String str2 = String.valueOf(a);
        System.out.println(str2);

        /*字符串转换成整型*/

       /* String num = "123";
        int ret = Integer.parseInt(num);
        System.out.println(ret);
        /*变量在定义后如果要使用一定要初始化否则会报错*/
        //int a;
        /*System.out.println(a);
    }
    public static void main4(String[] args) {
        //各种数据类型的大小 范围 字节整理
        /* 整型提升 */
        /*int a =1;
        long b =10;
        int c =(int)(a+b);//发生类型提升   把小类型提升为大类型  a被提升为long类型   最后为两个long类型运算
        System.out.println(c);*/
        /*byte a = 10;
        byte b = 20;
        byte c = （byte）a+b;//byte是一个字节 CPU处理数据是四个字节  所以规定不满四个字节的都会整型提升 （浪费空间换取时间）
        System.out.println(c);
    }
    public static void main3(String[] args) {
        //java的安全性 类型转换    把大类型赋给小类型一定要强转
        int a =10;
        long b =20;
        a=(int)b;
        System.out.println(a);
        /* *************************** */
        /*int c = 1;
        boolean fla = true;
       // a = (int) fla;//boolen 和其他类型之间都是不能相互转换的
        System.out.println(a);
    }
    /**
     * 讲解常量
     * @param args  运行时参数
     */
    /*public static void main2(String[] args) {
        int a=30;//变量是在运行期间可以改变的  只有在运行期间才能知道它的值
        a = 80;
        int c =a + 20;
        System.out.println(c);
       /* ******************************** */
       /* final int b =20;//常量 （局部）在编译期间就可以知道它的值  在运行期间不可以改变
        //b=10;//无法为最终变量b分配值
        int d =b+10;
        System.out.println(d);*/
    }

}
