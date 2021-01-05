class Test{
    public static  void hello(){//有static则hello方法不依赖于任何对象，没有static则编译报错
        System.out.println("hello");
    }

}
public class Demo01 {
        public static void main(String[] args) {
            Test test = null;
            test.hello();
        }
}
