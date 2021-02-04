package day_02_02;

import java.util.Arrays;

/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * */
public class Demo01 {
    public static void main(String[] args) {
        int [] array = {2,0,2,1,1,0};
        sortColors(array);

        System.out.println(Arrays.toString(array));
    }
    public static void sortColors(int[] array) {
        for (int i = 1; i <array.length ; i++) {
            int tmp = array[i];
            int j = i-1;

            for (; j >=0 ; j--) {
                //如果这里是>=  那就是不稳定排序
                if (array[j]>tmp){
                    array[j+1] = array[j];
                }else {
                    array[j+1] = tmp;
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
}
