import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class Demo01_12_4 {
    //输出n*n的乘法口诀表，n由用户输入
    public static void main(String[] args) {
        System.out.println("输入一个整数n(1<n<9)");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int j =1;j<=n;j++){
            for(int i = 1;i<=j;i++){
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }

    }
//    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
//    public static void main(String[] args) {
//        System.out.println("输入一个整数");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum =0;
//        while(num>=1){
//            sum=num %10;
//            num/=10;
//            System.out.println(sum);
//        }
//    }
    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
//    public static void main(String[] args) {
//        //首位为奇数位
//        System.out.println("输入一个数字");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int check = 0;
//        odd(num);
//        System.out.println();
//        even(num);
//    }
//    public static void odd(int num) {
//        for (int i = 30; i >= 0; i = i - 2) {
//            if ((num & (1 << i)) != 0) {
//                System.out.print("1 ");
//            } else {
//                System.out.print("0 ");
//            }
//        }
//    }
//    public static void even(int num) {
//        for (int i = 31; i >= 0; i = i - 2) {
//            if ((num & (1 << i)) != 0) {
//                System.out.print("1 ");
//            } else {
//                System.out.print("0 ");
//            }
//        }
//    }
    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
//    public static void main(String[] args) {
//        System.out.println("输入一个数字");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i =0;i<32;i+=2){
//            int n = ((num>>i)|0);
//            System.out.println("奇数位"+n+" ");
//        }
//        for (int j =1;j<32;j+=2){
//            int m = ((num>>j)|0);
//            System.out.println("偶数位"+m+" ");
//        }
//        for (int k =0;k<32;k++){
//            int z = ((num>>k)|0);
//            System.out.println(z);
//        }
//    }
//    //求一个整数，在内存当中存储时，二进制1的个数。进行移位操作
//    public static void main(String[] args) {
//        System.out.println("请输入一个正整数");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int count = 0;
//        for(int i =0;i<32;i++){
//            if(((num>>i)&1)==1){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//    //求两个正整数的最大公约数
//    public static void main(String[] args) {
//        System.out.println("请输入两个正整数");
//        Scanner sc= new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        for(int i = Math.min(num1,num2);i>0;i--){
//            if(num1%i==0&&num2%i==0){
//                System.out.println("最大公约数是"+i);
//                break;
//            }
//        }
//    }
//    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
//    public static void main(String[] args) {
//        //将算式看作两部分 一部分正的，一部分负的转化为正的
//        double sum1 = 0;
//        for(double i =1; i<=99;i+=2){
//            sum1+=(1/i);
//        }
//        double sum2 =0;
//        for(double j =2;j<=100;j+=2){
//            sum2+=(1/j);
//        }
//        System.out.println(sum1-sum2);
//    }
    /**
     * 完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
     *答题
     */
//    public static void main(String[] args) {
//        //生成一个随机数
//        Random r = new Random();
//        int n = r.nextInt(100);
//        //输入你猜的数
//        System.out.println("请输入你猜的数");
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            int a = sc.nextInt();
//            if (a < n) {
//                System.out.println("猜小了");
//            } else if (a > n) {
//                System.out.println("猜大了");
//            } else {
//                System.out.println("猜对了");
//                break;
//            }
//        }
//    }

//    public static void main(String[] args) {
//        //先输出一个正矩阵，然后再通过if判断使其输出x形状
//        System.out.println("请输入一个行数");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int a=1;a<=20;a++){
//            for(int b=n;b>=1;b--){
//                if((a==b) || (a+b==n+1)){
//                    System.out.print("x");
//                }else{
//                    System.out.print(" ");}
//            }System.out.println();
//        }

 //   }

    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
//    public static void main(String[] args) {
//        System.out.println("请输入一个年龄");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age<18){
//            System.out.println("少年");
//        }else if(age>19&&age<28){
//            System.out.println("青年");
//        }else if(age>29&&age<55){
//            System.out.println("中年");
//        }else{
//            System.out.println("老年");
//        }
//    }

    //给定一个数字，判定一个数字是否是素数
//    public static void main(String[] args) {
//        result();
//    }
//    /*判断输入的数字是否为质数*/
//    public static boolean judge(int x){
//
//        if(x==1||x==0){
//            return false;
//        }
//        for(int i=2;i<=Math.sqrt(x);i++){
//            if(x%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    /*结果*/
//    public static void result(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个你想判断的数:");
//        int n = sc.nextInt();
//        if(n>0){
//            if(judge(n)){
//                System.out.println("是素数");
//            }else{
//                System.out.println("不是素数");
//            }
//        }else{
//            System.out.println("请输入一个大于0的数");
//            result();
//        }
//    }
    //打印 1 - 100 之间所有的素数
//    public static void main(String[] args) {
//        int num = 1;
//
//        for(num =1;num<=100;num++){
//            for(int i=2;i<num;i++){
//                if(num%i==0){
//                    break;
//                } if(i==num){
//                    System.out.println(num);
//                }
//            }
//        }
//    }
//    //输出1000 - 2000 之间所有的闰年
//    public static void main(String[] args) {
//        for(int year =1000;year<=2000;year++){
//            if((year%4==0 && year%100!=0)||year%400==0){
//                System.out.println(year);
//            }
//        }
//    }
    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
//    public static void main1(String[] args) {
//        int i = 0;
//        int num = 1;
//        while(i<=100){
//
//            if(i%10 ==9||i/10==9){
//                System.out.println(i+" "+num);
//                num++;
//            }
//            i++;
//
//        }
//        System.out.println("一共有"+num+"个9");
//    }
}
