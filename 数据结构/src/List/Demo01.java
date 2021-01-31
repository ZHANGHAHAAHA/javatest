package List;

import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;

import java.lang.reflect.Array;

class MyArrayList{
    public Object [] elem;
    public int useSize;

    public MyArrayList(int useSize) {
        this.useSize = useSize;
    }
}

public class Demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if (a == b){
            System.out.println("true");
        }
    }
}
