package Demo03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo03Work {
    public static void main(String[] args) {//数一下1-100的所有整数中出现多少个数字9
        //(1-10)
        int i = 1;
        int count = 0;
        while (i < 100) {
            if (i % 10 == 9) {
                count++;
            }else if(i/10==9){
                count++;
            }
            i++;//一定要有步进表达式
        }
        System.out.println(count);
    }
    public static void main7(String[] args) {//输出一个整数的每一位
        //键盘输入一个整数
        System.out.println("输入一个整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //循环输出这个数的每一位数
        while(num != 0){
            int ret = num % 10;
            num = num / 10;
            System.out.println(ret);
            }

        }


    public static void main6(String[] args) {//猜数字游戏
        Random r = new Random();
        int random = r.nextInt(100);
        System.out.println("请输入你猜的数字");
        Scanner sc = new Scanner(System.in);

        while(true){
            int guess = sc.nextInt();
            if(guess<random){
                System.out.println("猜小了");
            }else if(guess > random){
                System.out.println("猜大了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }

    public static void main5(String[] args) {//乘法口诀
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j+"*"+ i +"="+i*j+" ");
            }
            System.out.println( );

        }
    }
    public static void main4(String[] args) {//输出1000-2000之间的所有素数

        for(int year = 1000;year<=2000;year ++){
            if(year %4==0 && year % 100!=0 ||year%400 == 0){
                System.out.println(year);
            }
        }

    }
    public static void main3(String[] args) {//打印1-100之间所有的素数
        for (int n = 2; n < 100; n++) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + " ");
            }
        }
    }

    public static void main2(String[] args) {//判定一数字是不是素数
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2 ; i < n ; i++){
            if(n % i==0){
                System.out.println("不是素数");
            }else{
                System.out.println("是素数");
            }
            break;
        }
    }
    public static void main1(String[] args) {//根据年龄 打印出当前年龄的人是少年（<18） 青年（19-28） 中年（29-55） 老年（>56）
        System.out.println("请输入年龄");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age <=18){

            System.out.println("少年");

        }else if(age > 19 && age <= 28){

            System.out.println("青年");

        }else if(age <= 55 && age >29){

            System.out.println("中年");

        }else{

            System.out.println("老年");

        }
    }
}
