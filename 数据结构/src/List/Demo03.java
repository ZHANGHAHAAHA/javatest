package List;

import java.util.ArrayList;
import java.util.List;

/*
* List的使用
* */
public class Demo03 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        /*
        * 底层是数组，每次放在数组的最后
        * */
        list.add(0,1);
        System.out.println(list);
    }
}
