package Demo02;

class  Teacher implements Comparable<Teacher>{
    String name;
    int age;
    int height;
    int weight;

    public Teacher(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
        //自然顺序
    @Override
    public int compareTo(Teacher o) {
        return this.age - o.age;
    }

}
public class ComparableDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("gaobo",18,190,80);
        Teacher t2 = new Teacher("chenpeixin",38,170,180);
        int ret = t1.compareTo(t2);
        if (ret < 0 ){
            System.out.println("G 小于 C");
        }else if (ret == 0){
            System.out.println("G 等于 C");
        }else {
            System.out.println("G 大于 C");
        }
    }

}
