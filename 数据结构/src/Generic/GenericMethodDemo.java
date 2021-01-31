package Generic;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 泛型
 */
public class GenericMethodDemo {
    public static void bubbleSort(int [] array){
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    public static<T> void bubbleSort(T [] array, Comparator<T> comparator) {
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {
                //T实际上是什么类型
                int ret = comparator.compare(array[j],array[j+1]);//我不关心排序的依据
                if (ret>0){
                    T tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }

        }
    }
    public static void main(String[] args) {
        {
            int [] a = {1,8,9,5,6};
            bubbleSort(a);
            System.out.println(Arrays.toString(a));
        }
        Teacher [] teachers = {
                new Teacher("A",1,170,100),
                new Teacher("B",2,180,120),
                new Teacher("C",0,190,140),
        };
        System.out.println(Arrays.toString(teachers));
        //创建比较器
        Comparator<Teacher> byAge = new TeacherByAgeComparator();
        Comparator<Teacher> byHeight = new TeacherByHeightComparator();
        Comparator<Teacher>byName = new TeacherByNameComparator();


        //完整写法：传入 Teacher，表示方法定义时T就是Teacher类型
        GenericMethodDemo.<Teacher>bubbleSort(teachers,byAge);
        System.out.println(Arrays.toString(teachers));

        //编译器有能力算出来，这里T就是Teacher类型
        GenericMethodDemo.bubbleSort(teachers,byHeight);
        System.out.println(Arrays.toString(teachers));

        //因为在本类中调用，所以类名也省略
        bubbleSort(teachers,byName);
        System.out.println(Arrays.toString(teachers));

//        {  
//            Student [] student = new Student[10];
//            GenericMethodDemo.bubbleSort(student,byAge);
//        }
    }

}


