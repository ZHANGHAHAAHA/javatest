package 集合框架;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //泛型
        collection.add(1);
        collection.add("ada");
        System.out.println(collection);//重写了tostring方法
        Map<String,String> map = new HashMap<>();
        map.put("玄奘","唐增");
        String ret = map.get("玄奘");
    }
}
