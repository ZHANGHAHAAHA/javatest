import java.util.Arrays;

public class Demo01_12_9 {
    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main(String[] args) {
        int [] arr = new int[100];

        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i] = i+1;
        }

        String str = Arrays.toString(arr);
        System.out.println(str);
    }
    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
//    public static void main(String[] args) {
//        int []arr = {1,2,3,4,5};
//        printfArray(arr);
//    }
//    public static void printfArray(int [] a){
//        for (int i = 0; i < a.length; i++) {
//            if(i==0){
//                System.out.print("[");
//            }else{
//                System.out.print(a[i-1]+",");
//            }
//            if(i==a.length-1){
//                System.out.print(a[a.length-1]+"]");
//            }
//        }
//    }
    /**
     * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
     * 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
     */
//    public static void main(String[] args) {
//        int []arr = {1,2,3,4,5};
//        int [] ret = transForm(arr);
//        //printArr(ret);
//       String str =  Arrays.toString(ret);
//        System.out.println(str);
//    }
////    public static void printArr(int [] b){
////        for (int i = 0; i <b.length ; i++) {
////            System.out.println(b[i]);
////        }
////    }
//    public static int[] transForm(int []a){
//        int [] ret = new int [a.length];
//        for (int i = 0; i <a.length ; i++) {
//            ret[i] = a[i]*2;
//        }
//        return ret;
//    }
    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
//    public static void main(String[] args) {
//        int []arr = {1,2,3,4,5};
//        int ret = sumAdd(arr);
//        System.out.println(ret);
//    }
//
//    public static int sumAdd(int[] a) {
//        int ret = 0;
//        for (int i = 0; i < a.length; i++) {
//            ret+=a[i];
//        }
//        return ret;
//    }
    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4};
//        int ret  = avgNum(arr);
//        System.out.println(ret);
//    }
//    public static int avgNum(int [] a){
//        int  ret = 0;
//        for (int i = 0; i <a.length ; i++) {
//            ret += a[i];
//        }
//        return  ret/a.length;
//    }
}
