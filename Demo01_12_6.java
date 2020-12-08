import java.util.Scanner;

public class Demo01_12_6 {
    //递归求 N 的阶乘
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(numAdd(num));
    }
    public static int numAdd(int n){
        if(n==1){
            return 1;
        }
        return n*numAdd(n-1);
    }
    //递归求 1 + 2 + 3 + ... + 10
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(numAdd(num));
//    }
//    public static int numAdd(int n){
//
//        if(n == 1){
//             return 1;
//        }
//        return n + numAdd(n-1);
//    }
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        printNum(num);
//    }
//    public static void printNum(int n){
//
//            if(n>9){
//                printNum(n/10);
//            }
//            System.out.println(n%10);
//
//    }
    //递归求斐波那契数列的第 N 项
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        System.out.println(fib(num));
//    }
//    public static int fib(int num) {
//        //斐波那契数列前两项都为 1
//        if (num == 1 || num == 2) {
//            return 1;
//        }
//        return fib(num - 1) + fib(num - 2);
//    }
    //递归求解汉诺塔问题
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        ht(n,'a','b','c');
//        sc.close();
//    }
//    public static void ht(int n,char a,char b,char c){
//        if(n==1){
//            System.out.println(a+"->"+c);
//        }else{
//            ht(n-1,a,c,b);
//            System.out.println(a+"->"+c);
//            ht(n-1,b,a,c);
//        }
//    }
//    //青蛙跳台阶
//    public static void main(String[] args) {
//        System.out.println("输入台阶数");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(numWays(n));
//    }
//    public static int numWays(int n) {
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        else{
//            return numWays(n-1)+numWays(n-2);
//        }
//    }
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
//    public static void main(String[] args) {
//        System.out.println("输入数字");
//        Scanner sc =new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println(numAdd(x, y));
//        double z = sc.nextDouble();
//        double m = sc.nextDouble();
//        double n = sc.nextDouble();
//        System.out.println(numAdd(m,n,z));
//    }
//    public static double  numAdd(double x,double y,double z){
//        return x+y+z;
//    }
//    public static int numAdd(int x,int y){
//        return x+y;
//    }
    /**
     * 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
     * @param args
     */
//    public static void main(String[] args) {
//
//    }
//    public static int numMax(int m,int n){
//        return m>n?m:n;
//    }
//    public static double numMax(double x,double y){
//        return y>x?y:x;
//    }
//    public static  float numMax(int x,float y,float z){
//
//        }
//    }
    //
//    public static int max1(int num1, int num2) {
//        return num1 >= num2 ? num1 : num2;
//
//    }
//    public static  int max2(int num1, int num2,int num3){
//        return max1(max1(num1, num2),num3);
//    }
//
//    public static void main6(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int n3 =scanner.nextInt();
//        int ret = max2(n1,n2,n3);
//        System.out.println(ret);
//    }
    /**
     * 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
     *
     * ​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
     * @param args
     */
//    public static void main5(String[] args) {
//        System.out.println("输入几个数");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int h = sc.nextInt();
//        System.out.println(threeMax(h,m,n));
//    }
//    public static int threeMax(int h,int m,int n){
//        return numMax(numMax(m,n),h);
//    }
//    public static int numMax(int m,int n){
//        return m>n?m:n;
//        int max = m;
//        if(m<n){
//            max = n;
//        }
//        return max;
  //  }
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//    public static void main4(String[] args) {
//        int [] arr = {1,2,3,4,5};
//        for (int i = 0; i < 5; i++) {
//            for (int j = i + 1; j < 5; j++) {
//                if (arr[j] % 2 != 0) {
//                    int tmp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = tmp;
//                }
//            }
//        }
//        for (int i1 = 0; i1 < 5; i1++) {
//            System.out.println(arr[i1]);
//        }
//
//    }
    //求1！+2！+3！+4！+........+n!的和

    //求斐波那契数列的第n项。(迭代实现)
//    public static void main2(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=Feibo(n);
//        System.out.println("sum="+sum);
//        sc.close();
//    }public static int Feibo(int n){
//        int sum=0;
//        if(n==1||n==2){
//            sum=n;
//        }
//        int a=1;
//        int b=1;
//        for(int i=3;i<=n;i++){
//            sum=a+b;
//            a=b;
//            b=sum;
//        }
//        return sum;
//    }
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
//    public static void main1(String[] args) {
//        int arr[] = {1,1,2,2,3,4,4,5};
//        int i , j ;
//        for ( i = 0; i < 8; i++) {
//            int count =0;
//            for ( j = 0; j < 8; j++) {
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if (count ==1){
//                System.out.println(arr[i]);
//            }
//        }
//
//    }
}
