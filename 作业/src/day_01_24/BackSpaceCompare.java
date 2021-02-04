package day_01_24;

/*
* 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。

注意：如果对空文本输入退格字符，文本继续为空。

* */

import java.util.Stack;

public class BackSpaceCompare {
    public static boolean backspaceCompare(String S, String T) {
        return compute(S).equals(compute(T));
    }
    private static Stack<Character> compute(String s){
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                stack.push(c);
            }else{
                if(!stack.isEmpty())
                    stack.pop();
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        String S = "a#b#c";
        String T= "a##bc";
        Boolean ret = backspaceCompare( S,  T);
        System.out.println(ret);
    }
}
