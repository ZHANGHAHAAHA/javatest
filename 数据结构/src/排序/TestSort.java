package 排序;

public class TestSort {
    /**
     * 稳定的排序
     * 时间复杂度 O（n*n） 最坏的情况 无序   最好O（n）
     * 结论 越有序 越快
     * 出现大部分有序的情况下 直接选择插入排序
     *
     * */
    public static void insertSort(int []array){
        for (int i = 0; i <array.length ; i++) {
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
    public static void main(String[] args) {

    }
}
