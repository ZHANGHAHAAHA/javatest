package Demo02;
/***
 * java中提供关于对象的比较，有以下方式
 *
 * 1.equals（）
 * 所有类都具备的能力
 * 理解：比较两个对象代表的是不是一个实际事物
 * 规则：需要覆写 equals 方法达到
 *
 * 2.大小的比较
 * 1.自然顺序 Comparable comparaTo()
 *  不是所有类都具备需要通过实现Comparable接口来表明该类具备这个能力
 *  理解：比较this和传入的引用指向的对象
 *
 *  2.外部比较（比较器）Comparator————构造一个天平
 *      不需要比较的类具备Comparable的能力
 *    理解：比较 传入的两个引用指向的对象
 */

import java.util.Comparator;//因为有些功能Comparable无法完成
class ByWeightComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.weight - o2.weight;
    }
}

class ByHeightComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.height - o2.height;
    }
}

class ComparatorDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("gaobo",18,190,80);
        Teacher t2 = new Teacher("chenpeixin",38,170,180);
        Comparator<Teacher> byHeight = new ByHeightComparator();
        Comparator<Teacher> byWeight = new ByWeightComparator();
        int ret ;
        //按照自然顺序（年龄比较）
        ret =t1.compareTo(t2);
        System.out.println(ret);
        ret = byHeight.compare(t1,t2);
        System.out.println(ret);
        ret = byWeight.compare(t1,t2);
        System.out.println(ret);
    }
}
