package 栈和队列;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> qu1 = new LinkedList<>();

    private Queue<Integer> qu2 = new LinkedList<>();


    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        //谁不为空入到哪个队列当中
        if (qu1.isEmpty()){
            qu1.offer(x);
        }else if(!qu2.isEmpty()){
            qu2.offer(x);
        }else{
            qu1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        //每次出不为空的队列，出size-1个 到另外一个为空的队列，最后弹出剩余的那一个元素
        if (empty()){
            return -1;
        }
        if (!qu1.isEmpty()){
            int size = qu1.size();
            for (int i = 0; i <size-1 ; i++) {
                qu2.offer(qu1.poll());
            }
            return  qu1.poll();
        }else {
            return qu2.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return true;
    }
}

public class Topic {
    public static void main(String[] args) {

    }
}
