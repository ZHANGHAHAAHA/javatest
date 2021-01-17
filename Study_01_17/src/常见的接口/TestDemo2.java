package 常见的接口;

import java.util.Arrays;



/**
 * 比较器：一般用在类外了
 *
 */
class Student2 {
    public String name;
    public int score;

    public Student2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

}
public class TestDemo2 {

    public static void main(String[] args) {
        Student2[] students = new Student2[3];
        students[0] = new Student2("bit",89);
        students[1] = new Student2("abc",19);
        students[2] = new Student2("htf",59);
        System.out.println(Arrays.toString(students));
        System.out.println("===============根据分数排序==============");
        ScoreComparator scoreComparator = new ScoreComparator();
        Arrays.sort(students,scoreComparator);
        System.out.println(Arrays.toString(students));
        System.out.println("===============根据姓名进行排序==============");
        NameComparator nameComparator = new NameComparator();
        Arrays.sort(students,nameComparator);
        System.out.println(Arrays.toString(students));
    }
}