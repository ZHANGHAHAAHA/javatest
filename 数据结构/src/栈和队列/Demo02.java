package 栈和队列;

import java.util.LinkedList;
import java.util.Queue;

public class Demo02 {
    public static void main(String[] args) {
        //此时queue就是普通的队列
        Queue<Integer> queue = new LinkedList<>();
        //入队默认尾入
        queue.add(1);
        //默认都是队尾入，满队列时add会抛出异常。offer只会返回true或者false。offer用得较多
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.peek());//只取不删除
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        //定义LinkList可以调用addLast，queue接口没有这个fangfa
        LinkedList<String> linkedList = new LinkedList<>();
    }
}
