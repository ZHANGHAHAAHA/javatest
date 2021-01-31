//package 栈和队列;
//
//import java.util.Stack;
//
//public class MyStack {
//    private int [] elem;
//    private int top;//既可以代表下标,当前可以存储元素的下标
//    // 也可以代表有多少元素
//
//    public MyStack() {
//        this.elem = new int[10];
//    }
//    public boolean isFull(){
//        return this.top == this.elem.length;
//    }
//
//    public int push(int item){
//        if (isFull()){
//            return -1;
//        }
//        this.elem[this.top] = item;
//        this.top++;
//        return  this.elem[top-1];
//    }
//    public int pop(){
//        if (empty()){
//            throw new RuntimeException("栈为空");
//        }
//        this.top--;
//        return this.elem[this.top];//弹出栈顶元素并且删除
//    }
//    public int peek(){
//        if (empty()){
//            throw new RuntimeException("栈为空");
//        }
//
//        return this.elem[this.top-1];//拿到栈顶元素不删除
//
//    }
//    public boolean empty(){
//        return this.top ==0;
//
//    }
//    public int size(){
//        return top;
//    }
//
//}
