package 栈和队列;

import java.util.Stack;

class MinStack {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        s1.push(x);
        if (minStack.empty()){
            minStack.push(x);
        }else {
            if (x<=minStack.peek()){
                minStack.push(x);
            }
        }
    }

    public void pop() {
        int x= s1.pop();
        if (x==minStack.peek()){
            minStack.pop();
        }
    }
//这个和最小栈没关系
    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

public class Topic3 {
}
