package day_02_01;

import java.util.Comparator;

class Student{
    public String name;
    public int score;

    public Student(String name,int score){
        this.score = score;
        this.name = name;
    }

}
public class TestDemo {
    public static void main(String[] args) {
        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));
    }
}
