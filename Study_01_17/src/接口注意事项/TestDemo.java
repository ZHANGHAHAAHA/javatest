package 接口注意事项;

interface A {
    void funcA();
}
interface B {
    void funcB();
}
interface C {
    void funcC();
}
//extends:扩展
interface D extends A,B,C{
    void funcD();
}
class F implements D{
    @Override
    public void funcA() {
    }
    @Override
    public void funcD() {
    }
    @Override
    public void funcB() {
    }
    @Override
    public void funcC() {
    }
}



abstract class TestAbstract {
    public abstract void funcAbstract();
}

class Test extends TestAbstract implements A,B,C{
    @Override
    public void funcA() {
    }
    @Override
    public void funcB() {
    }
    @Override
    public void funcC() {
    }
    @Override
    public void funcAbstract() {
    }
}


public class TestDemo {
    public static void main(String[] args) {

    }
}