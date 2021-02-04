package day_02_01;

public class TestDemo02 {
    public String name="abc";
    public static void main(String[] args){
        TestDemo02 test=new TestDemo02();
        TestDemo02 testB=new TestDemo02();
        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));
    }
}
