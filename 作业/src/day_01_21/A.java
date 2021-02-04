package day_01_21;

public class A<T> {
    T value;

    public A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    public static void main(String[] args) {
        A<String> t = new A<>("a");
        System.out.println(t.get());
    }
}

