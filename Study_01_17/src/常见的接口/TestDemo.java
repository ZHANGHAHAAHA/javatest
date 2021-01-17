package 常见的接口;

import java.util.Arrays;

/**
 * 对于 Comparable接口来说  一般是用在类的内部的
 *
 */
class Student implements Comparable<Student>{
    public String name;
    public int score;

    public Student(String name, int score) {
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


    @Override
    public int compareTo(Student o) {
        if(this.score > o.score) {
            return 1;
        }else if(this.score == o.score) {
            return 0;
        }else {
            return -1;
        }
    }
}
public class TestDemo {

    public static void main1(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("bit",89);
        students[1] = new Student("abc",19);
        students[2] = new Student("htf",59);
        //students[0] 和 students[2]
        System.out.println(students[0].compareTo(students[2]));

    }
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("bit",89);
        students[1] = new Student("abc",19);
        students[2] = new Student("htf",59);
        System.out.println(Arrays.toString(students));
        System.out.println("===============排序==============");
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}