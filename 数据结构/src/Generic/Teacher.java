package Generic;

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

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    //自然顺序
    @Override
    public int compareTo(Teacher o) {
        return this.age - o.age;
    }

}
